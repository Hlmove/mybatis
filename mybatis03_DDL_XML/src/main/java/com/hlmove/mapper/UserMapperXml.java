package com.hlmove.mapper;

import com.hlmove.entity.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

/**
 * @author Hlmove
 * @date 创建日期 2023/10/7 16:09
 * @Description com.hlmove.mapper
 * @Note
 */
@Mapper

public interface UserMapperXml {
    //@Delete("delete from es_user where id = 1")
    //public void delete();
    //以上delete操作的SQL语句中的id值写成固定的1，就表示只能删除id=1的用户数据
    //SQL语句中的id值不能写成固定数值，需要变为动态的数值
    //解决方案：在delete方法中添加一个参数(用户id)，将方法中的参数，传给SQL语句

    /**
     * 根据id删除数据
     *
     * @param id 用户id
     */
    void deleteById(Integer id);

    /**
     * @param user 添加用户
     * @author Hlmove
     */

    void insert(User user);

    /**
     * @param id 通过id查询信息
     * @return 返回一个用户的对象
     * @author Hlmove
     */
    User getById(Integer id);

    /**
     * @param user 根据id修改用户信息
     * @author Hlmove
     */
    void update(User user);

    /**
     * @param name   模糊姓名查询
     * @param status 入职状态
     * @param begin  入职开始时间
     * @param end    入职结束时间
     * @return 返回一个用户集合
     * @author Hlmove
     */

    List<User> findByCondition(String name, Byte status, LocalDate begin, LocalDate end);

    /**
     * @return 返回一个查询所有人信息的集合
     * @author Hlmove
     */
    List<User> findAll();


    /**
     * 动态修改用户
     *
     * @param user 传入一个要更新的对象
     * @author Hlmove
     */
    void update2(User user);

    //批量删除
    void deleteByIds(List<Integer> ids);


    //sql 抽离公共sql，include导入
    User getById2(Integer id);

    //插入并返回主键id值
    void insertId(User user);

    void insertId2(User user);

    //测试传入一个map来看
    List<User> list(Map<String, Object> map);

    @MapKey("map")
    List<Map<String, Object>> listToMap(Map<String, Object> map);
}

