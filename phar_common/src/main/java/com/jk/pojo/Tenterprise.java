package com.jk.pojo;

/**
 * @program: dru
 * @Date: 2019/3/19 20:09
 * @Author: Mr.Deng
 * @Description:
 */
public class Tenterprise {

  private Integer  enterpriseId;

  private String famousEnterprise;

  private Integer enterpriseType;

  private String enterpriseImg;

  private String type;

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getFamousEnterprise() {
        return famousEnterprise;
    }

    public void setFamousEnterprise(String famousEnterprise) {
        this.famousEnterprise = famousEnterprise;
    }

    public Integer getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(Integer enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public String getEnterpriseImg() {
        return enterpriseImg;
    }

    public void setEnterpriseImg(String enterpriseImg) {
        this.enterpriseImg = enterpriseImg;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Tenterprise{" +
                "enterpriseId=" + enterpriseId +
                ", famousEnterprise='" + famousEnterprise + '\'' +
                ", enterpriseType=" + enterpriseType +
                ", enterpriseImg='" + enterpriseImg + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
