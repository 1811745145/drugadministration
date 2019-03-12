package com.jk.pojo;

public class ProductsBean {

    private Integer  productsId;	//主键id         不可为空   自增
    private String   productsName;	//	产品名称
    private String   productsType;	//产品类型
    private String   productsCommonName;//产品通用名称
    private String   productsManufacturer;//生产厂家
    private String   productsBrand	;//品牌
    private Integer  productsDistrict	;//代理区域：：指明代理人
    private String   productsChannel;//销售渠道
    private Integer  productsIndate;//有效期
    private String   productsImg;//产品图片
    private String   productsDetail;//需求描述
    private String   productsLinkman;//联系人
    private String   productsPhone	;//联系电话
    private String   productsArea;	//联系地址
    private Integer   productsStatus;	//代理状态

    public Integer getProductsStatus() {
        return productsStatus;
    }

    public void setProductsStatus(Integer productsStatus) {
        this.productsStatus = productsStatus;
    }

    public Integer getProductsId() {
        return productsId;
    }

    public void setProductsId(Integer productsId) {
        this.productsId = productsId;
    }

    public String getProductsName() {
        return productsName;
    }

    public void setProductsName(String productsName) {
        this.productsName = productsName;
    }

    public String getProductsType() {
        return productsType;
    }

    public void setProductsType(String productsType) {
        this.productsType = productsType;
    }

    public String getProductsCommonName() {
        return productsCommonName;
    }

    public void setProductsCommonName(String productsCommonName) {
        this.productsCommonName = productsCommonName;
    }

    public String getProductsManufacturer() {
        return productsManufacturer;
    }

    public void setProductsManufacturer(String productsManufacturer) {
        this.productsManufacturer = productsManufacturer;
    }

    public String getProductsBrand() {
        return productsBrand;
    }

    public void setProductsBrand(String productsBrand) {
        this.productsBrand = productsBrand;
    }

    public Integer getProductsDistrict() {
        return productsDistrict;
    }

    public void setProductsDistrict(Integer productsDistrict) {
        this.productsDistrict = productsDistrict;
    }

    public String getProductsChannel() {
        return productsChannel;
    }

    public void setProductsChannel(String productsChannel) {
        this.productsChannel = productsChannel;
    }

    public Integer getProductsIndate() {
        return productsIndate;
    }

    public void setProductsIndate(Integer productsIndate) {
        this.productsIndate = productsIndate;
    }

    public String getProductsImg() {
        return productsImg;
    }

    public void setProductsImg(String productsImg) {
        this.productsImg = productsImg;
    }

    public String getProductsDetail() {
        return productsDetail;
    }

    public void setProductsDetail(String productsDetail) {
        this.productsDetail = productsDetail;
    }

    public String getProductsLinkman() {
        return productsLinkman;
    }

    public void setProductsLinkman(String productsLinkman) {
        this.productsLinkman = productsLinkman;
    }

    public String getProductsPhone() {
        return productsPhone;
    }

    public void setProductsPhone(String productsPhone) {
        this.productsPhone = productsPhone;
    }

    public String getProductsArea() {
        return productsArea;
    }

    public void setProductsArea(String productsArea) {
        this.productsArea = productsArea;
    }
}
