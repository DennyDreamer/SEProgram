package com.se.program.services;

import com.se.program.entities.user;
import com.se.program.entities.userExample;
import com.se.program.mapper.userMapper;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class sqlService {
    @Autowired
    userMapper  UserMapper;
    int UserSelectIdByUserNumber(String userNumber) {
        userExample example = new userExample();
        userExample.Criteria criteria = example.createCriteria();

        criteria.andUserNumberEqualTo(userNumber);
        List<user> list = UserMapper.selectByExample(example);
        return list.get(0).getUserId();
    }
}
