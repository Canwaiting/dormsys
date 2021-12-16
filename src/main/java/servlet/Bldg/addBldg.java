package servlet.Bldg;

import dao.impl.BldgImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "addBldg", value = "/addBldg")
public class addBldg extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*获取来自jsp的数据*/
        String bldg_id = request.getParameter("bldg_id");
        String bldg_floor = request.getParameter("bldg_floor");
        String bldg_pos = request.getParameter("bldg_pos");
        /*servlet-->dao*/
        try {
            new BldgImpl().addBldg(bldg_id,bldg_floor,bldg_pos);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*跳回原来的页面*/
        response.sendRedirect("view/admin/bldg/addBldg.jsp");


    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
