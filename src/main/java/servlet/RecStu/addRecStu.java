package servlet.RecStu;

import dao.impl.RecStuImpl;
import dao.impl.StuImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "addRecStu", value = "/addRecStu")
public class addRecStu extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*获取来自jsp的数据*/
        String rec_id = request.getParameter("rec_id");
        String stu_id = request.getParameter("stu_id");
        String stu_name = request.getParameter("stu_name");
        String rec_stu_sta = request.getParameter("rec_stu_sta");
        String rec_stu_time = request.getParameter("rec_stu_time");
        /*servlet-->dao*/
        try {
            new RecStuImpl().addRecStu(rec_id,stu_id,stu_name,rec_stu_sta,rec_stu_time);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*跳回原来的页面*/
        response.sendRedirect("view/user/record/stuRecord.jsp");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
