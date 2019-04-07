package com.imooc.servlet.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-7
 * Time: 下午8:23
 * Description: No Description
 */
@WebServlet("/testmp")
public class TestMP extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String,String> maps = new HashMap<>();
        maps.put("apple","苹果");
        maps.put("banana","香蕉");
        maps.put("pear","梨");
        resp.setContentType("text/html;charset=utf-8");
        String key = req.getParameter("key");

        Boolean flag = maps.containsKey(key);
        if(flag){
            resp.getWriter().println(maps.get(key));
        }else{
            resp.getWriter().println("没有找到");
        }
    }
}
