package com.jk.pojo;

import java.io.Serializable;
import java.util.Date;


public class WebDrugBean implements Serializable {
    private static final long serialVersionUID = -7928688771547575439L;
    private Integer id;//序号

    private Integer serialNumber;//药品编号

    private String approvalNumber; //批准文号

    private String namee;//通用名

    private String dosage;//剂型

    private String characterr;//药品特征characterr

    private String specification;//规格

    private Integer conversionfactor;//转换系数  单位1

    private String packingunit;//包装单位

    private String directorytype;//目录类型

    private String menterprise;//生产企业

    private String sftenterprise;//入围企业

    private  Long pprice;//采购价

    private Long prprice;//临时零售价

    private Date scdate;//生产日期

    private Date yxdate;//有效日期

    private String drugefficacy;//药品功效

    private String drugimg;//药品图片

    private Integer acount;//数量

    private String  functionRug;//功能

    private Integer repertory;// 库存

    private Integer   dugtype;

    private  Integer   status;

    private   Integer  brand;
    private String drugActiveStatus;     //药品活动状态
    private String drugUtilityTaboo ;    //不良反应
    private String drugUtilityAdverseReaction ;    // 禁忌
    private String drugUtilityBases ;  //主要成分
    private String drugSpecificationExecutiveStandard ;  //执行标准
    private String drugSpecificationApprovalNumber;    //批准文号
    private String drugUtilityCharacter ;  //性状
    private String drugSpecificationSpell;   //拼音
    private String drugSpecificationAttention ; //注意事项
    private String         drugSpecificationOverdose;  //药物过量
    private String drugSpecificationToxicology;  //药物毒理
    private String         drugSpecificationInteraction ; //药物相互作用
    private String drugSpecificationUsageDosage;  //用法用量

    private   Integer  drupstatus;


    public Integer getDrupstatus() {
        return drupstatus;
    }

    public void setDrupstatus(Integer drupstatus) {
        this.drupstatus = drupstatus;
    }

    public Integer getBrand() {
        return brand;
    }

    public void setBrand(Integer brand) {
        this.brand = brand;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getApprovalNumber() {
        return approvalNumber;
    }

    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber;
    }

    public String getNamee() {
        return namee;
    }

