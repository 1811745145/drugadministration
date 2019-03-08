package com.jk.pojo;

import java.util.Date;

/**
 * 退货单查询
 */
public class DrugNoReturn {

    private Integer  returnId;

    private String   returnName;

    private String returnTime;

    private Integer  returnNum;

    private String returnSupply;

    private Double returnPrice;

    private Integer returnType;

    private String returnImg;

    public Integer getReturnId() {
        return returnId;
    }

    public void setReturnId(Integer returnId) {
        this.returnId = returnId;
    }

    public String getReturnName() {
        return returnName;
    }

    public void setReturnName(String returnName) {
        this.returnName = returnName;
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
    }

    public Integer getReturnNum() {
        return returnNum;
    }

    public void setReturnNum(Integer returnNum) {
        this.returnNum = returnNum;
    }

    public String getReturnSupply() {
        return returnSupply;
    }

    public void setReturnSupply(String returnSupply) {
        this.returnSupply = returnSupply;
    }

    public Double getReturnPrice() {
        return returnPrice;
    }

    public void setReturnPrice(Double returnPrice) {
        this.returnPrice = returnPrice;
    }

    public Integer getReturnType() {
        return returnType;
    }

    public void setReturnType(Integer returnType) {
        this.returnType = returnType;
    }

    public String getReturnImg() {
        return returnImg;
    }

    public void setReturnImg(String returnImg) {
        this.returnImg = returnImg;
    }

    @Override
    public String toString() {
        return "DrugNoReturn{" +
                "returnId=" + returnId +
                ", returnName='" + returnName + '\'' +
                ", returnTime=" + returnTime +
                ", returnNum=" + returnNum +
                ", returnSupply='" + returnSupply + '\'' +
                ", returnPrice=" + returnPrice +
                ", returnType=" + returnType +
                ", returnImg='" + returnImg + '\'' +
                '}';
    }
}
