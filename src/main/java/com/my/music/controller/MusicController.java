package com.my.music.controller;

import com.my.music.service.MusicService;
import com.my.music.service.WordService;
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
    
    @Autowired
    WordService wordService;

    @RequestMapping("/main")
    public String findMusic(ModelMap modelMap) throws Exception{
        modelMap.addAttribute("getWordInfo",wordService.getWords());
        modelMap.addAttribute("getMusicInfo",musicService.getMusic());
        modelMap.addAttribute("wordsCount",wordService.getWordCounts());
        return "main.html";
    }

    @RequestMapping("/allMusic")
    @ResponseBody
    public Map getAllMusic() throws Exception {
        Map map = new HashMap();
        map.put("allMusic",musicService.getMusic());
        return map;
    }

}
