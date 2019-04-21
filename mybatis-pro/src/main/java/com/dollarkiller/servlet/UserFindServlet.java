package com.dollarkiller.servlet;

import com.dollarkiller.dao.UsersDAO;
import com.dollarkiller.entity.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-21
 * Time: 下午9:33
 * Description: No Description
 */
@WebServlet("/index")
public class UserFindServlet extends HttpServlet {
    private UsersDAO usersDAO = new UsersDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Users> list = usersDAO.findAll();
        req.setAttribute("usersList",list);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
