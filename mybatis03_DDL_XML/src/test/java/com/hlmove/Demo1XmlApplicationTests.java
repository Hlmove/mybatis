package com.hlmove;

import com.hlmove.entity.User;
import com.hlmove.mapper.UserMapperXml;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class Demo1XmlApplicationTests {

    @Autowired //从Spring的IOC容器中，获取类型是UserMapper的对象并注入
    private UserMapperXml userMapperXml;

    @Test
    public void testDel() {
        //调用删除方法
        userMapperXml.deleteById(1);
    }

    @Test
    public void testInsert() {
        //创建用户对象
        User user = User.builder()
                .username("mysql1131")
                .password("3213321")
                .phone("10086116921")
                .gender("1")
                .birthday(LocalDate.of(2001, 12, 25))
                .registerTime(LocalDateTime.now())
                .build();
        //调用添加方法
        userMapperXml.insert(user);

    }

    @Test
    public void testGetById() {
        User User = userMapperXml.getById(3);
        System.out.println(User);
    }

    @Test
    public void testUpdate() {
        //要修改的用户对象
        User user = new User();
        user.setId(11);
        user.setUsername("zs");
        user.setPhone("13456789273");
        user.setAvatar("https://www.qinyc.xyz/1.jpg");
        user.setGender("0");
        user.setStatus((byte) 1);
        user.setBirthday(LocalDate.parse("2000-03-12", DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        //调用方法，修改员工数据
        userMapperXml.update(user);
    }


    @Test
    public void testFindByCondition() {
        List<User> list =
                userMapperXml.findByCondition("tom",
               null,
                LocalDate.of(2022,1,1),
                LocalDate.of(2023,10,11));
        list.forEach(System.out::println);
    }

    @Test
    public void findAll(){
        List<User> list = userMapperXml.findAll();
        list.forEach(System.out::println);
    }

    @Test
    public void testUpdate2() {
        //要修改的用户对象
        User user = User.builder()
                .id(2)
                .status((byte) 0)
                .build();
        //调用方法，修改员工数据
        userMapperXml.update2(user);
    }
    @Test
    public void testDeleteByIds() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        userMapperXml.deleteByIds(list);
    }

    @Test
    public void test_getById2() {
        User user = userMapperXml.getById2(4);
        System.out.println("User: " + user);
    }

    @Test
    public void insertId(){
        //创建用户对象
        User user = User.builder()
                .username("mysql22")
                .password("3213321")
                .phone("10086116921")
                .gender("1")
                .birthday(LocalDate.of(2001, 12, 25))
                .registerTime(LocalDateTime.now())
                .build();
        userMapperXml.insertId(user);
        System.out.println("新增用户id:" + user.getId());
    }

    @Test
    public void insertId2(){
        //创建用户对象
        User user = User.builder()
                .username("mysql13")
                .password("3213321")
                .phone("10086116921")
                .gender("1")
                .birthday(LocalDate.of(2001, 12, 25))
                .registerTime(LocalDateTime.now())
                .build();
        userMapperXml.insertId2(user);
        System.out.println("新增用户id:" + user.getId());
    }


    @Test
    public void ListAll(){
        Map<String ,Object> map  =new HashMap<>();
        map.put("name", "李");
        map.put("status",0);
        map.put("begin", LocalDate.of(2022,1,1));
        map.put("end", LocalDate.of(2024,1,1));
        List<User> list = userMapperXml.list(map);
        System.out.println("list = " + list);
    }

    @Test
    public void ListAllByMap(){
        Map<String ,Object> map  =new HashMap<>();
        map.put("name", "李");
        map.put("status",0);
        map.put("begin", LocalDate.of(2022,1,1));
        map.put("end", LocalDate.of(2024,1,1));
        List<Map<String, Object>> list = userMapperXml.listToMap(map);
        list.forEach(stringObjectMap ->
                stringObjectMap.forEach((k,v)-> System.out.println(k+" : "+v)));

    }



}
