package com.jk.pojo;

public class ShoppingCartBean {

    private     Integer           scId;//购物车id
    private     Integer          stId;//购物车商品id；
    private     Integer          csId;//购物车商品id；
    private     Double           stunitPrice;//单价
    private     Integer          stCount;//数量
    private     Double           stsubTotal;//小计

    private     String           drugdetailsimg;//药品图片
    private     String           drugdetailsName;//药品名称
    private     String           drugdetailsUSL;//规格
    private     String            type;//药品类型

    public String getDrugdetailsimg() {
        return drugdetailsimg;
    }

    public void setDrugdetailsimg(String drugdetailsimg) {
        this.drugdetailsimg = drugdetailsimg;
    }

    public String getDrugdetailsName() {
        return drugdetailsName;
    }

    public void setDrugdetailsName(String drugdetailsName) {
        this.drugdetailsName = drugdetailsName;
    }

    public String getDrugdetailsUSL() {
        return drugdetailsUSL;
    }

    public void setDrugdetailsUSL(String drugdetailsUSL) {
        this.drugdetailsUSL = drugdetailsUSL;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getScId() {
        return scId;
    }

    public void setScId(Integer scId) {
        this.scId = scId;
    }

    public Integer getStId() {
        return stId;
    }

    public void setStId(Integer stId) {
        this.stId = stId;
    }

    public Integer getCsId() {
        return csId;
    }

    public void setCsId(Integer csId) {
        this.csId = csId;
    }

    public Double getStunitPrice() {
        return stunitPrice;
    }

    public void setStunitPrice(Double stunitPrice) {
        this.stunitPrice = stunitPrice;
    }

    public Integer getStCount() {
        return stCount;
    }

    public void setStCount(Integer stCount) {
        this.stCount = stCount;
    }

    public Double getStsubTotal() {
        return stsubTotal;
    }

    public void setStsubTotal(Double stsubTotal) {
        this.stsubTotal = stsubTotal;
    }

    @Override
    public String toString() {
        return "ShoppingCartBean{" +
                "scId=" + scId +
                ", stId=" + stId +
                ", csId=" + csId +
                ", stunitPrice=" + stunitPrice +
                ", stCount=" + stCount +
                ", stsubTotal=" + stsubTotal +
                ", drugdetailsimg='" + drugdetailsimg + '\'' +
                ", drugdetailsName='" + drugdetailsName + '\'' +
                ", drugdetailsUSL='" + drugdetailsUSL + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
