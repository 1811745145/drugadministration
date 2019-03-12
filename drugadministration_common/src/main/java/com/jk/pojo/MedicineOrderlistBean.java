package com.jk.pojo;

import java.util.Date;

public class MedicineOrderlistBean {

    private          String orderId;//  订单id
    private        Integer  supplierId;//；供应商id
    private       Integer  drugdetailsid;//； 商品id
    private       Date paidTime;//  付款时间
    private        Integer  ordercount;    //数量
    private       Double  disbursements;//；实付款
    private       Integer  orderStatus ;//订单状态 //1待支付（默认）    2待发货 3待收货  4待评价    5关闭交易



    private       String   supplierName;//,商家名字
    private       String   drugdetailsimg;//,药品图片
    private       String   drugdetailsName;//,药品名称
    private       String   ctype;  //,类型

    private       Double   drugdetailsNameprice;//,药品采购价

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getDrugdetailsid() {
        return drugdetailsid;
    }

    public void setDrugdetailsid(Integer drugdetailsid) {
        this.drugdetailsid = drugdetailsid;
    }

    public Date getPaidTime() {
        return paidTime;
    }

    public void setPaidTime(Date paidTime) {
        this.paidTime = paidTime;
    }

    public Integer getOrdercount() {
        return ordercount;
    }

    public void setOrdercount(Integer ordercount) {
        this.ordercount = ordercount;
    }

    public Double getDisbursements() {
        return disbursements;
    }

    public void setDisbursements(Double disbursements) {
        this.disbursements = disbursements;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

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

    public String getCtype() {
        return ctype;
    }

    public void setCtype(String ctype) {
        this.ctype = ctype;
    }

    public Double getDrugdetailsNameprice() {
        return drugdetailsNameprice;
    }

    public void setDrugdetailsNameprice(Double drugdetailsNameprice) {
        this.drugdetailsNameprice = drugdetailsNameprice;
    }

    @Override
    public String toString() {
        return "MedicineOrderlistBean{" +
                "orderId='" + orderId + '\'' +
                ", supplierId=" + supplierId +
                ", drugdetailsid=" + drugdetailsid +
                ", paidTime=" + paidTime +
                ", ordercount=" + ordercount +
                ", disbursements=" + disbursements +
                ", orderStatus=" + orderStatus +
                ", supplierName='" + supplierName + '\'' +
                ", drugdetailsimg='" + drugdetailsimg + '\'' +
                ", drugdetailsName='" + drugdetailsName + '\'' +
                ", ctype='" + ctype + '\'' +
                ", drugdetailsNameprice=" + drugdetailsNameprice +
                '}';
    }
}
