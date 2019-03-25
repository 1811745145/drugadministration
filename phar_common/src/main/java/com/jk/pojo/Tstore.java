package com.jk.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @program: dru
 * @Date: 2019/3/20 19:52
 * @Author: Mr.Deng
 * @Description:
 */
public class Tstore {

  private Integer  storeId;

  private String  drugName;

  private String  drugImg;

  private Double  drugPrice;

  //优惠价
  private Double  discountsPrice;

  private String  drugType;

  //生产日期
  private Date drugDate;

  //有效期
  private Date  drugTime;

  //库存
  private Integer  inventoryNum;

  //描述
  private String  info;

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDrugImg() {
        return drugImg;
    }

    public void setDrugImg(String drugImg) {
        this.drugImg = drugImg;
    }

    public Double getDrugPrice() {
        return drugPrice;
    }

    public void setDrugPrice(Double drugPrice) {
        this.drugPrice = drugPrice;
    }

    public String getDrugType() {
        return drugType;
    }

    public void setDrugType(String drugType) {
        this.drugType = drugType;
    }

    public Double getDiscountsPrice() {
        return discountsPrice;
    }

    public void setDiscountsPrice(Double discountsPrice) {
        this.discountsPrice = discountsPrice;
    }

    public Date getDrugDate() {
        return drugDate;
    }

    public void setDrugDate(Date drugDate) {
        this.drugDate = drugDate;
    }

    public Date getDrugTime() {
        return drugTime;
    }

    public void setDrugTime(Date drugTime) {
        this.drugTime = drugTime;
    }

    public Integer getInventoryNum() {
        return inventoryNum;
    }

    public void setInventoryNum(Integer inventoryNum) {
        this.inventoryNum = inventoryNum;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Tstore{" +
                "storeId=" + storeId +
                ", drugName='" + drugName + '\'' +
                ", drugImg='" + drugImg + '\'' +
                ", drugPrice=" + drugPrice +
                ", discountsPrice=" + discountsPrice +
                ", drugType='" + drugType + '\'' +
                ", drugDate=" + drugDate +
                ", drugTime=" + drugTime +
                ", inventoryNum=" + inventoryNum +
                ", info='" + info + '\'' +
                '}';
    }
}
