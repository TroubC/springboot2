package com.yc.springboot.Interceptors;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Controller
@RequestMapping("one")
public class OneController {


    @RequestMapping("/hi")
    public String toHi(){
        String msg = "你好啊";
        return msg;
    }
}