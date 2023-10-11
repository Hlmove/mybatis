package com.hlmove.main;

import com.hlmove.entity.Env;
import com.hlmove.mapper.EnvMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author Hlmove
 * @date 创建日期 2023/10/7 14:16
 * @Description com.hlmove.main
 * @Note
 */
public class MybatisByXml {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        //构建会话工厂 ，传入mybatis的配置文件
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 通过会话工厂创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //  通过SqlSessionFactory获取SqlSession
        try (SqlSession session = sqlSessionFactory.openSession()) {
            EnvMapper mapper = session.getMapper(EnvMapper.class);
            List<Env> envList  = mapper.findAll();
            System.out.println("envList = " + envList.size());
        }
    }
}
