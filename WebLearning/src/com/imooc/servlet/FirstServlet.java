package com.imooc.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-6
 * Time: 下午7:56
 * Description: No Description
 */
public class FirstServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String html = "<h1 style='color:red'>hi, " + name + " !</h1><hr/>";
        System.out.println("将这个放回给浏览器的相应数据为:" + html);
        PrintWriter out = resp.getWriter(); // 服务器向浏览器返回的输出流
        out.println(html);// 将html发送会浏览器
    }

}
