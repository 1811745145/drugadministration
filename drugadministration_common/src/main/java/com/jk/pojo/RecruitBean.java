package com.jk.pojo;

public class RecruitBean {

    private Integer id;                //主键id

    private String code;               //编码

    private String productName;        //产品名称

    private String specifications;     //规格

    private String manufacturer;       //生产厂家

    private String province;           //区域-省

    private String city;               //区域-市

    private String area;               //区域-区

    private String releaseDate;        //发布日期

    private long commodityPrice;       //商品价格

    private Integer transactionVolume; //交易数量

    private String recruitPicture;     //图片

    private String recruitType;        //类型

    private String details;            //简介

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public long getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(long commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public Integer getTransactionVolume() {
        return transactionVolume;
    }

    public void setTransactionVolume(Integer transactionVolume) {
        this.transactionVolume = transactionVolume;
    }

    public String getRecruitPicture() {
        return recruitPicture;
    }

    public void setRecruitPicture(String recruitPicture) {
        this.recruitPicture = recruitPicture;
    }

    public String getRecruitType() {
        return recruitType;
    }

    public void setRecruitType(String recruitType) {
        this.recruitType = recruitType;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "RecruitBean{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", productName='" + productName + '\'' +
                ", specifications='" + specifications + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", area='" + area + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", commodityPrice=" + commodityPrice +
                ", transactionVolume=" + transactionVolume +
                ", recruitPicture='" + recruitPicture + '\'' +
                ", recruitType='" + recruitType + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
