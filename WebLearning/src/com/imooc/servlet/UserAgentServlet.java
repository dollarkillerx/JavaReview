package com.imooc.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-7
 * Time: 下午2:13
 * Description: No Description
 */
@WebServlet("/us")
public class UserAgentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userAgent = req.getHeader("User-Agent");
        resp.setContentType("text/html;charset=utf-8");
        if (userAgent.indexOf("Linux")>0 && userAgent.indexOf("Android")<0){
            resp.getWriter().println("不支持Linux系统访问");
        }else if(userAgent.indexOf("curl")>0){
            resp.getWriter().println("非法访问");
        }else if(userAgent.indexOf("iPhone")>0){
            resp.getWriter().println("正常内容");
        }else if(userAgent.indexOf("Android")>0){
            resp.getWriter().println("正常内容");
        }else{
            resp.getWriter().println(userAgent);
        }
    }
}
