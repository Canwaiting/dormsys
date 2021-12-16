package servlet.Dorm;

import dao.impl.BldgImpl;
import dao.impl.DormImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "deleteDorm", value = "/deleteDorm")
public class deleteDorm extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /*获取来自jsp的数据*/
        String dorm_id = request.getParameter("dorm_id");

        /*调用删除操作*/
        try {
            new DormImpl().deleteDorm(dorm_id);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*跳回原来的页面*/
        response.sendRedirect("view/admin/dorm/deleteDorm.jsp");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
