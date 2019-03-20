package com.jk.pojo;

import java.util.Date;


public class WebDrugBean {
    private Integer id;//序号

    private Integer serialNumber;//药品编号

    private String name;//通用名

    private String dosage;//剂型

    private String character;//药品特征

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

    public Integer getAcount() {
        return acount;
    }

    public void setAcount(Integer acount) {
        this.acount = acount;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
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
}
