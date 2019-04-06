package com.imooc.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-6
 * Time: 下午9:18
 * Description: No Description
 */
public class SampleServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter out= resp.getWriter();//向浏览器输出的标准数据流
        out.println("<a href='http://www.baidu.com'>Baidu</a>");
    }
}
