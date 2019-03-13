
package com.jk.pojo;

import java.io.Serializable;
import java.util.Date;

public class InvestmentBean implements Serializable {

    private Integer id;
    private String investmentClass;	//招商分类
    private String investmentTitle;
    private String expirationDate;	//过期时间
    private String investmentRegion;	//招商区域	varbit(200)	200
    private String investmentAmount;	//招商金额	varchar(20)	20
    private String depositRequired	;//需交保证金	varchar(20)	20
    private String investmentName;//	招商名称	varchar(25)	25
    private String investmentSpecifications;//	招商规格	varchar(20)	20
    private String medicineQuasiCharacter;//	国药准字	varchar(20)	20
    private String manufacturer;//	生产厂家	varchar(20)	20
    private String drugNumber;//	药品编号	varchar(20)	20
    private String pieceCount;//	件装树	varchar(20)	20
    private String trademark;//	商标	varchar(20)	20
    private Integer medicalType;//	医保类型	int
    private Integer drugList;//	基药目录	int
    private String investmentInfo;//	招商信息说明	varchar(100)	100
    private String  status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInvestmentClass() {
        return investmentClass;
    }

    public void setInvestmentClass(String investmentClass) {
        this.investmentClass = investmentClass;
    }

    public String getInvestmentTitle() {
        return investmentTitle;
    }

    public void setInvestmentTitle(String investmentTitle) {
        this.investmentTitle = investmentTitle;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getInvestmentRegion() {
        return investmentRegion;
    }

    public void setInvestmentRegion(String investmentRegion) {
        this.investmentRegion = investmentRegion;
    }

    public String getInvestmentAmount() {
        return investmentAmount;
    }

    public void setInvestmentAmount(String investmentAmount) {
        this.investmentAmount = investmentAmount;
    }

    public String getDepositRequired() {
        return depositRequired;
    }

    public void setDepositRequired(String depositRequired) {
        this.depositRequired = depositRequired;
    }

    public String getInvestmentName() {
        return investmentName;
    }

    public void setInvestmentName(String investmentName) {
        this.investmentName = investmentName;
    }

    public String getInvestmentSpecifications() {
        return investmentSpecifications;
    }

    public void setInvestmentSpecifications(String investmentSpecifications) {
        this.investmentSpecifications = investmentSpecifications;
    }

    public String getMedicineQuasiCharacter() {
        return medicineQuasiCharacter;
    }

    public void setMedicineQuasiCharacter(String medicineQuasiCharacter) {
        this.medicineQuasiCharacter = medicineQuasiCharacter;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDrugNumber() {
        return drugNumber;
    }

    public void setDrugNumber(String drugNumber) {
        this.drugNumber = drugNumber;
    }

    public String getPieceCount() {
        return pieceCount;
    }

    public void setPieceCount(String pieceCount) {
        this.pieceCount = pieceCount;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public Integer getMedicalType() {
        return medicalType;
    }

    public void setMedicalType(Integer medicalType) {
        this.medicalType = medicalType;
    }

    public Integer getDrugList() {
        return drugList;
    }

    public void setDrugList(Integer drugList) {
        this.drugList = drugList;
    }

    public String getInvestmentInfo() {
        return investmentInfo;
    }

    public void setInvestmentInfo(String investmentInfo) {
        this.investmentInfo = investmentInfo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
