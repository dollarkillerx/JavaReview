package com.jstl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-8
 * Time: 下午10:00
 * Description: No Description
 */
@WebServlet("/jstl")
public class JstlServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("score",78);
        req.setAttribute("grade","B");
        List<Company> list = new ArrayList<>();
        list.add(new Company("腾讯","www.tencent.com"));
        list.add(new Company("百度","www.baidu.com"));
        list.add(new Company("阿里","www.alibaba.com"));
        req.setAttribute("companies",list);
        req.getRequestDispatcher("/core.jsp").forward(req,resp);
    }
}
