package com.jk.pojo;

public class Address {
    private Integer address_Id;
    private String address_name;
    private String address_area;
    private String detailedaddress;
    private String zipcode;
    private String phone;

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
}
