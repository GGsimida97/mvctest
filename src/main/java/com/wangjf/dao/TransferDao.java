package com.wangjf.dao;

public interface TransferDao {
    //转出
    int del(double money,String outMan);

    //转入
    int add(double money,String inMan);
}
