package servlet;

import bean.admin;
import bean.user;
//import dao.UseDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/servlet.Login")
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*创建对应的数据类型*/
        user user = new user();
        admin admin = new admin();
        /*获取前端数据*/
        String id = request.getParameter("id");
        String pw = request.getParameter("pw");
        String index = request.getParameter("who");

        if(index.equals("user")){
            user.setUser_id(id);
            user.setUser_pw(pw);
        }
        else{
            admin.setAdmin_id(id);
            admin.setAdmin_pw(pw);
        }

        /*test*/
        System.out.println("Login::id:"+user.getUser_id());
        System.out.println("Login::pw:"+user.getUser_pw());
        System.out.println("------admin------------");
        System.out.println("Login::id:"+admin.getAdmin_id());
        System.out.println("Login::pw:"+admin.getAdmin_pw());
        System.out.println("------admin------------");

//        //判断用户登录
//        boolean index = false;
//        try {
//            index = new UseDao().login(user.getUser_id(),user.getUser_pw());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        if(index==true){
//            response.sendRedirect("Success.html");
//        }
//        else{
//            response.sendRedirect("False.html");
//
//        }
    }
}
