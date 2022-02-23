package com.wangjf.controller;

import com.wangjf.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class TransferController {


    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        TransferService transferService = (TransferService) ac.getBean("transferService");
        transferService.transfer(5,"Joker","Tom");

    }

}
