package com.jk.pojo;

public class Commodity {
    private Integer id;//	商品编号	char(32)	32
    private String commodity_name;//	商品名称	varchar(20)	20
    private String commodity_number;//	商品货号	varchar(20)	20
    private String commodity_specifications;//	商品规格	varchar(20)	20
    private String manufacture_factory;// 生产厂家		varchar(50)	50
    private String approval_number;//	   批准文号	varchar(20)	20
    private Integer supply_price;//	供应价格	varchar(20)	20
    private Integer commodity_stock;//	库存	varchar(20)	20
    private String release_time;//	发布时间	String
    private Integer commodity_status;//	商品状态	int
    private Integer audit_status;    //审核状态

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommodity_name() {
        return commodity_name;
    }

    public void setCommodity_name(String commodity_name) {
        this.commodity_name = commodity_name;
    }

    public String getCommodity_number() {
        return commodity_number;
    }

    public void setCommodity_number(String commodity_number) {
        this.commodity_number = commodity_number;
    }

    public String getCommodity_specifications() {
        return commodity_specifications;
    }

    public void setCommodity_specifications(String commodity_specifications) {
        this.commodity_specifications = commodity_specifications;
    }

    public String getManufacture_factory() {
        return manufacture_factory;
    }

    public void setManufacture_factory(String manufacture_factory) {
        this.manufacture_factory = manufacture_factory;
    }

    public String getApproval_number() {
        return approval_number;
    }

    public void setApproval_number(String approval_number) {
        this.approval_number = approval_number;
    }

    public Integer getSupply_price() {
        return supply_price;
    }

    public void setSupply_price(Integer supply_price) {
        this.supply_price = supply_price;
    }

    public Integer getCommodity_stock() {
        return commodity_stock;
    }

    public void setCommodity_stock(Integer commodity_stock) {
        this.commodity_stock = commodity_stock;
    }

    public String getRelease_time() {
        return release_time;
    }

    public void setRelease_time(String release_time) {
        this.release_time = release_time;
    }

    public Integer getCommodity_status() {
        return commodity_status;
    }

    public void setCommodity_status(Integer commodity_status) {
        this.commodity_status = commodity_status;
    }

    public Integer getAudit_status() {
        return audit_status;
    }

    public void setAudit_status(Integer audit_status) {
        this.audit_status = audit_status;
    }
}
