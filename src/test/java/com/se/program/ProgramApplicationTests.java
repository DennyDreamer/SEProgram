package com.se.program;

import com.se.program.mapper.userMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProgramApplicationTests {

    @Autowired
    userMapper UserMapper;
    @Test
    void contextLoads() {
        System.out.println(UserMapper.selectPasswordByPrimaryKey(1));
      //  System.out.println(UserMapper.selectIdByUserNumber("456888"));
    }

}