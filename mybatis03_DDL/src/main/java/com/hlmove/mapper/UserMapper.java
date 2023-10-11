package com.hlmove.mapper;

import com.hlmove.entity.User;
import org.apache.ibatis.annotations.*;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Hlmove
 * @date 创建日期 2023/10/7 16:09
 * @Description com.hlmove.mapper
 * @Note
 */
@Mapper
public interface UserMapper {
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
    @Delete("delete from es_user where id = #{id}")
    //使用#{key}方式获取方法中的参数值
    void deleteById(Integer id);

    /**
     * @param user 添加用户
     * @author Hlmove
     */
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into`es_user`(username,password,phone,gender,birthday,register_time)" +
            " values (#{username},#{password},#{phone},#{gender},#{birthday},#{registerTime})")
    void insert(User user);

    /**
     * @param id 通过id查询信息
     * @return 返回一个用户的对象
     * @author Hlmove
     */
    @Select("select id,username,password,phone,avatar,gender,status,birthday,register_time from es_user where id=#{id}")
    User selectById(Integer id);

    /**
     * @param user 根据id修改用户信息
     * @author Hlmove
     */
    @Update("update es_user set username= #{username},phone =#{phone},avatar = #{avatar}," +
            "gender = #{gender},status = #{status},birthday = #{birthday} where id = #{id}")
    void update(User user);

    /**
     * @param name   模糊姓名查询
     * @param status 用户状态
     * @param begin  入职开始时间
     * @param end    入职结束时间
     * @return 返回一个用户集合
     * @author Hlmove
     */
    @Select("select * from es_user " +
            "where username like concat('%',#{name},'%') " +
            "and status = #{status} " +
            "and register_time >= #{begin} " +
            "and register_time <= #{end}" +
            "order by register_time desc")
    //使用$拼接，不安全
//    @Select("select * from es_user " +
//            "where username like '%${name}%' " +
//            "and status = #{status} " +
//            "and register_time between #{begin} and #{end} " +
//            "order by register_time desc")
    List<User> list(String name, Byte status,
                    LocalDate begin, LocalDate end);

    @Select("select * from es_user")
    List<User> findAll();

    //借助sql注入实现功能
    @Select("select * from es_user where username=${username} and password= ${password}")
    public List<User> login(String username, String password);

    //借助预编译实现功能
    @Select("select * from es_user where username=#{username} and password=#{password}")
    public List<User> login2(String username, String password);


}

