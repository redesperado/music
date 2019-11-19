package com.my.music.dao;

import com.my.music.bean.MusicBean;

import java.util.List;
import java.util.Map;

public interface MusicDao {
    public List<Map<String,Object>> getMusic();
}
