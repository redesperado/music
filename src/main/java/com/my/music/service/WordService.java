package com.my.music.service;



import com.my.music.bean.WordBean;

import java.util.List;
import java.util.Map;

public interface WordService {

    List<Map<String,Object>> getWords() throws Exception;

    WordBean getCnByEn(String word) throws Exception;

    int addWord(WordBean wordBean) throws Exception;

}
