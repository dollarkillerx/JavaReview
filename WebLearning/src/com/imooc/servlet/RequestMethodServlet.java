package com.imooc.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-7
 * Time: 上午9:54
 * Description: No Description
 */
public class RequestMethodServlet extends HttpServlet {
    // 处理get请求
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        resp.getWriter().println("<h1 style='red'>" + name + "</h1>" );
    }
    @Override
    public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        resp.getWriter().println("<h1 style='red'>" + name + "</h1>" );
    }
}
