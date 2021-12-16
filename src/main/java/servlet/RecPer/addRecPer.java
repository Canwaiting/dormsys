package servlet.RecPer;

import dao.impl.RecPerImpl;
import dao.impl.RecStuImpl;
import dao.impl.StuImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "addRecPer", value = "/addRecPer")
public class addRecPer extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*获取来自jsp的数据*/
        String rec_id = request.getParameter("rec_id");
        String per_name = request.getParameter("per_name");
        String per_tel = request.getParameter("per_tel");
        String rec_per_sta = request.getParameter("rec_per_sta");
        String rec_per_time = request.getParameter("rec_per_time");

        /*servlet-->dao*/
        try {
            new RecPerImpl().addRecPer(rec_id,per_name,per_tel,rec_per_sta,rec_per_time);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*跳回原来的页面*/
        response.sendRedirect("view/user/record/perRecord.jsp");


    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
