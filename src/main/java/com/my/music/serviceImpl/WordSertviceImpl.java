package com.my.music.serviceImpl;

import com.my.music.bean.WordBean;
import com.my.music.dao.WordDao;
import com.my.music.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class WordSertviceImpl implements WordService {

    @Autowired
    WordDao wordDao;

    @Override
    public List<Map<String,Object>> getWords() throws Exception {
        return wordDao.selectWords();
    }

    @Override
    public WordBean getCnByEn(String word) throws Exception {
        return wordDao.selectCnByEn(word);
    }

    @Override
    public int addWord(WordBean wordBean) throws Exception {
        return wordDao.insertWord(wordBean);
    }
}
