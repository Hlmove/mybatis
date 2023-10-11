package com.hlmove.main;

import com.hlmove.entity.Env;
import com.hlmove.mapper.EnvMapper;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import java.util.List;

/**
 * @author Hlmove
 * @date 创建日期 2023/10/7 11:25
 * @Description com.hlmove.main
 * @Note
 */
public class MybatisByJava {
    public static void main(String[] args) {
        //相当于JDBC六大步骤
        PooledDataSource dataSource = new PooledDataSource();
        dataSource.setDriver("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/environment");
        dataSource.setUsername("env");
        dataSource.setPassword("env");
        TransactionFactory transactionFactory = new JdbcTransactionFactory();
        Environment environment = new Environment("development", transactionFactory, dataSource);
        Configuration configuration = new Configuration(environment);
        configuration.addMapper(EnvMapper.class);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
        try (SqlSession session = sqlSessionFactory.openSession()) {
            EnvMapper mapper = session.getMapper(EnvMapper.class);
            List<Env> envList  = mapper.findAll();
            System.out.println("envList = " + envList.size());
        }
    }
}
