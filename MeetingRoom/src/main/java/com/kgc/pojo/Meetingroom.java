package com.kgc.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Meetingroom {
    private Integer id;

    private String meetingName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date meetingOrder;

    private String advanceName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMeetingName() {
        return meetingName;
    }

    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName == null ? null : meetingName.trim();
    }

    public Date getMeetingOrder() {
        return meetingOrder;
    }

    public void setMeetingOrder(Date meetingOrder) {
        this.meetingOrder = meetingOrder;
    }

    public String getAdvanceName() {
        return advanceName;
    }

    public void setAdvanceName(String advanceName) {
        this.advanceName = advanceName == null ? null : advanceName.trim();
    }
}