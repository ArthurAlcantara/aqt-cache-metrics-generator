/*
 Generated by org.infinispan.protostream.annotations.impl.processor.MarshallerSourceCodeGenerator
 for class br.com.bb.aqt.models.EventoListenerModel
*/

package br.com.bb.aqt.models;

import br.com.bb.aqt.models.EventoListenerModel;

/**
 * WARNING: Generated code! Do not edit!
 *
 * @private
 */
@javax.annotation.Generated(
   value = "org.infinispan.protostream.annotations.impl.processor.AutoProtoSchemaBuilderAnnotationProcessor",
   comments = "Please do not edit this file!"
)
@SuppressWarnings("all")
public final class EventoListenerModel$___Marshaller_c3bf58f3be9cc38bf809d0684a6f01336177781c27c4dee3d19abb34ab0ebdb2 extends org.infinispan.protostream.annotations.impl.GeneratedMarshallerBase implements org.infinispan.protostream.ProtobufTagMarshaller<br.com.bb.aqt.models.EventoListenerModel> {

   @Override
   public Class<br.com.bb.aqt.models.EventoListenerModel> getJavaClass() { return br.com.bb.aqt.models.EventoListenerModel.class; }
   
   @Override
   public String getTypeName() { return "METRICS.EventoListenerModel"; }
   
   @Override
   public br.com.bb.aqt.models.EventoListenerModel read(org.infinispan.protostream.ProtobufTagMarshaller.ReadContext $1) throws java.io.IOException {
      final org.infinispan.protostream.TagReader $in = $1.getReader();
      java.lang.Long __v$1 = null;
      java.lang.Long __v$2 = null;
      boolean done = false;
      while (!done) {
         final int tag = $in.readTag();
         switch (tag) {
            case 0: {
               done = true;
               break;
            }
            case (1 << org.infinispan.protostream.descriptors.WireType.TAG_TYPE_NUM_BITS | org.infinispan.protostream.descriptors.WireType.WIRETYPE_VARINT): {
               __v$1 = new java.lang.Long($in.readInt64());
               break;
            }
            case (2 << org.infinispan.protostream.descriptors.WireType.TAG_TYPE_NUM_BITS | org.infinispan.protostream.descriptors.WireType.WIRETYPE_VARINT): {
               __v$2 = new java.lang.Long($in.readInt64());
               break;
            }
            default: {
               if (!$in.skipField(tag)) done = true;
            }
         }
      }
      return new br.com.bb.aqt.models.EventoListenerModel(__v$1, __v$2);
   }
   
   @Override
   public void write(org.infinispan.protostream.ProtobufTagMarshaller.WriteContext $1, br.com.bb.aqt.models.EventoListenerModel $2) throws java.io.IOException {
      final org.infinispan.protostream.TagWriter $out = $1.getWriter();
      final br.com.bb.aqt.models.EventoListenerModel o = (br.com.bb.aqt.models.EventoListenerModel) $2;
      {
         final java.lang.Long __v$1 = o.getCHAVE();
         if (__v$1 != null) $out.writeInt64(1, __v$1.longValue());
      }
      {
         final java.lang.Long __v$2 = o.getREGTIMESTAMP();
         if (__v$2 != null) $out.writeInt64(2, __v$2.longValue());
      }
   }
}