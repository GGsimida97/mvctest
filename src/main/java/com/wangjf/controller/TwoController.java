package com.wangjf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/two")
public class TwoController {
    @RequestMapping("/some")
    public ModelAndView doSome(String name){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name",name);
        mv.setViewName("/test.jsp");
        return mv;
    }
}
