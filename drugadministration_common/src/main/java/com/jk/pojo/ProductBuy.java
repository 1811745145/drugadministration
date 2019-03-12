package com.jk.pojo;

public class ProductBuy {

  private Integer product_Id;

  private String  product_Name;

  private String  product_Area;

  private String  product_Demand;

  private String  product_Contacts;

  private String  contacts_Phone;

    public Integer getProduct_Id() {
        return product_Id;
    }

    public void setProduct_Id(Integer product_Id) {
        this.product_Id = product_Id;
    }

    public String getProduct_Name() {
        return product_Name;
    }

    public void setProduct_Name(String product_Name) {
        this.product_Name = product_Name;
    }

    public String getProduct_Area() {
        return product_Area;
    }

    public void setProduct_Area(String product_Area) {
        this.product_Area = product_Area;
    }

    public String getProduct_Demand() {
        return product_Demand;
    }

    public void setProduct_Demand(String product_Demand) {
        this.product_Demand = product_Demand;
    }

    public String getProduct_Contacts() {
        return product_Contacts;
    }

    public void setProduct_Contacts(String product_Contacts) {
        this.product_Contacts = product_Contacts;
    }

    public String getContacts_Phone() {
        return contacts_Phone;
    }

    public void setContacts_Phone(String contacts_Phone) {
        this.contacts_Phone = contacts_Phone;
    }

    @Override
    public String toString() {
        return "ProductBuy{" +
                "product_Id=" + product_Id +
                ", product_Name='" + product_Name + '\'' +
                ", product_Area='" + product_Area + '\'' +
                ", product_Demand='" + product_Demand + '\'' +
                ", product_Contacts='" + product_Contacts + '\'' +
                ", contacts_Phone='" + contacts_Phone + '\'' +
                '}';
    }
}
