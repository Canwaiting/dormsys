package servlet.Emp;

import dao.impl.DormImpl;
import dao.impl.EmpImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "editEmp", value = "/editEmp")
public class editEmp extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*获取来自jsp的数据*/
        String emp_id = request.getParameter("emp_id");
        String emp_name = request.getParameter("emp_name");
        String emp_tel = request.getParameter("emp_tel");
        /*servlet-->dao*/
        try {
            new EmpImpl().editEmp(emp_id,emp_name,emp_tel);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*跳回原来的页面*/
        response.sendRedirect("view/admin/emp/editEmp.jsp");


    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
