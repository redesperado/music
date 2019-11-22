package com.my.music.dao;



import com.my.music.bean.WordBean;

import java.util.List;
import java.util.Map;

/*
    单词DAO
 */
public interface WordDao {

    //获取单词list
    List<Map<String,Object>> selectWords() throws Exception;

    //根据英语查汉语
    WordBean selectCnByEn(String word) throws Exception;

    //新增单词
    int insertWord(WordBean wordBean) throws Exception;

    //获取单词总数
    int selectWordCounts() throws Exception;
}
