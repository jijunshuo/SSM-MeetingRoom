package com.kgc.service.impl;

import com.kgc.mapper.MeetingroomMapper;
import com.kgc.pojo.Meetingroom;
import com.kgc.service.MeetingroomService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MeetingroomServiceImpl implements MeetingroomService {
    @Resource
    MeetingroomMapper meetingroomMapper;

    @Override
    public List<Meetingroom> selectAll() {
        List<Meetingroom> meetingrooms = meetingroomMapper.selectByExample(null);
        return meetingrooms;
    }

    @Override
    public int add(Meetingroom meetingroom) {
        int insert = meetingroomMapper.insert(meetingroom);
        return insert;
    }
}
