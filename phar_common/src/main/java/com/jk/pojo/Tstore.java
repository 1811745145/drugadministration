package com.jk.pojo;

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

  private String  drugType;

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

    @Override
    public String toString() {
        return "Tstore{" +
                "storeId=" + storeId +
                ", drugName='" + drugName + '\'' +
                ", drugImg='" + drugImg + '\'' +
                ", drugPrice=" + drugPrice +
                ", drugType='" + drugType + '\'' +
                '}';
    }
}
