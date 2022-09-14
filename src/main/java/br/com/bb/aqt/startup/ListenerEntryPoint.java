package br.com.bb.aqt.startup;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

import org.infinispan.client.hotrod.RemoteCache;
import org.infinispan.client.hotrod.RemoteCacheManager;
import org.infinispan.client.hotrod.annotation.ClientCacheEntryCreated;
import org.infinispan.client.hotrod.annotation.ClientCacheEntryModified;
import org.infinispan.client.hotrod.annotation.ClientCacheEntryRemoved;
import org.infinispan.client.hotrod.annotation.ClientListener;
import org.infinispan.client.hotrod.configuration.ClientIntelligence;
import org.infinispan.client.hotrod.configuration.ConfigurationBuilder;
import org.infinispan.client.hotrod.event.ClientCacheEntryCreatedEvent;
import org.infinispan.client.hotrod.event.ClientCacheEntryModifiedEvent;
import org.infinispan.client.hotrod.event.ClientCacheEntryRemovedEvent;
import org.infinispan.client.hotrod.impl.ConfigurationProperties;

import br.com.bb.aqt.cache.CustomCacheManager;
import br.com.bb.aqt.listeners.InfinispanListener;
import br.com.bb.aqt.models.ListenerChema;
import br.com.bb.aqt.models.EventoListenerModel;
import io.quarkus.logging.Log;
import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import io.vertx.core.eventbus.EventBus;

@ApplicationScoped
public class ListenerEntryPoint {

    private static final String INFINISPAN_URL = "{{quarkus.infinispan-client.server-url}}";
    private static final String INFINISPAN_USER_NAME = "{{quarkus.infinispan-client.auth-username}}";
    private static final String INFINISPAN_PASSWORD = "{{quarkus.infinispan-client.auth-password}}";
    private static final String INFINISPAN_CACHE_NAME = "{{quarkus.infinispan-client.cache-name}}";

    //Local
    private static RemoteCache<Long, String> remoteCache = new CustomCacheManager<Long, String>("localhost", "admin",
            "password", "cliente").getRemoteCache();
    //Openshift        
    // private static RemoteCache<Long, String> remoteCache = new CustomCacheManager<Long, String>(INFINISPAN_URL, INFINISPAN_USER_NAME,
    //         INFINISPAN_PASSWORD, INFINISPAN_CACHE_NAME).getRemoteCache();

    private final InfinispanClientListener listener = new InfinispanClientListener();

    @Inject
    EventBus evBus;

    void onStart(@Observes StartupEvent ev) {
    //     GlobalConfigurationBuilder builder = new GlobalConfigurationBuilder();
    //     builder.serialization()
    //    .addContextInitializers(new LibraryInitializerImpl(), new SCIImpl());
        Log.warn("APLICAÇÂO INICIADA");
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1,
                1, 0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>());

        executor.execute(() -> {
            remoteCache.addClientListener(listener);
            remoteCache.put(123456l, "teste 123");
        });
    }

    void onStop(@Observes ShutdownEvent ev) {
        remoteCache.removeClientListener(listener);
        Log.warn("APLICAÇÂO Finalizada");
    }

    @ClientListener
    public class InfinispanClientListener {
        @ClientCacheEntryCreated
        public void entryCreated(ClientCacheEntryCreatedEvent<Long> event) {
            Log.warn(event);
            Long x = event.getKey();
            Log.warn(String.format("[LOG] Criado Elemento, Chave: %s - Timestamp: %s", event.getKey(),
                    LocalDateTime.now().atZone(ZoneId.of("America/Sao_Paulo")).toInstant().toEpochMilli()));
            evBus.send("cliente-novo", new EventoListenerModel(x,
                    LocalDateTime.now().atZone(ZoneId.of("America/Sao_Paulo")).toInstant().toEpochMilli()));
        }

        @ClientCacheEntryModified
        public void entryModified(ClientCacheEntryModifiedEvent<Long> event) {
            Log.warn(event);
            Long x = event.getKey();
            Log.warn(String.format("[LOG] Alterado Elemento, Chave: %s - Timestamp: %s", event.getKey(),
                    LocalDateTime.now().atZone(ZoneId.of("America/Sao_Paulo")).toInstant().toEpochMilli()));
            evBus.send("cliente-modificado", new EventoListenerModel(x,
                    LocalDateTime.now().atZone(ZoneId.of("America/Sao_Paulo")).toInstant().toEpochMilli()));
        }

        @ClientCacheEntryRemoved
        public void entryRemoved(ClientCacheEntryRemovedEvent<Long> event) {
            Log.warn(event);
            Long x = event.getKey();
            Log.warn(String.format("[LOG] Elemento Removido, Chave: %s - Timestamp: %s", event.getKey(),
                    LocalDateTime.now().atZone(ZoneId.of("America/Sao_Paulo")).toInstant().toEpochMilli()));
            evBus.send("cliente-removido", new EventoListenerModel(x,
                    LocalDateTime.now().atZone(ZoneId.of("America/Sao_Paulo")).toInstant().toEpochMilli()));
        }

    }
}
