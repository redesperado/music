package com.my.music.service;

import com.my.music.bean.MusicBean;

import java.util.List;
import java.util.Map;

public interface MusicService {
    public List<Map<String, Object>> getMusic();
}
