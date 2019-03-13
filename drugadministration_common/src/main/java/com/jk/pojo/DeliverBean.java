package com.jk.pojo;

public class DeliverBean {

        private Integer id;                       //主键id

        private String tradeName;                 //商品名称

        private String purchaser;                 //采购商

        private String approvalNumber;            //批准文号

        private String commoditySpecifications;   //商品规格

        private Integer purchaseQuantity;         //购买数量

        private Integer quantityShipped;          //发货数量

        private Integer unitPrice;                //单价

        private Integer total;                    //合计

        private String  orderTime;                //下单时间

        private String deliveryTime;              //发货时间

        private String startDate;                 //下单开始时间

        private String stopDate;                  //下单结束时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getPurchaser() {
        return purchaser;
    }

    public void setPurchaser(String purchaser) {
        this.purchaser = purchaser;
    }

    public String getApprovalNumber() {
        return approvalNumber;
    }

    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber;
    }

    public String getCommoditySpecifications() {
        return commoditySpecifications;
    }

    public void setCommoditySpecifications(String commoditySpecifications) {
        this.commoditySpecifications = commoditySpecifications;
    }

    public Integer getPurchaseQuantity() {
        return purchaseQuantity;
    }

    public void setPurchaseQuantity(Integer purchaseQuantity) {
        this.purchaseQuantity = purchaseQuantity;
    }

    public Integer getQuantityShipped() {
        return quantityShipped;
    }

    public void setQuantityShipped(Integer quantityShipped) {
        this.quantityShipped = quantityShipped;
    }

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
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
        return "DeliverBean{" +
                "id=" + id +
                ", tradeName='" + tradeName + '\'' +
                ", purchaser='" + purchaser + '\'' +
                ", approvalNumber='" + approvalNumber + '\'' +
                ", commoditySpecifications='" + commoditySpecifications + '\'' +
                ", purchaseQuantity=" + purchaseQuantity +
                ", quantityShipped=" + quantityShipped +
                ", unitPrice=" + unitPrice +
                ", total=" + total +
                ", orderTime='" + orderTime + '\'' +
                ", deliveryTime='" + deliveryTime + '\'' +
                ", startDate='" + startDate + '\'' +
                ", stopDate='" + stopDate + '\'' +
                '}';
    }
}
