package com.jk.pojo;

public class MedicineBean {

    private Integer id;                   //主键

    private String picture;               //图片

    private String commodityInformation;  //商品信息

    private String specifications;        //规格

    private String manufacturer;          //生产厂家

    private Long unitPrice;               //单价

    private Integer number;               //数量

    private Long discount;                //折扣优惠

    private String dateManufacture;       //生产日期

    private String termValidity;          //有效期

    private String approvalNumber;        //批准文号

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getCommodityInformation() {
        return commodityInformation;
    }

    public void setCommodityInformation(String commodityInformation) {
        this.commodityInformation = commodityInformation;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Long getDiscount() {
        return discount;
    }

    public void setDiscount(Long discount) {
        this.discount = discount;
    }

    public String getDateManufacture() {
        return dateManufacture;
    }

    public void setDateManufacture(String dateManufacture) {
        this.dateManufacture = dateManufacture;
    }

    public String getTermValidity() {
        return termValidity;
    }

    public void setTermValidity(String termValidity) {
        this.termValidity = termValidity;
    }

    public String getApprovalNumber() {
        return approvalNumber;
    }

    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber;
    }

    @Override
    public String toString() {
        return "MedicineBean{" +
                "id=" + id +
                ", picture='" + picture + '\'' +
                ", commodityInformation='" + commodityInformation + '\'' +
                ", specifications='" + specifications + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", unitPrice=" + unitPrice +
                ", number=" + number +
                ", discount=" + discount +
                ", dateManufacture='" + dateManufacture + '\'' +
                ", termValidity='" + termValidity + '\'' +
                ", approvalNumber='" + approvalNumber + '\'' +
                '}';
    }
}
