package com.wangjf.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateTest {
    @Test
    public void test01(){

        //创建数据源对象
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/wangjf");
        dataSource.setUsername("root");
        dataSource.setPassword("wang1997");

        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);

        int rows = jdbcTemplate.update("insert into account values(?,?,?)",2,"Tom",10);
        System.out.println(rows);

    }
}
