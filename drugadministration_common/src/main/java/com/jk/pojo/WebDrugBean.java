package com.jk.pojo;

import java.io.Serializable;
import java.util.Date;


public class WebDrugBean implements Serializable {
    private static final long serialVersionUID = -7928688771547575439L;
    private Integer id;//序号

    private Integer serialNumber;//药品编号

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

    @Override
    public String toString() {
        return "WebDrugBean{" +
                "id=" + id +
                ", serialNumber=" + serialNumber +
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
                '}';
    }
}
