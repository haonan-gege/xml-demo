package com.mybatis.xmldemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mybatis.xmldemo.mapper")
public class XmlDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(XmlDemoApplication.class, args);
    }

}
