/*
 Generated by org.infinispan.protostream.annotations.impl.processor.MarshallerSourceCodeGenerator
 for class br.com.bb.aqt.models.CliDatagridCDC
*/

package br.com.bb.aqt.models;

import br.com.bb.aqt.models.CliDatagridCDC;

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
public final class CliDatagridCDC$___Marshaller_f1ee5bafd7638b1f59a265c290f2fda1f7d3472a9192d44d0cf40580a560ed5b extends org.infinispan.protostream.annotations.impl.GeneratedMarshallerBase implements org.infinispan.protostream.ProtobufTagMarshaller<br.com.bb.aqt.models.CliDatagridCDC> {

   @Override
   public Class<br.com.bb.aqt.models.CliDatagridCDC> getJavaClass() { return br.com.bb.aqt.models.CliDatagridCDC.class; }
   
   @Override
   public String getTypeName() { return "METRICS.CliDatagridCDC"; }
   
   @Override
   public br.com.bb.aqt.models.CliDatagridCDC read(org.infinispan.protostream.ProtobufTagMarshaller.ReadContext $1) throws java.io.IOException {
      final org.infinispan.protostream.TagReader $in = $1.getReader();
      java.lang.Long __v$1 = null;
      java.lang.Integer __v$2 = null;
      java.lang.Long __v$3 = null;
      java.lang.String __v$4 = null;
      java.lang.Long __v$5 = null;
      java.lang.Long __v$6 = null;
      java.lang.Integer __v$7 = null;
      java.lang.Long __v$8 = null;
      java.lang.Long __v$9 = null;
      java.lang.Integer __v$10 = null;
      java.lang.String __v$11 = null;
      java.lang.String __v$12 = null;
      java.lang.Integer __v$13 = null;
      java.lang.Long __v$14 = null;
      java.lang.String __v$15 = null;
      java.lang.Long __v$16 = null;
      java.lang.Long __v$17 = null;
      java.lang.Integer __v$18 = null;
      java.lang.String __v$19 = null;
      java.lang.String __v$20 = null;
      java.lang.Long __v$21 = null;
      java.lang.Long __v$22 = null;
      java.lang.String __v$23 = null;
      java.lang.Integer __v$24 = null;
      java.lang.Integer __v$25 = null;
      java.lang.Integer __v$26 = null;
      java.lang.Integer __v$27 = null;
      java.lang.Integer __v$28 = null;
      java.lang.Long __v$29 = null;
      java.lang.String __v$30 = null;
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
               __v$2 = new java.lang.Integer($in.readInt32());
               break;
            }
            case (3 << org.infinispan.protostream.descriptors.WireType.TAG_TYPE_NUM_BITS | org.infinispan.protostream.descriptors.WireType.WIRETYPE_VARINT): {
               __v$3 = new java.lang.Long($in.readInt64());
               break;
            }
            case (4 << org.infinispan.protostream.descriptors.WireType.TAG_TYPE_NUM_BITS | org.infinispan.protostream.descriptors.WireType.WIRETYPE_LENGTH_DELIMITED): {
               __v$4 = $in.readString();
               break;
            }
            case (5 << org.infinispan.protostream.descriptors.WireType.TAG_TYPE_NUM_BITS | org.infinispan.protostream.descriptors.WireType.WIRETYPE_VARINT): {
               __v$5 = new java.lang.Long($in.readInt64());
               break;
            }
            case (6 << org.infinispan.protostream.descriptors.WireType.TAG_TYPE_NUM_BITS | org.infinispan.protostream.descriptors.WireType.WIRETYPE_VARINT): {
               __v$6 = new java.lang.Long($in.readInt64());
               break;
            }
            case (7 << org.infinispan.protostream.descriptors.WireType.TAG_TYPE_NUM_BITS | org.infinispan.protostream.descriptors.WireType.WIRETYPE_VARINT): {
               __v$7 = new java.lang.Integer($in.readInt32());
               break;
            }
            case (8 << org.infinispan.protostream.descriptors.WireType.TAG_TYPE_NUM_BITS | org.infinispan.protostream.descriptors.WireType.WIRETYPE_VARINT): {
               __v$8 = new java.lang.Long($in.readInt64());
               break;
            }
            case (9 << org.infinispan.protostream.descriptors.WireType.TAG_TYPE_NUM_BITS | org.infinispan.protostream.descriptors.WireType.WIRETYPE_VARINT): {
               __v$9 = new java.lang.Long($in.readInt64());
               break;
            }
            case (10 << org.infinispan.protostream.descriptors.WireType.TAG_TYPE_NUM_BITS | org.infinispan.protostream.descriptors.WireType.WIRETYPE_VARINT): {
               __v$10 = new java.lang.Integer($in.readInt32());
               break;
            }
            case (11 << org.infinispan.protostream.descriptors.WireType.TAG_TYPE_NUM_BITS | org.infinispan.protostream.descriptors.WireType.WIRETYPE_LENGTH_DELIMITED): {
               __v$11 = $in.readString();
               break;
            }
            case (12 << org.infinispan.protostream.descriptors.WireType.TAG_TYPE_NUM_BITS | org.infinispan.protostream.descriptors.WireType.WIRETYPE_LENGTH_DELIMITED): {
               __v$12 = $in.readString();
               break;
            }
            case (13 << org.infinispan.protostream.descriptors.WireType.TAG_TYPE_NUM_BITS | org.infinispan.protostream.descriptors.WireType.WIRETYPE_VARINT): {
               __v$13 = new java.lang.Integer($in.readInt32());
               break;
            }
            case (14 << org.infinispan.protostream.descriptors.WireType.TAG_TYPE_NUM_BITS | org.infinispan.protostream.descriptors.WireType.WIRETYPE_VARINT): {
               __v$14 = new java.lang.Long($in.readInt64());
               break;
            }
            case (15 << org.infinispan.protostream.descriptors.WireType.TAG_TYPE_NUM_BITS | org.infinispan.protostream.descriptors.WireType.WIRETYPE_LENGTH_DELIMITED): {
               __v$15 = $in.readString();
               break;
            }
            case (16 << org.infinispan.protostream.descriptors.WireType.TAG_TYPE_NUM_BITS | org.infinispan.protostream.descriptors.WireType.WIRETYPE_VARINT): {
               __v$16 = new java.lang.Long($in.readInt64());
               break;
            }
            case (17 << org.infinispan.protostream.descriptors.WireType.TAG_TYPE_NUM_BITS | org.infinispan.protostream.descriptors.WireType.WIRETYPE_VARINT): {
               __v$17 = new java.lang.Long($in.readInt64());
               break;
            }
            case (18 << org.infinispan.protostream.descriptors.WireType.TAG_TYPE_NUM_BITS | org.infinispan.protostream.descriptors.WireType.WIRETYPE_VARINT): {
               __v$18 = new java.lang.Integer($in.readInt32());
               break;
            }
            case (19 << org.infinispan.protostream.descriptors.WireType.TAG_TYPE_NUM_BITS | org.infinispan.protostream.descriptors.WireType.WIRETYPE_LENGTH_DELIMITED): {
               __v$19 = $in.readString();
               break;
            }
            case (20 << org.infinispan.protostream.descriptors.WireType.TAG_TYPE_NUM_BITS | org.infinispan.protostream.descriptors.WireType.WIRETYPE_LENGTH_DELIMITED): {
               __v$20 = $in.readString();
               break;
            }
            case (21 << org.infinispan.protostream.descriptors.WireType.TAG_TYPE_NUM_BITS | org.infinispan.protostream.descriptors.WireType.WIRETYPE_VARINT): {
               __v$21 = new java.lang.Long($in.readInt64());
               break;
            }
            case (22 << org.infinispan.protostream.descriptors.WireType.TAG_TYPE_NUM_BITS | org.infinispan.protostream.descriptors.WireType.WIRETYPE_VARINT): {
               __v$22 = new java.lang.Long($in.readInt64());
               break;
            }
            case (23 << org.infinispan.protostream.descriptors.WireType.TAG_TYPE_NUM_BITS | org.infinispan.protostream.descriptors.WireType.WIRETYPE_LENGTH_DELIMITED): {
               __v$23 = $in.readString();
               break;
            }
            case (24 << org.infinispan.protostream.descriptors.WireType.TAG_TYPE_NUM_BITS | org.infinispan.protostream.descriptors.WireType.WIRETYPE_VARINT): {
               __v$24 = new java.lang.Integer($in.readInt32());
               break;
            }
            case (25 << org.infinispan.protostream.descriptors.WireType.TAG_TYPE_NUM_BITS | org.infinispan.protostream.descriptors.WireType.WIRETYPE_VARINT): {
               __v$25 = new java.lang.Integer($in.readInt32());
               break;
            }
            case (26 << org.infinispan.protostream.descriptors.WireType.TAG_TYPE_NUM_BITS | org.infinispan.protostream.descriptors.WireType.WIRETYPE_VARINT): {
               __v$26 = new java.lang.Integer($in.readInt32());
               break;
            }
            case (27 << org.infinispan.protostream.descriptors.WireType.TAG_TYPE_NUM_BITS | org.infinispan.protostream.descriptors.WireType.WIRETYPE_VARINT): {
               __v$27 = new java.lang.Integer($in.readInt32());
               break;
            }
            case (28 << org.infinispan.protostream.descriptors.WireType.TAG_TYPE_NUM_BITS | org.infinispan.protostream.descriptors.WireType.WIRETYPE_VARINT): {
               __v$28 = new java.lang.Integer($in.readInt32());
               break;
            }
            case (29 << org.infinispan.protostream.descriptors.WireType.TAG_TYPE_NUM_BITS | org.infinispan.protostream.descriptors.WireType.WIRETYPE_VARINT): {
               __v$29 = new java.lang.Long($in.readInt64());
               break;
            }
            case (30 << org.infinispan.protostream.descriptors.WireType.TAG_TYPE_NUM_BITS | org.infinispan.protostream.descriptors.WireType.WIRETYPE_LENGTH_DELIMITED): {
               __v$30 = $in.readString();
               break;
            }
            default: {
               if (!$in.skipField(tag)) done = true;
            }
         }
      }
      return new br.com.bb.aqt.models.CliDatagridCDC(__v$1, __v$2, __v$3, __v$4, __v$5, __v$6, __v$7, __v$8, __v$9, __v$10, __v$11, __v$12, __v$13, __v$14, __v$15, __v$16, __v$17, __v$18, __v$19, __v$20, __v$21, __v$22, __v$23, __v$24, __v$25, __v$26, __v$27, __v$28, __v$29, __v$30);
   }
   
   @Override
   public void write(org.infinispan.protostream.ProtobufTagMarshaller.WriteContext $1, br.com.bb.aqt.models.CliDatagridCDC $2) throws java.io.IOException {
      final org.infinispan.protostream.TagWriter $out = $1.getWriter();
      final br.com.bb.aqt.models.CliDatagridCDC o = (br.com.bb.aqt.models.CliDatagridCDC) $2;
      {
         final java.lang.Long __v$1 = o.getCOD();
         if (__v$1 != null) $out.writeInt64(1, __v$1.longValue());
      }
      {
         final java.lang.Integer __v$2 = o.getCOD_TIPO();
         if (__v$2 != null) $out.writeInt32(2, __v$2.intValue());
      }
      {
         final java.lang.Long __v$3 = o.getCOD_CPF_CGC();
         if (__v$3 != null) $out.writeInt64(3, __v$3.longValue());
      }
      {
         final java.lang.String __v$4 = o.getNOM();
         if (__v$4 != null) $out.writeString(4, __v$4);
      }
      {
         final java.lang.Long __v$5 = o.getCOD_INFO_CPF_CGC();
         if (__v$5 != null) $out.writeInt64(5, __v$5.longValue());
      }
      {
         final java.lang.Long __v$6 = o.getDTA_CDTO();
         if (__v$6 != null) $out.writeInt64(6, __v$6.longValue());
      }
      {
         final java.lang.Integer __v$7 = o.getCOD_PREF_AGEN();
         if (__v$7 != null) $out.writeInt32(7, __v$7.intValue());
      }
      {
         final java.lang.Long __v$8 = o.getDTA_ULTA_ATLZ();
         if (__v$8 != null) $out.writeInt64(8, __v$8.longValue());
      }
      {
         final java.lang.Long __v$9 = o.getDTA_NASC_CSNT();
         if (__v$9 != null) $out.writeInt64(9, __v$9.longValue());
      }
      {
         final java.lang.Integer __v$10 = o.getCOD_TIPO_DCTO();
         if (__v$10 != null) $out.writeInt32(10, __v$10.intValue());
      }
      {
         final java.lang.String __v$11 = o.getCOD_DCTO();
         if (__v$11 != null) $out.writeString(11, __v$11);
      }
      {
         final java.lang.String __v$12 = o.getNOM_ORGA_EMSS();
         if (__v$12 != null) $out.writeString(12, __v$12);
      }
      {
         final java.lang.Integer __v$13 = o.getCOD_SITU();
         if (__v$13 != null) $out.writeInt32(13, __v$13.intValue());
      }
      {
         final java.lang.Long __v$14 = o.getDTA_EMSS_DCTO();
         if (__v$14 != null) $out.writeInt64(14, __v$14.longValue());
      }
      {
         final java.lang.String __v$15 = o.getIND_FICH_PROV();
         if (__v$15 != null) $out.writeString(15, __v$15);
      }
      {
         final java.lang.Long __v$16 = o.getDTA_REVISAO();
         if (__v$16 != null) $out.writeInt64(16, __v$16.longValue());
      }
      {
         final java.lang.Long __v$17 = o.getCOD_MATR_FUNCI_REV();
         if (__v$17 != null) $out.writeInt64(17, __v$17.longValue());
      }
      {
         final java.lang.Integer __v$18 = o.getCOD_TTDD_CPF();
         if (__v$18 != null) $out.writeInt32(18, __v$18.intValue());
      }
      {
         final java.lang.String __v$19 = o.getIND_IRREG_1();
         if (__v$19 != null) $out.writeString(19, __v$19);
      }
      {
         final java.lang.String __v$20 = o.getIND_IRREG_2();
         if (__v$20 != null) $out.writeString(20, __v$20);
      }
      {
         final java.lang.Long __v$21 = o.getDTA_INI_CORREN();
         if (__v$21 != null) $out.writeInt64(21, __v$21.longValue());
      }
      {
         final java.lang.Long __v$22 = o.getCOD_PAIS_ORIG();
         if (__v$22 != null) $out.writeInt64(22, __v$22.longValue());
      }
      {
         final java.lang.String __v$23 = o.getIND_EXTR();
         if (__v$23 != null) $out.writeString(23, __v$23);
      }
      {
         final java.lang.Integer __v$24 = o.getCOD_MERC();
         if (__v$24 != null) $out.writeInt32(24, __v$24.intValue());
      }
      {
         final java.lang.Integer __v$25 = o.getCOD_CTGR();
         if (__v$25 != null) $out.writeInt32(25, __v$25.intValue());
      }
      {
         final java.lang.Integer __v$26 = o.getCD_EST_CAD();
         if (__v$26 != null) $out.writeInt32(26, __v$26.intValue());
      }
      {
         final java.lang.Integer __v$27 = o.getCD_TIP_CADM();
         if (__v$27 != null) $out.writeInt32(27, __v$27.intValue());
      }
      {
         final java.lang.Integer __v$28 = o.getCD_OGM_CADM();
         if (__v$28 != null) $out.writeInt32(28, __v$28.intValue());
      }
      {
         final java.lang.Long __v$29 = o.getNR_IDFC_OGM_CAD();
         if (__v$29 != null) $out.writeInt64(29, __v$29.longValue());
      }
      {
         final java.lang.String __v$30 = o.getIN_BEM_N_CADD();
         if (__v$30 != null) $out.writeString(30, __v$30);
      }
   }
}
