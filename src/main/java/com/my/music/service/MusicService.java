package com.my.music.service;

import com.my.music.bean.MusicBean;

import java.util.List;
import java.util.Map;

/*
    音乐服务接口
 */
public interface MusicService {

    //获取音乐列表
    public List<Map<String, Object>> getMusic() throws Exception;
}
