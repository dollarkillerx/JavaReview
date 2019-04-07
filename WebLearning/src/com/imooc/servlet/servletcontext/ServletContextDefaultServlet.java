package com.imooc.servlet.servletcontext;

import javax.servlet.ServletContext;
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
 * Time: 下午4:42
 * Description: No Description
 */
@WebServlet("/servletcontext/default")
public class ServletContextDefaultServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = req.getServletContext();
        String copyright = (String)context.getAttribute("copyright");
        String auth = (String)context.getAttribute("auth");
        resp.setContentType("text/html;charset=utf-8");

        resp.getWriter().println("copy: "+copyright +" auth: "+ auth);
    }
}
