package com.imooc.cart.servlet;

import com.imooc.cart.data.LocalCache;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-15
 * Time: 下午10:29
 * Description: No Description
 */
public class ProductServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("products", LocalCache.getProduct());
        req.getRequestDispatcher("/WEB-INF/views/biz/list.jsp").forward(req,resp);
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
