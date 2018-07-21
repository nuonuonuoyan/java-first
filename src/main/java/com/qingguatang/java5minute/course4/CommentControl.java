package com.qingguatang.java5minute.course4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CommentControl {

    @RequestMapping(value = "/comments")
    public String comments(ModelMap modelMap){
        List<Comment>comments = getComment();
        modelMap.addAttribute("comments",comments);
        return "comments";
    }
    private List<Comment>getComment(){
        List<Comment>commens = new ArrayList<>();
        Comment comment = new Comment();
        comment.setIcon("http://p1.music.126.net/vGKrH1IzLT27xF8TPEGE7Q==/109951163411337685.jpg?param=50y50");
        comment.setNickName("AriLuv：");
        comment.setContent("hello！一转眼四年了！终于等到王者的归来~阿呆的全球屠榜又要开始啦！在此献上我的鸡腿！嘻嘻~");
        comment.setCommentTime("2015年10月23日");
        comment.setLikeNum(86191);
        commens.add(comment);

        comment = new Comment();
        comment.setIcon("http://p1.music.126.net/eLZfXg6oY_xqWmd3hzQg-w==/109951163043012263.jpg?param=50y50");
        comment.setNickName("Edawn：");
        comment.setContent("这hello应该翻译成别来无恙更恰当。");
        comment.setCommentTime("2015年12月13日");
        comment.setLikeNum(67327);
        commens.add(comment);

        return commens;
    }
}
