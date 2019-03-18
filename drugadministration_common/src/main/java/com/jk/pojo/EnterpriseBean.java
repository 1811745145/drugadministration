package com.jk.pojo;

public class EnterpriseBean {

    private Integer enterpriseId;//主键id               不可为空
    private String  enterpriseType;//企业类型
    private String  enterpriseName;//企业名称
    private String  businessNumber;//营业执照注册号
    private String  enterpriseLinkman;//企业联系人
    private String  enterprisePhone;//联系电话
    private String  enterpriseArea;//所属地址
    private String  enterpriseAddress;//详细地址

    private Integer enterpriseDistrict;//代理区域：：代理人
    private Integer provinceId;//省id
    private Integer cityId;//市id
    private Integer districtId;//区id

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(String enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getBusinessNumber() {
        return businessNumber;
    }

    public void setBusinessNumber(String businessNumber) {
        this.businessNumber = businessNumber;
    }

    public String getEnterpriseLinkman() {
        return enterpriseLinkman;
    }

    public void setEnterpriseLinkman(String enterpriseLinkman) {
        this.enterpriseLinkman = enterpriseLinkman;
    }

    public String getEnterprisePhone() {
        return enterprisePhone;
    }

    public void setEnterprisePhone(String enterprisePhone) {
        this.enterprisePhone = enterprisePhone;
    }

    public String getEnterpriseArea() {
        return enterpriseArea;
    }

    public void setEnterpriseArea(String enterpriseArea) {
        this.enterpriseArea = enterpriseArea;
    }

    public String getEnterpriseAddress() {
        return enterpriseAddress;
    }

    public void setEnterpriseAddress(String enterpriseAddress) {
        this.enterpriseAddress = enterpriseAddress;
    }


    public Integer getEnterpriseDistrict() {
        return enterpriseDistrict;
    }

    public void setEnterpriseDistrict(Integer enterpriseDistrict) {
        this.enterpriseDistrict = enterpriseDistrict;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }
}
