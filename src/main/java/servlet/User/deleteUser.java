package servlet.User;

import dao.impl.StuImpl;
import dao.impl.UserImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "deleteUser", value = "/deleteUser")
public class deleteUser extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /*获取来自jsp的数据*/
        String user_id = request.getParameter("user_id");

        /*调用删除操作*/
        try {
            new UserImpl().deleteUser(user_id);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*跳回原来的页面*/
        response.sendRedirect("view/admin/user/deleteUser.jsp");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
