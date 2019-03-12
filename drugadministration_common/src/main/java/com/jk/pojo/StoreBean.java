package com.jk.pojo;

public class StoreBean {

    private Integer id;

    private String shopName;

    private String storeContact;

    private Integer storePhone;

    private String storeLogo;

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getStoreContact() {
        return storeContact;
    }

    public void setStoreContact(String storeContact) {
        this.storeContact = storeContact;
    }

    public Integer getStorePhone() {
        return storePhone;
    }

    public void setStorePhone(Integer storePhone) {
        this.storePhone = storePhone;
    }

    public String getStoreLogo() {
        return storeLogo;
    }

    public void setStoreLogo(String storeLogo) {
        this.storeLogo = storeLogo;
    }

    @Override
    public String toString() {
        return "StoreBean{" +
                "id=" + id +
                ", shopName='" + shopName + '\'' +
                ", storeContact='" + storeContact + '\'' +
                ", storePhone=" + storePhone +
                ", storeLogo='" + storeLogo + '\'' +
                '}';
    }
}
