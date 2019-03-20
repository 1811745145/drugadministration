package com.jk.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class WebShoppingcCart  implements Serializable {
    
    private Integer cartid;//购物车id

    private Integer userid;//用户Id

    private Date adddate;//加入购物车时间

    private List<WebDrugBean> webDrugBean;

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

    public Date getAdddate() {
        return adddate;
    }

    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }

    public List<WebDrugBean> getWebDrugBean() {
        return webDrugBean;
    }

    public void setWebDrugBean(List<WebDrugBean> webDrugBean) {
        this.webDrugBean = webDrugBean;
    }
}
