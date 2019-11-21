package com.se.program;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(value = "com.se.program.mapper")
@SpringBootApplication
public class ProgramApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProgramApplication.class, args);
    }

}
