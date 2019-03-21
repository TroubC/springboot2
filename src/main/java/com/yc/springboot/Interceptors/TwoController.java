package com.yc.springboot.Interceptors;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("two")
public class TwoController{

    @RequestMapping("/say")
    public String sayTwo(){
        return "你好，拦截器二";
    }
}
