package servlet;

import bean.Admin;
import bean.User;
import dao.impl.AdminImpl;
import dao.impl.UserImpl;
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
        User user = new User();
        Admin admin = new Admin();
        /*获取前端数据*/
        String id = request.getParameter("id");
        String pw = request.getParameter("pw");
        String index = request.getParameter("who");

        /*判断身份*/
        boolean judge = false;
        /*普通用户*/
        if(index.equals("user")){
            user.setUser_id(id);
            user.setUser_pw(pw);
            try {
                /*进行逻辑判断*/
                judge = new UserImpl().login(user.getUser_id(),user.getUser_pw());
            } catch (Exception e) {
                e.printStackTrace();
            }
            /*判断帐号密码*/
            if(judge==true){
                response.sendRedirect("view/user/user.jsp");
            }
            else{
                response.sendRedirect("False.html");
            }
        }
        /*管理员*/
        else{
            admin.setAdmin_id(id);
            admin.setAdmin_pw(pw);
            try {
                judge = new AdminImpl().login(admin.getAdmin_id(),admin.getAdmin_pw());
            } catch (Exception e) {
                e.printStackTrace();
            }
            /*判断帐号密码*/
            if(judge==true){
                response.sendRedirect("view/admin/admin.jsp");
            }
            else{
                response.sendRedirect("False.html");

            }
        }

        /*test*/
//        System.out.println("Login::id:"+user.getUser_id());
//        System.out.println("Login::pw:"+user.getUser_pw());
//        System.out.println("------admin------------");
//        System.out.println("Login::id:"+admin.getAdmin_id());
//        System.out.println("Login::pw:"+admin.getAdmin_pw());
//        System.out.println("------admin------------");

        /*判断并跳转到相应界面*/

        /**/
    }
}
