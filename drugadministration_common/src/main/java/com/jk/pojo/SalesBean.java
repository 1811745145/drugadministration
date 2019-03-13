package com.jk.pojo;

public class SalesBean {

    private Integer id;                //主键id

    private String orderNumber;        //订单号

    private String procurementGoods;   //采购商品

    private String commoditySpecifications;   //商品规格

    private String orderTime;          //下单时间

    private String paymentTime;        //支付时间

    private String purchaser;          //采购商

    private Integer purchaseQuantity;  //采购数量

    private Integer promoteProduct;    //推广产品

    private Integer activitiesProduct; //活动产品

    private Double fundsReceived;      //实收款

    private Integer orderStatus;       //订单状态

    private String photo;              //图片

    private String startDate;          //下单开始时间

    private String stopDate;           //下单结束时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getProcurementGoods() {
        return procurementGoods;
    }

    public void setProcurementGoods(String procurementGoods) {
        this.procurementGoods = procurementGoods;
    }

    public String getCommoditySpecifications() {
        return commoditySpecifications;
    }

    public void setCommoditySpecifications(String commoditySpecifications) {
        this.commoditySpecifications = commoditySpecifications;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
    }

    public String getPurchaser() {
        return purchaser;
    }

    public void setPurchaser(String purchaser) {
        this.purchaser = purchaser;
    }

    public Integer getPurchaseQuantity() {
        return purchaseQuantity;
    }

    public void setPurchaseQuantity(Integer purchaseQuantity) {
        this.purchaseQuantity = purchaseQuantity;
    }

    public Integer getPromoteProduct() {
        return promoteProduct;
    }

    public void setPromoteProduct(Integer promoteProduct) {
        this.promoteProduct = promoteProduct;
    }

    public Integer getActivitiesProduct() {
        return activitiesProduct;
    }

    public void setActivitiesProduct(Integer activitiesProduct) {
        this.activitiesProduct = activitiesProduct;
    }

    public Double getFundsReceived() {
        return fundsReceived;
    }

    public void setFundsReceived(Double fundsReceived) {
        this.fundsReceived = fundsReceived;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStopDate() {
        return stopDate;
    }

    public void setStopDate(String stopDate) {
        this.stopDate = stopDate;
    }

    @Override
    public String toString() {
        return "SalesBean{" +
                "id=" + id +
                ", orderNumber='" + orderNumber + '\'' +
                ", procurementGoods='" + procurementGoods + '\'' +
                ", commoditySpecifications='" + commoditySpecifications + '\'' +
                ", orderTime='" + orderTime + '\'' +
                ", paymentTime='" + paymentTime + '\'' +
                ", purchaser='" + purchaser + '\'' +
                ", purchaseQuantity=" + purchaseQuantity +
                ", promoteProduct=" + promoteProduct +
                ", activitiesProduct=" + activitiesProduct +
                ", fundsReceived=" + fundsReceived +
                ", orderStatus=" + orderStatus +
                ", photo='" + photo + '\'' +
                ", startDate='" + startDate + '\'' +
                ", stopDate='" + stopDate + '\'' +
                '}';
    }
}
