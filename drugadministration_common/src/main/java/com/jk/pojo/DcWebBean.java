package com.jk.pojo;

public class DcWebBean {

    private Integer durgId;//  药品序号(id)
    private Integer drugNumber;//  药品编号
    private String  commonName;// 通用名
    private String  dosageForm;// 剂型
    private String  drugCharacteristics ;//药品特征
    private String  specification;// 规格
    private Integer conversionCoefficient;// 转换系数
    private String  packingUnit ;// 包装单位
    private String  directoryType  ;//目录类型
    private String manufacturerName;// 生产企业
    private long    purchasePrice;//  采购价
    private long   interimPrice ;// 临时价


    public Integer getDurgId() {
        return durgId;
    }

    public void setDurgId(Integer durgId) {
        this.durgId = durgId;
    }

    public Integer getDrugNumber() {
        return drugNumber;
    }

    public void setDrugNumber(Integer drugNumber) {
        this.drugNumber = drugNumber;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getDosageForm() {
        return dosageForm;
    }

    public void setDosageForm(String dosageForm) {
        this.dosageForm = dosageForm;
    }

    public String getDrugCharacteristics() {
        return drugCharacteristics;
    }

    public void setDrugCharacteristics(String drugCharacteristics) {
        this.drugCharacteristics = drugCharacteristics;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public Integer getConversionCoefficient() {
        return conversionCoefficient;
    }

    public void setConversionCoefficient(Integer conversionCoefficient) {
        this.conversionCoefficient = conversionCoefficient;
    }

    public String getPackingUnit() {
        return packingUnit;
    }

    public void setPackingUnit(String packingUnit) {
        this.packingUnit = packingUnit;
    }

    public String getDirectoryType() {
        return directoryType;
    }

    public void setDirectoryType(String directoryType) {
        this.directoryType = directoryType;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public long getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(long purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public long getInterimPrice() {
        return interimPrice;
    }

    public void setInterimPrice(long interimPrice) {
        this.interimPrice = interimPrice;
    }
}
