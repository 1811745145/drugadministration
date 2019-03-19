package com.jk.pojo;

import java.util.Date;

public class WebShoppingcCart {
    private Integer cartid;//购物车id

    private Integer userid;//用户Id

    private Integer durgid;//药品Id

    private Long price;//单价

    private Date adddate;//加入购物车时间

    private String druginformation;//商品信息

    private String specification;//规格

    private String menterprise;//生产厂家

    private Integer acount;//数量

    public Integer getCartid() {
        return cartid;
    }

    public void setCartid(Integer cartid) {
        this.cartid = cartid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getDurgid() {
        return durgid;
    }

    public void setDurgid(Integer durgid) {
        this.durgid = durgid;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Date getAdddate() {
        return adddate;
    }

    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }

    public String getDruginformation() {
        return druginformation;
    }

    public void setDruginformation(String druginformation) {
        this.druginformation = druginformation;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getMenterprise() {
        return menterprise;
    }

    public void setMenterprise(String menterprise) {
        this.menterprise = menterprise;
    }

    public Integer getAcount() {
        return acount;
    }

    public void setAcount(Integer acount) {
        this.acount = acount;
    }
}
