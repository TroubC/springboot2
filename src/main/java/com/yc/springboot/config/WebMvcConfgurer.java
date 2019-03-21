package com.yc.springboot.config;

import com.yc.springboot.Interceptors.OneInterceptors;
import com.yc.springboot.Interceptors.TwoInterceptors;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfgurer extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        /**
         * 拦截器按照顺序执行
         */
        registry.addInterceptor(new TwoInterceptors()).addPathPatterns("/two/**").addPathPatterns("/one/**");
        registry.addInterceptor(new OneInterceptors()).addPathPatterns("/one/**");
        super.addInterceptors(registry);
    }
}
