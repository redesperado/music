package com.my.music.serviceImpl;

import com.my.music.bean.MusicBean;
import com.my.music.dao.MusicDao;
import com.my.music.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MusicServiceImpl implements MusicService {

    @Autowired
    MusicDao musicDao;

    @Override
    public List<Map<String, Object>> getMusic() throws Exception {
        return musicDao.getMusic();
    }
}
