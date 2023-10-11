package com.hlmove;

import com.hlmove.entity.User;
import com.hlmove.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired //从Spring的IOC容器中，获取类型是UserMapper的对象并注入
    private UserMapper userMapper;

    @Test
    public void testDel() {
        //调用删除方法
        userMapper.deleteById(1);
    }

    @Test
    public void testInsert() {
        User user = User.builder()
                .username("lucy1")
                .password("3213321")
                .phone("10086116921")
                .gender("1")
                .birthday(LocalDate.of(2001, 12, 25))
                .registerTime(LocalDateTime.now())
                .build();
        //调用添加方法
        userMapper.insert(user);
        System.out.println("新增用户的id:" + user.getId());
    }

    @Test
    public void testSelectById() {
        User User = userMapper.selectById(3);
        System.out.println(User);
    }

    @Test
    public void testUpdate() {
        //要修改的用户对象
        User user = new User();
        user.setId(12);
        user.setUsername("hlmove");
        user.setPhone("13456789273");
        user.setAvatar("https://www.qinyc.xyz/1.jpg");
        user.setGender("0");
        user.setStatus((byte) 1);
        user.setBirthday(LocalDate.parse("2003-03-26", DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        //调用方法，修改员工数据
        userMapper.update(user);
    }


    @Test
    public void testList() {
        List<User> list = userMapper.list("tom",
                (byte) 0,
                LocalDate.parse("2023-07-01"),
                LocalDate.parse("2023-11-30"));
        list.forEach(System.out::println);
    }

    @Test
    public void findAll(){
        List<User> list = userMapper.findAll();
        list.forEach(System.out::println);
    }

    @Test
    public void login(){
        // ${}
        List<User> list = userMapper.login2("'admin'", "'' or '1'='1'");
        list.forEach(System.out::println);
    }

}
