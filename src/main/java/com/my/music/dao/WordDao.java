package com.my.music.dao;



import com.my.music.bean.WordBean;

import java.util.List;
import java.util.Map;

public interface WordDao {

    List<Map<String,Object>> selectWords() throws Exception;

    WordBean selectCnByEn(String word) throws Exception;

    int insertWord(WordBean wordBean) throws Exception;
}
