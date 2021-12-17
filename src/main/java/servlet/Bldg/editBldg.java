package servlet.Bldg;

import dao.impl.BldgImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "editBldg", value = "/editBldg")
public class editBldg extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*获取来自jsp的数据*/
        String bldg_id = request.getParameter("bldg_id");
        String bldg_floor = request.getParameter("bldg_floor");
        String bldg_pos = request.getParameter("bldg_pos");
        /*servlet-->dao*/
        try {
            new BldgImpl().editBldg(bldg_id,bldg_floor,bldg_pos);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*跳回原来的页面*/
        response.sendRedirect("view/admin/bldg/editBldg.jsp");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
