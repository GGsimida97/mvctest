package com.wangjf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/one")
public class OneController {
    @RequestMapping(value = "/some")
    public String doSome() {
        System.out.println("我被调用了");
        return "/hello.jsp";
    }

    @RequestMapping("/doFile")
    @ResponseBody
    public void two(String username, MultipartFile uploadFile) {

        System.out.println(username);
        //获得上传文件的名称
        String originalFilename = uploadFile.getOriginalFilename();
        try {
            uploadFile.transferTo(new File("D:\\upload\\" + originalFilename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
