package com.jk.pojo;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Document(collection="mongo_exchange")
public class MongoExchange {

  private String  id;

  private String  conversion_Name;

  private Integer  conversion_Num;

  private Integer  goods_Type;

  private Integer  inventory_Num;

  private Integer  conversion_Integral;

  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date conversion_Time;

  private Integer dispatching_Type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getConversion_Name() {
        return conversion_Name;
    }

    public void setConversion_Name(String conversion_Name) {
        this.conversion_Name = conversion_Name;
    }

    public Integer getConversion_Num() {
        return conversion_Num;
    }

    public void setConversion_Num(Integer conversion_Num) {
        this.conversion_Num = conversion_Num;
    }

    public Integer getGoods_Type() {
        return goods_Type;
    }

    public void setGoods_Type(Integer goods_Type) {
        this.goods_Type = goods_Type;
    }

    public Integer getInventory_Num() {
        return inventory_Num;
    }

    public void setInventory_Num(Integer inventory_Num) {
        this.inventory_Num = inventory_Num;
    }

    public Integer getConversion_Integral() {
        return conversion_Integral;
    }

    public void setConversion_Integral(Integer conversion_Integral) {
        this.conversion_Integral = conversion_Integral;
    }

    public Date getConversion_Time() {
        return conversion_Time;
    }

    public void setConversion_Time(Date conversion_Time) {
        this.conversion_Time = conversion_Time;
    }

    public Integer getDispatching_Type() {
        return dispatching_Type;
    }

    public void setDispatching_Type(Integer dispatching_Type) {
        this.dispatching_Type = dispatching_Type;
    }

    @Override
    public String toString() {
        return "MongoExchange{" +
                "id='" + id + '\'' +
                ", conversion_Name='" + conversion_Name + '\'' +
                ", conversion_Num=" + conversion_Num +
                ", goods_Type=" + goods_Type +
                ", inventory_Num=" + inventory_Num +
                ", conversion_Integral=" + conversion_Integral +
                ", conversion_Time=" + conversion_Time +
                ", dispatching_Type=" + dispatching_Type +
                '}';
    }
}
