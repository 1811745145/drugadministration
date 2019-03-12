package com.jk.pojo;

public class Commodity {
    private Integer id;//	商品编号	char(32)	32
    private String commodityname;//	商品名称	varchar(20)	20
    private String commoditynumber;//	商品货号	varchar(20)	20
    private String commodityspecifications;//	商品规格	varchar(20)	20
    private String manufacturefactory;// 生产厂家		varchar(50)	50
    private String approvalnumber;//	   批准文号	varchar(20)	20
    private Integer supplyprice;//	供应价格	varchar(20)	20
    private Integer commoditystock;//	库存	varchar(20)	20
    private String releasetime;//	发布时间	String
    private Integer commoditystatus;//	商品状态	int
    private Integer auditstatus;    //审核状态

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommodityname() {
        return commodityname;
    }

    public void setCommodityname(String commodityname) {
        this.commodityname = commodityname;
    }

    public String getCommoditynumber() {
        return commoditynumber;
    }

    public void setCommoditynumber(String commoditynumber) {
        this.commoditynumber = commoditynumber;
    }

    public String getCommodityspecifications() {
        return commodityspecifications;
    }

    public void setCommodityspecifications(String commodityspecifications) {
        this.commodityspecifications = commodityspecifications;
    }

    public String getManufacturefactory() {
        return manufacturefactory;
    }

    public void setManufacturefactory(String manufacturefactory) {
        this.manufacturefactory = manufacturefactory;
    }

    public String getApprovalnumber() {
        return approvalnumber;
    }

    public void setApprovalnumber(String approvalnumber) {
        this.approvalnumber = approvalnumber;
    }

    public Integer getSupplyprice() {
        return supplyprice;
    }

    public void setSupplyprice(Integer supplyprice) {
        this.supplyprice = supplyprice;
    }

    public Integer getCommoditystock() {
        return commoditystock;
    }

    public void setCommoditystock(Integer commoditystock) {
        this.commoditystock = commoditystock;
    }

    public String getReleasetime() {
        return releasetime;
    }

    public void setReleasetime(String releasetime) {
        this.releasetime = releasetime;
    }

    public Integer getCommoditystatus() {
        return commoditystatus;
    }

    public void setCommoditystatus(Integer commoditystatus) {
        this.commoditystatus = commoditystatus;
    }

    public Integer getAuditstatus() {
        return auditstatus;
    }

    public void setAuditstatus(Integer auditstatus) {
        this.auditstatus = auditstatus;
    }
}
