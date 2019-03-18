package com.jk.pojo;

import java.util.Date;

public class CertificateBean {
    private Integer certificateId;//主键id
    private String  certificateBianhao;//证书编号//               不可为空   自增
    private String  certificateName;//证书名称
    private Date    certificateCerateTime;//发证时间
    private Date    certificateIndate;//有效期
    private String  certificateImg;//证件图
    private Integer enterpriseId;//企业ID

    public Integer getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(Integer certificateId) {
        this.certificateId = certificateId;
    }

    public String getCertificateBianhao() {
        return certificateBianhao;
    }

    public void setCertificateBianhao(String certificateBianhao) {
        this.certificateBianhao = certificateBianhao;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public Date getCertificateCerateTime() {
        return certificateCerateTime;
    }

    public void setCertificateCerateTime(Date certificateCerateTime) {
        this.certificateCerateTime = certificateCerateTime;
    }

    public Date getCertificateIndate() {
        return certificateIndate;
    }

    public void setCertificateIndate(Date certificateIndate) {
        this.certificateIndate = certificateIndate;
    }

    public String getCertificateImg() {
        return certificateImg;
    }

    public void setCertificateImg(String certificateImg) {
        this.certificateImg = certificateImg;
    }

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }
}
