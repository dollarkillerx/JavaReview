package com.imooc.servlet.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-7
 * Time: 下午3:46
 * Description: No Description
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         resp.setContentType("text/html;charset=utf-8");
         System.out.println("用户登录成功");
         Cookie cookie = new Cookie("user","admin");
         cookie.setMaxAge((60*60*27*7));
         resp.addCookie(cookie);
         resp.getWriter().println("设置cookie");
    }
}
