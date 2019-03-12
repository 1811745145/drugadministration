package com.jk.pojo;

import java.io.Serializable;

public class ProductBuy implements Serializable {

  private static final long serialVersionUID = 8405870292054914807L;

  private Integer  drug_Id;

  private String  drug_Name;

  private String  manufacturers_Name;

  private String  specifications;

  private String  area;

  private String  contacts;

  private String  phone;

    public Integer getDrug_Id() {
        return drug_Id;
    }

    public void setDrug_Id(Integer drug_Id) {
        this.drug_Id = drug_Id;
    }

    public String getDrug_Name() {
        return drug_Name;
    }

    public void setDrug_Name(String drug_Name) {
        this.drug_Name = drug_Name;
    }

    public String getManufacturers_Name() {
        return manufacturers_Name;
    }

    public void setManufacturers_Name(String manufacturers_Name) {
        this.manufacturers_Name = manufacturers_Name;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "ProductBuy{" +
                "drug_Id=" + drug_Id +
                ", drug_Name='" + drug_Name + '\'' +
                ", manufacturers_Name='" + manufacturers_Name + '\'' +
                ", specifications='" + specifications + '\'' +
                ", area='" + area + '\'' +
                ", contacts='" + contacts + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
