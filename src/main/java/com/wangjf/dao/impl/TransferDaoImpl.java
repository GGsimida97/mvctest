package com.wangjf.dao.impl;

import com.wangjf.dao.TransferDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository(value = "transferDaoImpl")
public class TransferDaoImpl implements TransferDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public int del(double money,String outMan) {
        return jdbcTemplate.update("update account set money = money - ? where name = ?",money,outMan);

    }

    @Override
    public int add(double money,String inMan) {
        return jdbcTemplate.update("update account set money = money + ? where name = ?",money,inMan);
    }
}
