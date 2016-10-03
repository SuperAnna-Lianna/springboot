package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*@ComponentScan 组建扫描  只在自己所在的包下面进行扫描
@EnableAutoConfiguration 开启自动配置
@Configuration 配置控制*/
@SpringBootApplication
public class TestApplication {

    //程序的入口
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}
