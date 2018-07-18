package com.qingguatang.java5minute.course1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @anthor GanBorui
 * @date 2018/7/17
  */

@Controller
public class HelloWorld {


    @RequestMapping(value = "/")
    @ResponseBody
    public String hello(){
        String message = "I love Lhy forever";
        return message;
        }
}
