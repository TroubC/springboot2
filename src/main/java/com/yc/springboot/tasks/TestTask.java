package com.yc.springboot.tasks;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@RestController
public class TestTask {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
    //每隔一秒打印
    //@Scheduled(fixedRate = 1000)
    @Scheduled(cron = "0 00 18 * * ? ")
    public void getTime(){
       System.out.println("北京时间："+sdf.format(new Date()));
        toShow();
    }

    public void toShow(){
        System.out.println("成功进去...");
    }
}
