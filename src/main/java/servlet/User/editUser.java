package servlet.User;

import dao.impl.StuImpl;
import dao.impl.UserImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "editUser", value = "/editUser")
public class editUser extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*获取来自jsp的数据*/
        String user_id = request.getParameter("user_id");
        String user_name = request.getParameter("user_name");
        /*servlet-->dao*/
        try {
            new UserImpl().editUser(user_id,user_name);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*跳回原来的页面*/
        response.sendRedirect("view/admin/user/editUser.jsp");


    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
