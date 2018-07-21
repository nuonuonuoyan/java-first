package com.qingguatang.java5minute.course3;


import com.qingguatang.java5minute.course3.model.SongInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SonginfoControl {
    @RequestMapping(value = "/songinfo")
    public String index(ModelMap modelMap){

        SongInfo songInfo = new SongInfo();
        songInfo.setName("Hello");
        songInfo.setSinger("Adele");
        songInfo.setAlbumName("Hello");
        songInfo.setCommentCount(10);
        songInfo.setLyrics("Hello, it's me <br/> 你好吗 是我 <br/> I was wondering if after all these years you'd like to meet <br/> 我犹豫着要不要给你来电 不确定多年后你是否还愿相见");
        songInfo.setAlbumImg("http://s2.cdn.bbwc.cn/issue_1/articles/200050907/2016/0127/20160127084505643.jpg");

        modelMap.addAttribute("song",songInfo);

        return"index";

    }
}
