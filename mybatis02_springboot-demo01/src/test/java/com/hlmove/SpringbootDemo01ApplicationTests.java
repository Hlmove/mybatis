package com.hlmove;

import com.hlmove.entity.User;
import com.hlmove.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
@SpringBootTest
class SpringbootDemo01ApplicationTests {
    //自动装配，从容器中取出合适的对象
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testList() {
        List<User> users = userMapper.list();
        for (User u : users) {
            System.out.println(u);
        }
    }

}
