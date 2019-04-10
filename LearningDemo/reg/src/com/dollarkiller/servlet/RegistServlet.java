package com.dollarkiller.servlet;

import com.dollarkiller.user.User;
import com.dollarkiller.utils.UploadUtils;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-9
 * Time: 下午9:53
 * Description: No Description
 */
@WebServlet("/RegistServlet")
public class RegistServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            // 实例化磁盘工厂
            DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
            // 实例化核心解析类
            ServletFileUpload servletFileUpload = new ServletFileUpload(diskFileItemFactory);
            // 解析request请求 List集合 集合中存放的是FileItem对象
            List<FileItem> list= servletFileUpload.parseRequest(req);
            Map<String,String> map = new HashMap<>();
            List<String> hobbyList = new ArrayList<>();
            String url = null;
            // 遍历fileItem判断表单项还是文件上传项
            for(FileItem fileItem:list) {
                // 判断是表单项还是文件上传项
                if(fileItem.isFormField()) {
                    // 普通表单项
                    String name = fileItem.getFieldName();// 获取name
                    String value = fileItem.getString("UTF-8");//获取value
                    if(name.equals("hobby")){
                        hobbyList.add(value);
                    }else{
                        map.put(name,value);
                    }
                }else{
                    // 文件上传项
                    // 文件上传功能
                    // 获得弄个文件上传名称
                    String fileName = fileItem.getName();
                    // 通过工具类获得唯一文件名
                    String uuidFileName = UploadUtils.getUUIDFileName(fileName);

                    // 获取文件上传的数据
                    InputStream is = fileItem.getInputStream();
                    // 获取文件上传路径
                    String path = this.getServletContext().getRealPath("/UPLOAD");
                    // 将输入流对接到输出流
                    url = path + "\\" + uuidFileName;
                    OutputStream os = new FileOutputStream(url);
                    int len = 0;
                    byte[] b = new byte[1024];
                    while ((len = is.read(b))!=-1) {
                        os.write(b,0,len);
                    }
                    is.close();
                    os.close();
                }
            }
            String hobby = hobbyList.toString().substring(1,hobbyList.toString().length()-1);
            map.put("hobby",hobby);
            User user = new User();
            user.setUsername(map.get("username"));
            user.setPassword(map.get("password"));
            user.setSex(map.get("sex"));
            user.setNickname(map.get("nickname"));
            user.setHobby(map.get("hobby"));
            user.setPath(url);
            System.out.println(user);
            List<User> userList = (List<User>)this.getServletContext().getAttribute("userList");
            userList.add(user);
            this.getServletContext().setAttribute("userList",userList);
            // 注册成功跳转
            System.out.println(req.getContextPath());

            req.getSession().setAttribute("username",user.getUsername());

            resp.sendRedirect(req.getContextPath()+"/login.jsp");
        }catch (FileUploadException e){

        }
    }
}
