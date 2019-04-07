package com.imooc.servlet.direct;

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
 * Time: 下午3:01
 * Description: No Description
 */
@WebServlet("/direct/check")
public class CheckLoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("用户登录成功");
        req.setAttribute("username","admin");
        // 实现了请求转发
        req.getRequestDispatcher("/direct/index").forward(req,resp);
//        resp.sendRedirect("/direct/index");
    }
}
