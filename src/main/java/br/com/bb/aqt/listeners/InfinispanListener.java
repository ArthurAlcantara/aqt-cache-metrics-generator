package br.com.bb.aqt.listeners;

import java.time.LocalDateTime;
import java.time.ZoneId;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.infinispan.client.hotrod.annotation.ClientCacheEntryCreated;
import org.infinispan.client.hotrod.annotation.ClientCacheEntryModified;
import org.infinispan.client.hotrod.annotation.ClientCacheEntryRemoved;
import org.infinispan.client.hotrod.annotation.ClientListener;
import org.infinispan.client.hotrod.event.ClientCacheEntryCreatedEvent;
import org.infinispan.client.hotrod.event.ClientCacheEntryModifiedEvent;
import org.infinispan.client.hotrod.event.ClientCacheEntryRemovedEvent;

import br.com.bb.aqt.models.EventoListenerModel;
import io.quarkus.logging.Log;
import io.vertx.core.eventbus.EventBus;


@ClientListener
public class InfinispanListener {

    @Inject
    EventBus evBus;

    @ClientCacheEntryCreated
    public void entryCreated(ClientCacheEntryCreatedEvent<Long> event) {
        Log.warn(event);
        Log.warn(String.format("[LOG] Criado Elemento, Chave: %s - Timestamp: %s", event.getKey(),
                LocalDateTime.now().atZone(ZoneId.of("America/Sao_Paulo")).toInstant().toEpochMilli()));
        evBus.send("cliente-novo", new EventoListenerModel(event.getKey(),
                LocalDateTime.now().atZone(ZoneId.of("America/Sao_Paulo")).toInstant().toEpochMilli()));
    }

    @ClientCacheEntryModified
    public void entryModified(ClientCacheEntryModifiedEvent<Long> event) {
        Log.warn(event);
        Log.warn(String.format("[LOG] Alterado Elemento, Chave: %s - Timestamp: %s", event.getKey(),
                LocalDateTime.now().atZone(ZoneId.of("America/Sao_Paulo")).toInstant().toEpochMilli()));
        evBus.send("cliente-modificado", new EventoListenerModel(event.getKey(),
                LocalDateTime.now().atZone(ZoneId.of("America/Sao_Paulo")).toInstant().toEpochMilli()));
    }

    @ClientCacheEntryRemoved
    public void entryRemoved(ClientCacheEntryRemovedEvent<Long> event) {
        Log.warn(event);
        Log.warn(String.format("[LOG] Alterado Elemento, Chave: %s - Timestamp: %s", event.getKey(),
                LocalDateTime.now().atZone(ZoneId.of("America/Sao_Paulo")).toInstant().toEpochMilli()));
        evBus.send("cliente-removido", new EventoListenerModel(event.getKey(),
                LocalDateTime.now().atZone(ZoneId.of("America/Sao_Paulo")).toInstant().toEpochMilli()));
    }

}
