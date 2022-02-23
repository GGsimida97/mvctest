package com.wangjf.service;

import com.wangjf.dao.impl.TransferDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


public class TransferService {
    @Autowired
    private TransferDaoImpl transferDao;

    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED, readOnly = false)
    public void transfer(double money, String outMan, String inMan) {
        transferDao.del(money, outMan);
        int i = 1 / 0;
        transferDao.add(money, inMan);
    }
}
