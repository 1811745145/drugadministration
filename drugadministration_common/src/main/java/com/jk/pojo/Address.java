package com.jk.pojo;


import java.io.Serializable;

public class Address implements Serializable {
    private static final long serialVersionUID = 8405870292054914807L;
    private Integer address_Id;
    private String address_name;
    private String address_area;
    private String detailedaddress;
    private String zipcode;
    private String phone;
    private String province;
    private String city;
    private Integer area_province;
    private Integer area_city;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getAddress_Id() {
        return address_Id;
    }

    public void setAddress_Id(Integer address_Id) {
        this.address_Id = address_Id;
    }

    public String getAddress_name() {
        return address_name;
    }

    public void setAddress_name(String address_name) {
        this.address_name = address_name;
    }

    public String getAddress_area() {
        return address_area;
    }

    public void setAddress_area(String address_area) {
        this.address_area = address_area;
    }

    public String getDetailedaddress() {
        return detailedaddress;
    }

    public void setDetailedaddress(String detailedaddress) {
        this.detailedaddress = detailedaddress;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getArea_province() {
        return area_province;
    }

    public void setArea_province(Integer area_province) {
        this.area_province = area_province;
    }

    public Integer getArea_city() {
        return area_city;
    }

    public void setArea_city(Integer area_city) {
        this.area_city = area_city;
    }
}
