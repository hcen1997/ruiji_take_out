package com.ddiqq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.annotation.Annotation;

@Slf4j
@SpringBootApplication
public class RuijiApplication {


    public static void main(String[] args) {
        SpringApplication.run(RuijiApplication.class,args);
        log.info("瑞吉外卖项目后端启动成功");
    }
}
