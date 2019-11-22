package com.my.music.service;



import com.my.music.bean.WordBean;

import java.util.List;
import java.util.Map;

/*
    单词服务接口
 */
public interface WordService {

    //获取单词列表
    List<Map<String,Object>> getWords() throws Exception;

    //根据英语查汉语
    WordBean getCnByEn(String word) throws Exception;

    //新增单词
    int addWord(WordBean wordBean) throws Exception;

    //获取单词总数
    int getWordCounts() throws Exception;
}
