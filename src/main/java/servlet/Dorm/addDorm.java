package servlet.Dorm;

import dao.impl.DormImpl;
import dao.impl.UserImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "addDorm", value = "/addDorm")
public class addDorm extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /*获取来自jsp的数据*/
        String dorm_id = request.getParameter("dorm_id");
        String dorm_size = request.getParameter("dorm_size");
        String bldg_id = request.getParameter("bldg_id");
        /*servlet-->dao*/
        try {
//            new UserImpl().addUser(user_id,user_name,user_pw);
            new DormImpl().addDorm(dorm_id,dorm_size,bldg_id);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*跳回原来的页面*/
        response.sendRedirect("view/admin/dorm/addDorm.jsp");


    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
