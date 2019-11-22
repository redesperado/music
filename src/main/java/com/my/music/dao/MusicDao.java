package com.my.music.dao;

import com.my.music.bean.MusicBean;

import java.util.List;
import java.util.Map;


/*
    音乐DAO
 */
public interface MusicDao {
    //获取音乐list
    public List<Map<String,Object>> getMusic() throws Exception;
}
