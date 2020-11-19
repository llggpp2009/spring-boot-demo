package com.jdds.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication  //主要目的是开启自动配置
public class DemoApplication {


    @RequestMapping("/")
    String index() {
        return "Hello DockerLearn";

    }

    //作为项目启动入口
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


}
