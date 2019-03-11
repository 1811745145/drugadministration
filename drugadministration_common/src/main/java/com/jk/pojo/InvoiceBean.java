package com.jk.pojo;

public class InvoiceBean {

    private Integer id;                   //主键id

    private String invoiceType;           //发票类型

    private String orderNumber;           //订单号

    private String orderTime;             //下单时间

    private String sourcingCompany;       //采购企业

    private String sourcingName;          //采购人姓名

    private Integer invoiceState;          //发票状态

    private String invoiceContent;        //发票内容

    private Integer invoiceAmount;        //发票金额

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getSourcingCompany() {
        return sourcingCompany;
    }

    public void setSourcingCompany(String sourcingCompany) {
        this.sourcingCompany = sourcingCompany;
    }

    public String getSourcingName() {
        return sourcingName;
    }

    public void setSourcingName(String sourcingName) {
        this.sourcingName = sourcingName;
    }

    public Integer getInvoiceState() {
        return invoiceState;
    }

    public void setInvoiceState(Integer invoiceState) {
        this.invoiceState = invoiceState;
    }

    public String getInvoiceContent() {
        return invoiceContent;
    }

    public void setInvoiceContent(String invoiceContent) {
        this.invoiceContent = invoiceContent;
    }

    public Integer getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(Integer invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    @Override
    public String toString() {
        return "InvoiceBean{" +
                "id=" + id +
                ", invoiceType='" + invoiceType + '\'' +
                ", orderNumber='" + orderNumber + '\'' +
                ", orderTime='" + orderTime + '\'' +
                ", sourcingCompany='" + sourcingCompany + '\'' +
                ", sourcingName='" + sourcingName + '\'' +
                ", invoiceState=" + invoiceState +
                ", invoiceContent='" + invoiceContent + '\'' +
                ", invoiceAmount=" + invoiceAmount +
                '}';
    }
}
