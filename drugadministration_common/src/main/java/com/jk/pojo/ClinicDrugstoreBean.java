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

    public void setClinicId(Integer clinicId) {
        this.clinicId = clinicId;
    }

    public String getDrugstoreNames() {
        return drugstoreNames;
    }

    public void setDrugstoreNames(String drugstoreNames) {
        this.drugstoreNames = drugstoreNames;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getContactWay() {
        return contactWay;
    }

    public void setContactWay(String contactWay) {
        this.contactWay = contactWay;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}
