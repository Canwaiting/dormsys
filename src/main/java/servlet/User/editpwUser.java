package servlet.User;

import dao.impl.UserImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "editpwUser", value = "/editpwUser")
public class editpwUser extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*获取来自jsp的数据*/
        String user_id = request.getParameter("user_id");
        String user_pw = request.getParameter("user_pw");
        /*servlet-->dao*/
        try {
            new UserImpl().editpwUser(user_id,user_pw);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*跳回原来的页面*/
        response.sendRedirect("view/admin/user/editpwUser.jsp");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
