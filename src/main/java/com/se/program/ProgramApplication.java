package com.se.program;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@MapperScan(value = "com.se.program.mapper")
@SpringBootApplication
@ServletComponentScan
public class ProgramApplication {

    public static void main(String[] args) {

        SpringApplication.run(ProgramApplication.class, args);
    }

}
