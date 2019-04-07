package com.imooc.servlet.pattern;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-7
 * Time: 下午7:38
 * Description: No Description
 */
@WebServlet("/pwd/*")
public class PatternServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = req.getServletContext();
        resp.setContentType("text/html;charset=utf-8");
        String url = req.getRequestURI().toString();
        System.out.println(url);
        String id = url.substring(url.lastIndexOf("/")+1);
        PrintWriter out = resp.getWriter();
        if (id.equals("1")){
//            out.println("1");
            String name = context.getInitParameter("username");
            out.println(name);
        }else{
            out.println("O(∩_∩)O哈哈~");
        }
    }
}
