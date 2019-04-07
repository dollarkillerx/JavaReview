package com.imooc.servlet.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-7
 * Time: 下午3:51
 * Description: No Description
 */
@WebServlet("/cindex")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        Cookie[] cs = req.getCookies();
        String user = null;
        if (cs!=null){
            for(Cookie c:cs){
                System.out.println(c.getName() + " : " + c.getValue());
                if(c.getName().equals("user") && c.getValue().equals("admin")){
                    user = c.getValue();
                    break;
                }
            }
        }else{
            resp.sendRedirect("/login");
        }
        if (user != null){
            resp.getWriter().println("用户"+user+"你登录了");
        }else{
            resp.sendRedirect("/login");
        }
    }
}
