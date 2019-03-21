package com.jk.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class WebShoppingcCart implements Serializable {

    private static final long serialVersionUID = 5557513998008525439L;
    private Integer cartid;//购物车id

    private String adddate;//加入购物车时间

    private List<WebDrugBean> webDrugBean;

    public Integer getCartid() {
        return cartid;
    }

    public void setCartid(Integer cartid) {
        this.cartid = cartid;
    }


    public String getAdddate() {
        return adddate;
    }

    public void setAdddate(String adddate) {
        this.adddate = adddate;
    }

    public List<WebDrugBean> getWebDrugBean() {
        return webDrugBean;
    }

    public void setWebDrugBean(List<WebDrugBean> webDrugBean) {
        this.webDrugBean = webDrugBean;
    }
}
