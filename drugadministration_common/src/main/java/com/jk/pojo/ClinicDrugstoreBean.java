package com.jk.pojo;

public class ClinicDrugstoreBean {

    private Integer clinicId;
    private String  drugstoreNames;//  药店名称
    private Integer provinceId;   //地址
    private String contactWay;// 联系方式
    private String  provinceName;

    public Integer getClinicId() {
        return clinicId;
    }

    public String getDrugstoreNames() {
        return drugstoreNames;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public String getContactWay() {
        return contactWay;
    }

    public String getProvinceName() {
        return provinceName;
    }
}
