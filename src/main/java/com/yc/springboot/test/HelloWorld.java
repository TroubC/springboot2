package com.yc.springboot.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloWorld {

    @RequestMapping("/hello")
    public String sayHi(){
        return "你好！世界";
    }

    @RequestMapping("/map")
    public Map tomap(){
        Map<String,String> map = new HashMap<String,String>();
        map.put("hi","你好！世界");
        return map;
    }
}
