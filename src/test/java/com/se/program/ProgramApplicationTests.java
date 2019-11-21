package com.se.program;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.se.program.entities.department;
import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.SQLException;
import com.se.program.mapper.departmentMapper;
@SpringBootTest
class ProgramApplicationTests {
    @Autowired
    DataSource dataSource;
    @Autowired
    departmentMapper DEP;
    @Test
    void contextLoads()  throws SQLException {
        department d = DEP.selectByPrimaryKey(11);
        System.out.println("111");

    }

}