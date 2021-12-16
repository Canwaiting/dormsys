package servlet.Emp;

import dao.impl.DormImpl;
import dao.impl.EmpImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "deleteEmp", value = "/deleteEmp")
public class deleteEmp extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*获取来自jsp的数据*/
        String emp_id = request.getParameter("emp_id");

        /*调用删除操作*/
        try {
            new EmpImpl().deleteEmp(emp_id);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*跳回原来的页面*/
        response.sendRedirect("view/admin/emp/deleteEmp.jsp");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
