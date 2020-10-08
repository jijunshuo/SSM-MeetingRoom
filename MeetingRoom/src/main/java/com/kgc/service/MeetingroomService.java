package com.kgc.service;

import com.kgc.pojo.Meetingroom;

import java.util.List;

public interface MeetingroomService {
    List<Meetingroom> selectAll();
    int add(Meetingroom meetingroom);
}
