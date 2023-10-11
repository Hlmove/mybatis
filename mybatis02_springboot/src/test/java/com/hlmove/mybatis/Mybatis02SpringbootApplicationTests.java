package com.hlmove.mybatis;

import com.hlmove.mybatis.domain.User;
import com.hlmove.mybatis.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest  //绑定主函数启动器，实际先通过指定启动器，则自动调用对应的方法。
class Mybatis02SpringbootApplicationTests {

    //自动装配，从容器中取出合适的对象
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testList() {
        List<User> users = userMapper.list();
      users.forEach(System.out::println);
    }
}
