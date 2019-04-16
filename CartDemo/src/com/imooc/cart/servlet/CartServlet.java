package com.imooc.cart.servlet;

import com.imooc.cart.data.LocalCache;
import com.imooc.cart.data.Product;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-16
 * Time: 下午9:04
 * Description: No Description
 */
public class CartServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(Objects.equals("/cart/cart.do",req.getServletPath())) {
            String productId = req.getParameter("productId");
            if(null!=productId) {
                Product product = LocalCache.getProduct(Long.valueOf(productId));
                LocalCache.addCart(product);
            }
            resp.sendRedirect("/cart/list.do");
        }else if(Objects.equals("/cart/list.do",req.getServletPath())){
            req.setAttribute("carts",LocalCache.getCarts());
            req.getRequestDispatcher("/WEB-INF/views/biz/cart.jsp").forward(req,resp);
        }
    }
}
