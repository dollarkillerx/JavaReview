package com.dollar.el;

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
 * Time: 下午9:04
 * Description: No Description
 */
@WebServlet("/student")
public class StudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student stu = new Student();
        stu.setName("王大");
        stu.setMobile(null);
        String grade = "A";
        req.setAttribute("student",stu);
        req.setAttribute("grade",grade);
//        req.getRequestDispatcher("/info.jsp").forward(req,resp);
        req.getRequestDispatcher("/el_info.jsp").forward(req,resp);
    }
}
