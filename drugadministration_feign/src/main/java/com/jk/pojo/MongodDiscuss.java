package com.jk.pojo;


import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Document(collection="1808_mongo")
public class MongodDiscuss {

    private String discuss_Id;

    private String merchant;

    private String discuss;

    private Double discuss_Grade;

    private String discuss_Message;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date discuss_Time;

    @Transient // 临时字段
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date startTime;

    @Transient
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date endTime;

    public String getDiscuss_Id() {
        return discuss_Id;
    }

    public void setDiscuss_Id(String discuss_Id) {
        this.discuss_Id = discuss_Id;
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public String getDiscuss() {
        return discuss;
    }

    public void setDiscuss(String discuss) {
        this.discuss = discuss;
    }

    public Double getDiscuss_Grade() {
        return discuss_Grade;
    }

    public void setDiscuss_Grade(Double discuss_Grade) {
        this.discuss_Grade = discuss_Grade;
    }

    public String getDiscuss_Message() {
        return discuss_Message;
    }

    public void setDiscuss_Message(String discuss_Message) {
        this.discuss_Message = discuss_Message;
    }

    public Date getDiscuss_Time() {
        return discuss_Time;
    }

    public void setDiscuss_Time(Date discuss_Time) {
        this.discuss_Time = discuss_Time;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "MongodDiscuss{" +
                "discuss_Id='" + discuss_Id + '\'' +
                ", merchant='" + merchant + '\'' +
                ", discuss='" + discuss + '\'' +
                ", discuss_Grade=" + discuss_Grade +
                ", discuss_Message='" + discuss_Message + '\'' +
                ", discuss_Time=" + discuss_Time +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
