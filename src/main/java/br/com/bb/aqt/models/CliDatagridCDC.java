package br.com.bb.aqt.models;

import java.util.Objects;

import org.infinispan.protostream.annotations.ProtoDoc;
import org.infinispan.protostream.annotations.ProtoFactory;
import org.infinispan.protostream.annotations.ProtoField;

import io.quarkus.runtime.annotations.RegisterForReflection;

@ProtoDoc("@Indexed")
@RegisterForReflection
public class CliDatagridCDC {

    Long COD;
    Integer COD_TIPO;
    Long COD_CPF_CGC;
    String NOM;
    Long COD_INFO_CPF_CGC;
    Long DTA_CDTO;
    Integer COD_PREF_AGEN;
    Long DTA_ULTA_ATLZ;
    Long DTA_NASC_CSNT;
    Integer COD_TIPO_DCTO;
    String COD_DCTO;
    String NOM_ORGA_EMSS;
    Integer COD_SITU;
    Long DTA_EMSS_DCTO;
    String IND_FICH_PROV;
    Long DTA_REVISAO;
    Long COD_MATR_FUNCI_REV;
    Integer COD_TTDD_CPF;
    String IND_IRREG_1;
    String IND_IRREG_2;
    Long DTA_INI_CORREN;
    Long COD_PAIS_ORIG;
    String IND_EXTR;
    Integer COD_MERC;
    Integer COD_CTGR;
    Integer CD_EST_CAD;
    Integer CD_TIP_CADM;
    Integer CD_OGM_CADM;
    Long NR_IDFC_OGM_CAD;
    String IN_BEM_N_CADD;

    public CliDatagridCDC() {
    }

    @ProtoFactory
    public CliDatagridCDC(Long cOD, Integer cOD_TIPO, Long cOD_CPF_CGC, String nOM, Long cOD_INFO_CPF_CGC,
            Long dTA_CDTO, Integer cOD_PREF_AGEN, Long dTA_ULTA_ATLZ, Long dTA_NASC_CSNT, Integer cOD_TIPO_DCTO,
            String cOD_DCTO, String nOM_ORGA_EMSS, Integer cOD_SITU, Long dTA_EMSS_DCTO, String iND_FICH_PROV,
            Long dTA_REVISAO, Long cOD_MATR_FUNCI_REV, Integer cOD_TTDD_CPF, String iND_IRREG_1, String iND_IRREG_2,
            Long dTA_INI_CORREN, Long cOD_PAIS_ORIG, String iND_EXTR, Integer cOD_MERC, Integer cOD_CTGR,
            Integer cD_EST_CAD, Integer cD_TIP_CADM, Integer cD_OGM_CADM, Long nR_IDFC_OGM_CAD, String iN_BEM_N_CADD) {
        COD = Objects.requireNonNull(cOD);
        COD_TIPO = Objects.requireNonNull(cOD_TIPO);
        COD_CPF_CGC = Objects.requireNonNull(cOD_CPF_CGC);
        NOM = Objects.requireNonNull(nOM);
        COD_INFO_CPF_CGC = Objects.requireNonNull(cOD_INFO_CPF_CGC);
        DTA_CDTO = Objects.requireNonNull(dTA_CDTO);
        COD_PREF_AGEN = Objects.requireNonNull(cOD_PREF_AGEN);
        DTA_ULTA_ATLZ = Objects.requireNonNull(dTA_ULTA_ATLZ);
        DTA_NASC_CSNT = Objects.requireNonNull(dTA_NASC_CSNT);
        COD_TIPO_DCTO = Objects.requireNonNull(cOD_TIPO_DCTO);
        COD_DCTO = Objects.requireNonNull(cOD_DCTO);
        NOM_ORGA_EMSS = Objects.requireNonNull(nOM_ORGA_EMSS);
        COD_SITU = Objects.requireNonNull(cOD_SITU);
        DTA_EMSS_DCTO = Objects.requireNonNull(dTA_EMSS_DCTO);
        IND_FICH_PROV = Objects.requireNonNull(iND_FICH_PROV);
        DTA_REVISAO = Objects.requireNonNull(dTA_REVISAO);
        COD_MATR_FUNCI_REV = Objects.requireNonNull(cOD_MATR_FUNCI_REV);
        COD_TTDD_CPF = Objects.requireNonNull(cOD_TTDD_CPF);
        IND_IRREG_1 = Objects.requireNonNull(iND_IRREG_1);
        IND_IRREG_2 = Objects.requireNonNull(iND_IRREG_2);
        DTA_INI_CORREN = Objects.requireNonNull(dTA_INI_CORREN);
        COD_PAIS_ORIG = Objects.requireNonNull(cOD_PAIS_ORIG);
        IND_EXTR = Objects.requireNonNull(iND_EXTR);
        COD_MERC = Objects.requireNonNull(cOD_MERC);
        COD_CTGR = Objects.requireNonNull(cOD_CTGR);
        CD_EST_CAD = Objects.requireNonNull(cD_EST_CAD);
        CD_TIP_CADM = Objects.requireNonNull(cD_TIP_CADM);
        CD_OGM_CADM = Objects.requireNonNull(cD_OGM_CADM);
        NR_IDFC_OGM_CAD = Objects.requireNonNull(nR_IDFC_OGM_CAD);
        IN_BEM_N_CADD = Objects.requireNonNull(iN_BEM_N_CADD);
    }

