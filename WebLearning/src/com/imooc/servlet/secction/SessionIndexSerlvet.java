package com.imooc.servlet.secction;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-7
 * Time: 下午4:10
 * Description: No Description
 */
@WebServlet("/sessioni")
public class SessionIndexSerlvet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String name = (String)session.getAttribute("user");
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().println("user: "+name+"登录成功");
    }
}
