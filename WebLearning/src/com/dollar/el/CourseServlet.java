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
 * Time: 下午10:33
 * Description: No Description
 */
@WebServlet("/demo")
public class CourseServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String category = req.getParameter("category");
        Course course = new Course(id,name,category);
        req.setAttribute("course",course);
        req.getRequestDispatcher("/course.jsp").forward(req,resp);
    }
}