    @ProtoField(1)
    public Long getCOD() {
        return COD;
    }

    public void setCOD(Long cOD) {
        COD = cOD;
    }

    @ProtoField(2)
    public Integer getCOD_TIPO() {
        return COD_TIPO;
    }

    public void setCOD_TIPO(Integer cOD_TIPO) {
        COD_TIPO = cOD_TIPO;
    }

    @ProtoField(3)
    public Long getCOD_CPF_CGC() {
        return COD_CPF_CGC;
    }

    public void setCOD_CPF_CGC(Long cOD_CPF_CGC) {
        COD_CPF_CGC = cOD_CPF_CGC;
    }

    @ProtoField(4)
    public String getNOM() {
        return NOM;
    }

    public void setNOM(String nOM) {
        NOM = nOM;
    }

    @ProtoField(5)
    public Long getCOD_INFO_CPF_CGC() {
        return COD_INFO_CPF_CGC;
    }

    public void setCOD_INFO_CPF_CGC(Long cOD_INFO_CPF_CGC) {
        COD_INFO_CPF_CGC = cOD_INFO_CPF_CGC;
    }

    @ProtoField(6)
    public Long getDTA_CDTO() {
        return DTA_CDTO;
    }

    public void setDTA_CDTO(Long dTA_CDTO) {
        DTA_CDTO = dTA_CDTO;
    }

    @ProtoField(7)
    public Integer getCOD_PREF_AGEN() {
        return COD_PREF_AGEN;
    }

    public void setCOD_PREF_AGEN(Integer cOD_PREF_AGEN) {
        COD_PREF_AGEN = cOD_PREF_AGEN;
    }

    @ProtoField(8)
    public Long getDTA_ULTA_ATLZ() {
        return DTA_ULTA_ATLZ;
    }

    public void setDTA_ULTA_ATLZ(Long dTA_ULTA_ATLZ) {
        DTA_ULTA_ATLZ = dTA_ULTA_ATLZ;
    }

    @ProtoField(9)
    public Long getDTA_NASC_CSNT() {
        return DTA_NASC_CSNT;
    }

    public void setDTA_NASC_CSNT(Long dTA_NASC_CSNT) {
        DTA_NASC_CSNT = dTA_NASC_CSNT;
    }

    @ProtoField(10)
    public Integer getCOD_TIPO_DCTO() {
        return COD_TIPO_DCTO;
    }

    public void setCOD_TIPO_DCTO(Integer cOD_TIPO_DCTO) {
        COD_TIPO_DCTO = cOD_TIPO_DCTO;
    }

    @ProtoField(11)
    public String getCOD_DCTO() {
        return COD_DCTO;
    }

    public void setCOD_DCTO(String cOD_DCTO) {
        COD_DCTO = cOD_DCTO;
    }

    @ProtoField(12)
    public String getNOM_ORGA_EMSS() {
        return NOM_ORGA_EMSS;
    }

    public void setNOM_ORGA_EMSS(String nOM_ORGA_EMSS) {
        NOM_ORGA_EMSS = nOM_ORGA_EMSS;
    }

    @ProtoField(13)
    public Integer getCOD_SITU() {
        return COD_SITU;
    }

    public void setCOD_SITU(Integer cOD_SITU) {
        COD_SITU = cOD_SITU;
    }

    @ProtoField(14)
    public Long getDTA_EMSS_DCTO() {
        return DTA_EMSS_DCTO;
    }

    public void setDTA_EMSS_DCTO(Long dTA_EMSS_DCTO) {
        DTA_EMSS_DCTO = dTA_EMSS_DCTO;
    }

    @ProtoField(15)
    public String getIND_FICH_PROV() {
        return IND_FICH_PROV;
    }

    public void setIND_FICH_PROV(String iND_FICH_PROV) {
        IND_FICH_PROV = iND_FICH_PROV;
    }

    @ProtoField(16)
    public Long getDTA_REVISAO() {
        return DTA_REVISAO;
    }

    public void setDTA_REVISAO(Long dTA_REVISAO) {
        DTA_REVISAO = dTA_REVISAO;
    }

    @ProtoField(17)
    public Long getCOD_MATR_FUNCI_REV() {
        return COD_MATR_FUNCI_REV;
    }

    public void setCOD_MATR_FUNCI_REV(Long cOD_MATR_FUNCI_REV) {
        COD_MATR_FUNCI_REV = cOD_MATR_FUNCI_REV;
    }

    @ProtoField(18)
    public Integer getCOD_TTDD_CPF() {
        return COD_TTDD_CPF;
    }

    public void setCOD_TTDD_CPF(Integer cOD_TTDD_CPF) {
        COD_TTDD_CPF = cOD_TTDD_CPF;
    }

    @ProtoField(19)
    public String getIND_IRREG_1() {
        return IND_IRREG_1;
    }