    public void setNamee(String namee) {
        this.namee = namee;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getCharacterr() {
        return characterr;
    }

    public void setCharacterr(String characterr) {
        this.characterr = characterr;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public Integer getConversionfactor() {
        return conversionfactor;
    }

    public void setConversionfactor(Integer conversionfactor) {
        this.conversionfactor = conversionfactor;
    }

    public String getPackingunit() {
        return packingunit;
    }

    public void setPackingunit(String packingunit) {
        this.packingunit = packingunit;
    }

    public String getDirectorytype() {
        return directorytype;
    }

    public void setDirectorytype(String directorytype) {
        this.directorytype = directorytype;
    }

    public String getMenterprise() {
        return menterprise;
    }

    public void setMenterprise(String menterprise) {
        this.menterprise = menterprise;
    }

    public String getSftenterprise() {
        return sftenterprise;
    }

    public void setSftenterprise(String sftenterprise) {
        this.sftenterprise = sftenterprise;
    }

    public Long getPprice() {
        return pprice;
    }

    public void setPprice(Long pprice) {
        this.pprice = pprice;
    }

    public Long getPrprice() {
        return prprice;
    }

    public void setPrprice(Long prprice) {
        this.prprice = prprice;
    }

    public Date getScdate() {
        return scdate;
    }

    public void setScdate(Date scdate) {
        this.scdate = scdate;
    }

    public Date getYxdate() {
        return yxdate;
    }

    public void setYxdate(Date yxdate) {
        this.yxdate = yxdate;
    }

    public String getDrugefficacy() {
        return drugefficacy;
    }

    public void setDrugefficacy(String drugefficacy) {
        this.drugefficacy = drugefficacy;
    }

    public String getDrugimg() {
        return drugimg;
    }

    public void setDrugimg(String drugimg) {
        this.drugimg = drugimg;
    }

    public Integer getAcount() {
        return acount;
    }

    public void setAcount(Integer acount) {
        this.acount = acount;
    }

    public String getFunctionRug() {
        return functionRug;
    }

    public void setFunctionRug(String functionRug) {
        this.functionRug = functionRug;
    }

    public Integer getRepertory() {
        return repertory;
    }

    public void setRepertory(Integer repertory) {
        this.repertory = repertory;
    }

    public Integer getDugtype() {
        return dugtype;
    }

    public void setDugtype(Integer dugtype) {
        this.dugtype = dugtype;
    }

    public String getDrugActiveStatus() {
        return drugActiveStatus;
    }

    public void setDrugActiveStatus(String drugActiveStatus) {
        this.drugActiveStatus = drugActiveStatus;
    }

    public String getDrugUtilityTaboo() {
        return drugUtilityTaboo;
    }

    public void setDrugUtilityTaboo(String drugUtilityTaboo) {
        this.drugUtilityTaboo = drugUtilityTaboo;
    }

    public String getDrugUtilityAdverseReaction() {
        return drugUtilityAdverseReaction;
    }

    public void setDrugUtilityAdverseReaction(String drugUtilityAdverseReaction) {
        this.drugUtilityAdverseReaction = drugUtilityAdverseReaction;
    }

    public String getDrugUtilityBases() {
        return drugUtilityBases;
    }

    public void setDrugUtilityBases(String drugUtilityBases) {
        this.drugUtilityBases = drugUtilityBases;
    }

    public String getDrugSpecificationExecutiveStandard() {
        return drugSpecificationExecutiveStandard;
    }

    public void setDrugSpecificationExecutiveStandard(String drugSpecificationExecutiveStandard) {
        this.drugSpecificationExecutiveStandard = drugSpecificationExecutiveStandard;
    }

    public String getDrugSpecificationApprovalNumber() {
        return drugSpecificationApprovalNumber;
    }

    public void setDrugSpecificationApprovalNumber(String drugSpecificationApprovalNumber) {
        this.drugSpecificationApprovalNumber = drugSpecificationApprovalNumber;
    }

    public String getDrugUtilityCharacter() {
        return drugUtilityCharacter;
    }

    public void setDrugUtilityCharacter(String drugUtilityCharacter) {
        this.drugUtilityCharacter = drugUtilityCharacter;
    }

    public String getDrugSpecificationSpell() {
        return drugSpecificationSpell;
    }

    public void setDrugSpecificationSpell(String drugSpecificationSpell) {
        this.drugSpecificationSpell = drugSpecificationSpell;
    }

    public String getDrugSpecificationAttention() {
        return drugSpecificationAttention;
    }

    public void setDrugSpecificationAttention(String drugSpecificationAttention) {
        this.drugSpecificationAttention = drugSpecificationAttention;
    }

    public String getDrugSpecificationOverdose() {
        return drugSpecificationOverdose;
    }

    public void setDrugSpecificationOverdose(String drugSpecificationOverdose) {
        this.drugSpecificationOverdose = drugSpecificationOverdose;
    }

    public String getDrugSpecificationToxicology() {
        return drugSpecificationToxicology;
    }

    public void setDrugSpecificationToxicology(String drugSpecificationToxicology) {
        this.drugSpecificationToxicology = drugSpecificationToxicology;
    }

    public String getDrugSpecificationInteraction() {
        return drugSpecificationInteraction;
    }

    public void setDrugSpecificationInteraction(String drugSpecificationInteraction) {
        this.drugSpecificationInteraction = drugSpecificationInteraction;
    }

    public String getDrugSpecificationUsageDosage() {
        return drugSpecificationUsageDosage;
    }

    public void setDrugSpecificationUsageDosage(String drugSpecificationUsageDosage) {
        this.drugSpecificationUsageDosage = drugSpecificationUsageDosage;
    }

    @Override
    public String toString() {
        return "WebDrugBean{" +
                "id=" + id +
                ", serialNumber=" + serialNumber +
                ", approvalNumber='" + approvalNumber + '\'' +
                ", namee='" + namee + '\'' +
                ", dosage='" + dosage + '\'' +
                ", characterr='" + characterr + '\'' +
                ", specification='" + specification + '\'' +
                ", conversionfactor=" + conversionfactor +
                ", packingunit='" + packingunit + '\'' +
                ", directorytype='" + directorytype + '\'' +
                ", menterprise='" + menterprise + '\'' +
                ", sftenterprise='" + sftenterprise + '\'' +
                ", pprice=" + pprice +
                ", prprice=" + prprice +
                ", scdate=" + scdate +
                ", yxdate=" + yxdate +
                ", drugefficacy='" + drugefficacy + '\'' +
                ", drugimg='" + drugimg + '\'' +
                ", acount=" + acount +
                ", functionRug='" + functionRug + '\'' +
                ", repertory=" + repertory +
                ", dugtype=" + dugtype +
                ", status=" + status +
                ", brand=" + brand +
                ", drugActiveStatus='" + drugActiveStatus + '\'' +
                ", drugUtilityTaboo='" + drugUtilityTaboo + '\'' +
                ", drugUtilityAdverseReaction='" + drugUtilityAdverseReaction + '\'' +
                ", drugUtilityBases='" + drugUtilityBases + '\'' +
                ", drugSpecificationExecutiveStandard='" + drugSpecificationExecutiveStandard + '\'' +
                ", drugSpecificationApprovalNumber='" + drugSpecificationApprovalNumber + '\'' +
                ", drugUtilityCharacter='" + drugUtilityCharacter + '\'' +
                ", drugSpecificationSpell='" + drugSpecificationSpell + '\'' +
                ", drugSpecificationAttention='" + drugSpecificationAttention + '\'' +
                ", drugSpecificationOverdose='" + drugSpecificationOverdose + '\'' +
                ", drugSpecificationToxicology='" + drugSpecificationToxicology + '\'' +
                ", drugSpecificationInteraction='" + drugSpecificationInteraction + '\'' +
                ", drugSpecificationUsageDosage='" + drugSpecificationUsageDosage + '\'' +
                ", drupstatus=" + drupstatus +
                '}';


    }
}
