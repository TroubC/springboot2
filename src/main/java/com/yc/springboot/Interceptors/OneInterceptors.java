package com.yc.springboot.Interceptors;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class OneInterceptors implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("被one拦截，放行了...");
        return true;
        //return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }

    public void returnErrorResponse(HttpServletResponse response) throws IOException,UnsupportedEncodingException {
        OutputStream out = null;
        try{
            response.setCharacterEncoding("utf-8");
            response.setContentType("text/json");
            out.write("我要看世界杯".getBytes("utf-8"));
            out.flush();
        }finally {
            if(out!=null){
                out.close();
            }
        }
    }

}
