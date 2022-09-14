package br.com.bb.aqt.listeners;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.infinispan.client.hotrod.RemoteCache;
import org.infinispan.client.hotrod.RemoteCacheManager;
import org.infinispan.client.hotrod.configuration.ConfigurationBuilder;
import org.infinispan.client.hotrod.impl.ConfigurationProperties;
import org.infinispan.client.hotrod.impl.operations.RemoveClientListenerOperation;

import br.com.bb.aqt.cache.CustomCacheManager;
import br.com.bb.aqt.models.EventoListenerModel;
import io.quarkus.logging.Log;
import io.quarkus.vertx.ConsumeEvent;
import io.vertx.core.eventbus.EventBus;

@ApplicationScoped
public class EventBusListener {

    private static final String INFINISPAN_URL = "{{quarkus.infinispan-client.server-url}}";
    private static final String INFINISPAN_USER_NAME = "{{quarkus.infinispan-client.auth-username}}";
    private static final String INFINISPAN_PASSWORD = "{{quarkus.infinispan-client.auth-password}}";
    private static final String INFINISPAN_CACHE_NAME = "{{quarkus.infinispan-client.cache-name}}";
    private static final String INFINISPAN_METRICS_CACHE_NAME = "{{quarkus.infinispan-client.metrics-cache-name}}";

    @Inject
    EventBus bus;

    private static RemoteCache<Long, String> clienteCache = new CustomCacheManager<Long, String>("localhost", "admin",
            "password", "cliente").getRemoteCache();
    private static RemoteCache<Long, Long> clienteMetricsCache = new CustomCacheManager<Long, Long>("localhost",
            "admin", "password",
            "cliente-metrics").getRemoteCache();

    // private static RemoteCache<Long, String> clienteCache = new CustomCacheManager<Long, String>(INFINISPAN_URL,
    //         INFINISPAN_USER_NAME,
    //         INFINISPAN_PASSWORD, INFINISPAN_CACHE_NAME).getRemoteCache();
    // private static RemoteCache<Long, Long> clienteMetricsCache = new CustomCacheManager<Long, Long>("localhost",
    //         "admin", "password",
    //         INFINISPAN_METRICS_CACHE_NAME).getRemoteCache();

    @ConsumeEvent("cliente-novo")
    public void trataClienteNovo(EventoListenerModel ev) {

        String value = clienteCache.get(ev.getCHAVE());

        Log.warn(ev.getCHAVE() + " " + ev.getREGTIMESTAMP() + " " + value);

        clienteMetricsCache.put(ev.getCHAVE(), ev.getREGTIMESTAMP());
    }

    @ConsumeEvent("cliente-modificado")
    public void trataClienteAlterado(EventoListenerModel ev) {
        String value = clienteCache.get(ev.getCHAVE());

        Log.warn(ev.getCHAVE() + " " + ev.getREGTIMESTAMP() + " " + value);

        clienteMetricsCache.put(ev.getCHAVE(),ev.getREGTIMESTAMP());
    }

    @ConsumeEvent("cliente-removido")
    public void trataClienteRemovido(EventoListenerModel ev) {
        Log.warn(ev.getCHAVE()+ " " + ev.getREGTIMESTAMP());
    }

}
