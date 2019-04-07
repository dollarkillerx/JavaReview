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
 * Time: 下午3:03
 * Description: No Description
 */
@WebServlet("/direct/index")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        String user = (String)req.getAttribute("username");
        if(user.equals("admin")){
            resp.getWriter().println("admin用户欢迎你");
        }
        resp.getWriter().println("This is index page");
    }
}
