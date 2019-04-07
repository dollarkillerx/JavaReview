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
 * Time: 下午2:52
 * Description: No Description
 */
@WebServlet("/ppps")
public class ContentTypeServelet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String output = "<h1><a href='http://www.baidu.com'></a></h1>";
        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().println(output);
    }
}
