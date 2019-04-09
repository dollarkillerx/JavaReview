package com.dollarkiller.servlet;

import com.dollarkiller.user.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-9
 * Time: 下午9:44
 * Description: No Description
 */
@WebServlet(name="init", urlPatterns={"/init"},loadOnStartup=1)
public class InitServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
        if(this.getServletContext().getAttribute("userList")==null){
            List<User> userList = new ArrayList<>();
            this.getServletContext().setAttribute("userList",userList);
        }

    }
}
