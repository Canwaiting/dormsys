package servlet.RecPer;

import dao.impl.StuImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "addRecPer", value = "/addRecPer")
public class addRecPer extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*获取来自jsp的数据*/
        String stu_id = request.getParameter("stu_id");
        String stu_name = request.getParameter("stu_name");
        String stu_class = request.getParameter("stu_class");
        String dorm_id = request.getParameter("dorm_id");
        /*servlet-->dao*/
        try {
//            new StuImpl().addStu(stu_id,stu_name,stu_class,dorm_id);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*跳回原来的页面*/
        response.sendRedirect("view/user/student/stuRecord.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
