package br.com.bb.aqt.models;

import java.io.UncheckedIOException;

import org.infinispan.protostream.BaseMarshaller;
import org.infinispan.protostream.SerializationContext;
import org.infinispan.protostream.annotations.AutoProtoSchemaBuilder;

import br.com.bb.aqt.marshallers.AuthorMarshaller;

//@AutoProtoSchemaBuilder(includeClasses = { CliDatagridCDC.class, EventoListenerModel.class }, schemaPackageName = "METRICS")
public class ListenerSchemaImpl implements ListenerChema {

    @Override
    public String getProtoFileName() {
        return null;
    }

    @Override
    public String getProtoFile() throws UncheckedIOException {
        return null;
    }

    @Override
    public void registerSchema(SerializationContext serCtx) {
    }

    @Override
    public void registerMarshallers(SerializationContext serCtx) {
        serCtx.registerMarshaller(new AuthorMarshaller());
    }
    
}
