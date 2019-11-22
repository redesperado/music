package com.my.music;

import com.my.music.bean.MusicBean;
import com.my.music.service.MusicService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
class MusicApplicationTests {

    @Autowired
    MusicService musicService;

    @Test
    void contextLoads() throws Exception {
        List<Map<String, Object>>  musicBean = musicService.getMusic();
        for (Map<String, Object> map : musicBean) {
            System.out.println(map);
        }

    }

}