    public void setIND_IRREG_1(String iND_IRREG_1) {
        IND_IRREG_1 = iND_IRREG_1;
    }

    @ProtoField(20)
    public String getIND_IRREG_2() {
        return IND_IRREG_2;
    }

    public void setIND_IRREG_2(String iND_IRREG_2) {
        IND_IRREG_2 = iND_IRREG_2;
    }

    @ProtoField(21)
    public Long getDTA_INI_CORREN() {
        return DTA_INI_CORREN;
    }

    public void setDTA_INI_CORREN(Long dTA_INI_CORREN) {
        DTA_INI_CORREN = dTA_INI_CORREN;
    }

    @ProtoField(22)
    public Long getCOD_PAIS_ORIG() {
        return COD_PAIS_ORIG;
    }

    public void setCOD_PAIS_ORIG(Long cOD_PAIS_ORIG) {
        COD_PAIS_ORIG = cOD_PAIS_ORIG;
    }

    @ProtoField(23)
    public String getIND_EXTR() {
        return IND_EXTR;
    }

    public void setIND_EXTR(String iND_EXTR) {
        IND_EXTR = iND_EXTR;
    }

    @ProtoField(24)
    public Integer getCOD_MERC() {
        return COD_MERC;
    }

    public void setCOD_MERC(Integer cOD_MERC) {
        COD_MERC = cOD_MERC;
    }

    @ProtoField(25)
    public Integer getCOD_CTGR() {
        return COD_CTGR;
    }

    public void setCOD_CTGR(Integer cOD_CTGR) {
        COD_CTGR = cOD_CTGR;
    }

    @ProtoField(26)
    public Integer getCD_EST_CAD() {
        return CD_EST_CAD;
    }

    public void setCD_EST_CAD(Integer cD_EST_CAD) {
        CD_EST_CAD = cD_EST_CAD;
    }

    @ProtoField(27)
    public Integer getCD_TIP_CADM() {
        return CD_TIP_CADM;
    }

    public void setCD_TIP_CADM(Integer cD_TIP_CADM) {
        CD_TIP_CADM = cD_TIP_CADM;
    }

    @ProtoField(28)
    public Integer getCD_OGM_CADM() {
        return CD_OGM_CADM;
    }

    public void setCD_OGM_CADM(Integer cD_OGM_CADM) {
        CD_OGM_CADM = cD_OGM_CADM;
    }

    @ProtoField(29)
    public Long getNR_IDFC_OGM_CAD() {
        return NR_IDFC_OGM_CAD;
    }

    public void setNR_IDFC_OGM_CAD(Long nR_IDFC_OGM_CAD) {
        NR_IDFC_OGM_CAD = nR_IDFC_OGM_CAD;
    }

    @ProtoField(30)
    public String getIN_BEM_N_CADD() {
        return IN_BEM_N_CADD;
    }

    public void setIN_BEM_N_CADD(String iN_BEM_N_CADD) {
        IN_BEM_N_CADD = iN_BEM_N_CADD;
    }

    @Override
    public String toString() {
        return "CliDatagridCDC [CD_EST_CAD=" + CD_EST_CAD + ", CD_OGM_CADM=" + CD_OGM_CADM + ", CD_TIP_CADM="
                + CD_TIP_CADM + ", COD=" + COD + ", COD_CPF_CGC=" + COD_CPF_CGC + ", COD_CTGR=" + COD_CTGR
                + ", COD_DCTO=" + COD_DCTO + ", COD_INFO_CPF_CGC=" + COD_INFO_CPF_CGC + ", COD_MATR_FUNCI_REV="
                + COD_MATR_FUNCI_REV + ", COD_MERC=" + COD_MERC + ", COD_PAIS_ORIG=" + COD_PAIS_ORIG
                + ", COD_PREF_AGEN=" + COD_PREF_AGEN + ", COD_SITU=" + COD_SITU + ", COD_TIPO=" + COD_TIPO
                + ", COD_TIPO_DCTO=" + COD_TIPO_DCTO + ", COD_TTDD_CPF=" + COD_TTDD_CPF + ", DTA_CDTO=" + DTA_CDTO
                + ", DTA_EMSS_DCTO=" + DTA_EMSS_DCTO + ", DTA_INI_CORREN=" + DTA_INI_CORREN + ", DTA_NASC_CSNT="
                + DTA_NASC_CSNT + ", DTA_REVISAO=" + DTA_REVISAO + ", DTA_ULTA_ATLZ=" + DTA_ULTA_ATLZ + ", IND_EXTR="
                + IND_EXTR + ", IND_FICH_PROV=" + IND_FICH_PROV + ", IND_IRREG_1=" + IND_IRREG_1 + ", IND_IRREG_2="
                + IND_IRREG_2 + ", IN_BEM_N_CADD=" + IN_BEM_N_CADD + ", NOM=" + NOM + ", NOM_ORGA_EMSS=" + NOM_ORGA_EMSS
                + ", NR_IDFC_OGM_CAD=" + NR_IDFC_OGM_CAD + "]";
    }

}
