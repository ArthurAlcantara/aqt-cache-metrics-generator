package br.com.bb.aqt.cache;

import java.io.IOException;

import org.infinispan.client.hotrod.RemoteCache;
import org.infinispan.client.hotrod.RemoteCacheManager;
import org.infinispan.client.hotrod.configuration.ConfigurationBuilder;
import org.infinispan.client.hotrod.impl.ConfigurationProperties;
import org.infinispan.protostream.SerializationContext;

import br.com.bb.aqt.models.EventoListenerModel;
import br.com.bb.aqt.models.ListenerSchemaImpl;

public class CustomCacheManager<K, V> {

    private final ConfigurationBuilder remoteCachebuilder = new ConfigurationBuilder();
    private RemoteCacheManager cacheManager;
    private RemoteCache<K, V> remoteCache;

    public CustomCacheManager(String cacheUrl, String cacheUserName, String cachePassword, String cacheName) {
        //remoteCachebuilder.marshaller(new ProtoStreamMarshaller());

        remoteCachebuilder.addServer()
        .host(cacheUrl)
        .port(ConfigurationProperties.DEFAULT_HOTROD_PORT)
        .addContextInitializer(new ListenerSchemaImpl())
        .security()
        .authentication()
        .enable()
        .saslMechanism("DIGEST-MD5")
        .username(cacheUserName)
        .password(cachePassword);

        remoteCachebuilder.remoteCache(cacheUserName);
        this.cacheManager = new RemoteCacheManager(remoteCachebuilder.build());
        this.remoteCache = cacheManager.getCache(cacheName);
    }

    public RemoteCache<K,V> getRemoteCache(){
        return this.remoteCache;
    }
}
