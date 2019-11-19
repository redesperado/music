package com.my.music.controller;

import com.my.music.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MusicController {

    @Autowired
    MusicService musicService;

    @RequestMapping("/music")
    public String findMusic(ModelMap modelMap){
        modelMap.addAttribute("getMusicInfo",musicService.getMusic());
        return "music.html";
    }

    @RequestMapping("/allMusic")
    @ResponseBody
    public Map getAllMusic(){
        Map map = new HashMap();
        map.put("allMusic",musicService.getMusic());
        return map;
    }

}
