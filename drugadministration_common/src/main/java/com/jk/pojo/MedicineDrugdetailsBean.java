package com.jk.pojo;

/*药品展示表*/
public class MedicineDrugdetailsBean {

    private     Integer          drugdetailsid;                // 药品编号；
    private     String           drugdetailsimg;                //药品图片
    private     String           drugdetailsName;              //药品名称

    private     Integer          supplierId;                   //供应商家id；
    private     String           supplierName;                //供应商家名称；

    private     Double           drugdetailsNameprice;        //药品采购价
    private     String           drugdetailsUSL;              //药品规格
    private     String           expiryDate;                  //有效期限；
    private     Integer          drugdetailsquantity;        //包装数量
    private     Integer          drugdetailsnventory;         //库存
    private     String           type;                  //药品类U型；

    public Integer getDrugdetailsid() {
        return drugdetailsid;
    }

    public void setDrugdetailsid(Integer drugdetailsid) {
        this.drugdetailsid = drugdetailsid;
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

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Double getDrugdetailsNameprice() {
        return drugdetailsNameprice;
    }

    public void setDrugdetailsNameprice(Double drugdetailsNameprice) {
        this.drugdetailsNameprice = drugdetailsNameprice;
    }

    public String getDrugdetailsUSL() {
        return drugdetailsUSL;
    }

    public void setDrugdetailsUSL(String drugdetailsUSL) {
        this.drugdetailsUSL = drugdetailsUSL;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Integer getDrugdetailsquantity() {
        return drugdetailsquantity;
    }

    public void setDrugdetailsquantity(Integer drugdetailsquantity) {
        this.drugdetailsquantity = drugdetailsquantity;
    }

    public Integer getDrugdetailsnventory() {
        return drugdetailsnventory;
    }

    public void setDrugdetailsnventory(Integer drugdetailsnventory) {
        this.drugdetailsnventory = drugdetailsnventory;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "MedicineDrugdetailsBean{" +
                "drugdetailsid=" + drugdetailsid +
                ", drugdetailsimg='" + drugdetailsimg + '\'' +
                ", drugdetailsName='" + drugdetailsName + '\'' +
                ", supplierId=" + supplierId +
                ", supplierName='" + supplierName + '\'' +
                ", drugdetailsNameprice=" + drugdetailsNameprice +
                ", drugdetailsUSL='" + drugdetailsUSL + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", drugdetailsquantity=" + drugdetailsquantity +
                ", drugdetailsnventory=" + drugdetailsnventory +
                ", type='" + type + '\'' +
                '}';
    }
}
