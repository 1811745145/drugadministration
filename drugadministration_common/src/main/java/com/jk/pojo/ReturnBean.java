package com.jk.pojo;

public class ReturnBean {

    private Integer id;                 //主键id

    private String orderNumber;         //订单号

    private String returnNumber;        //退货单号

    private String returnGoods;         //退货商品

    private String returnTime;          //退货时间

    private String purchaser;           //采购商

    private String applicant;           //申请人

    private Double returnMoney;         //退货金额

    private Integer returnState;        //退货状态

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

    public String getReturnNumber() {
        return returnNumber;
    }

    public void setReturnNumber(String returnNumber) {
        this.returnNumber = returnNumber;
    }

    public String getReturnGoods() {
        return returnGoods;
    }

    public void setReturnGoods(String returnGoods) {
        this.returnGoods = returnGoods;
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
    }

    public String getPurchaser() {
        return purchaser;
    }

    public void setPurchaser(String purchaser) {
        this.purchaser = purchaser;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public Double getReturnMoney() {
        return returnMoney;
    }

    public void setReturnMoney(Double returnMoney) {
        this.returnMoney = returnMoney;
    }

    public Integer getReturnState() {
        return returnState;
    }

    public void setReturnState(Integer returnState) {
        this.returnState = returnState;
    }

    @Override
    public String toString() {
        return "ReturnBean{" +
                "id=" + id +
                ", orderNumber='" + orderNumber + '\'' +
                ", returnNumber='" + returnNumber + '\'' +
                ", returnGoods='" + returnGoods + '\'' +
                ", returnTime='" + returnTime + '\'' +
                ", purchaser='" + purchaser + '\'' +
                ", applicant='" + applicant + '\'' +
                ", returnMoney=" + returnMoney +
                ", returnState=" + returnState +
                '}';
    }
}
