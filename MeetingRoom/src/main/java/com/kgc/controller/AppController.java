package com.kgc.controller;

import com.kgc.pojo.Meetingroom;
import com.kgc.service.MeetingroomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class AppController {
    @Resource
    MeetingroomService meetingroomService;

    @RequestMapping("/")
    public String index(Model model) {
        List<Meetingroom> meetingrooms = meetingroomService.selectAll();
        model.addAttribute("meetingrooms", meetingrooms);
        return "index";
    }

    @RequestMapping("/toadd")
    public String toadd() {
        return "add";
    }

    @RequestMapping("/doadd")
    public String doadd(Meetingroom meetingroom) {
        int add = meetingroomService.add(meetingroom);
        if (add > 0) {
            return "redirect:/";
        } else {
            return "add";
        }


    }
}
