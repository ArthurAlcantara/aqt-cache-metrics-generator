package br.com.bb.aqt.models;

import javax.enterprise.event.Event;

import org.infinispan.protostream.annotations.ProtoDoc;
import org.infinispan.protostream.annotations.ProtoFactory;
import org.infinispan.protostream.annotations.ProtoField;

import io.quarkus.runtime.annotations.RegisterForReflection;

@ProtoDoc("@Indexed")
@RegisterForReflection
public class EventoListenerModel {

    Long CHAVE;
    Long REGTIMESTAMP;

    public EventoListenerModel() {
    }

    @ProtoFactory
    public EventoListenerModel(Long cHAVE, Long rEGTIMESTAMP) {
        CHAVE = cHAVE;
        REGTIMESTAMP = rEGTIMESTAMP;
    }

    @ProtoField(1)
    public Long getCHAVE() {
        return CHAVE;
    }

    public void setCHAVE(Long cHAVE) {
        CHAVE = cHAVE;
    }

    @ProtoField(2)
    public Long getREGTIMESTAMP() {
        return REGTIMESTAMP;
    }

    public void setREGTIMESTAMP(Long rEGTIMESTAMP) {
        REGTIMESTAMP = rEGTIMESTAMP;
    }

}
