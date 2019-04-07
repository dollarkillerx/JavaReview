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
 * Time: 下午4:09
 * Description: No Description
 */
@WebServlet("/sessionl")
public class SesstionLoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("用户登录成功");
        HttpSession session = req.getSession();
        session.setAttribute("user","admin");

        req.getRequestDispatcher("/sessioni").forward(req,resp);
    }
}
