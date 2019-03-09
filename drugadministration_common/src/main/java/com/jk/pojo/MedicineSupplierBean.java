package com.jk.pojo;


/*Z药品供应商表*/
public class MedicineSupplierBean {
private     Integer      supplierId;//   商家id
private    String       supplierName;// 商家名字

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

    @Override
    public String toString() {
        return "MedicineSupplierBean{" +
                "supplierId=" + supplierId +
                ", supplierName='" + supplierName + '\'' +
                '}';
    }
}
