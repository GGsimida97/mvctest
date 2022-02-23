package com.wangjf.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor1 implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String param = request.getParameter("name");
        if (!"zhangsan".equals(param)) {
            //不输入这行代码会导致error.jsp页面无法获取name
            request.setAttribute("name", param);

            request.getRequestDispatcher("/error.jsp").forward(request, response);
            return false;
        } else {
            return true;
        }

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        request.setAttribute("name", "胡八一");
        request.getRequestDispatcher("/hello.jsp").forward(request, response);
        //System.out.println("postHandle方法执行");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion方法执行");
    }
}
