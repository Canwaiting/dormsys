package servlet.Bldg;

import dao.impl.BldgImpl;
import dao.impl.UserImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "deleteBldg", value = "/deleteBldg")
public class deleteBldg extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /*获取来自jsp的数据*/
        String bldg_id = request.getParameter("bldg_id");

        /*调用删除操作*/
        try {
            new BldgImpl().deleteBldg(bldg_id);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*跳回原来的页面*/
        response.sendRedirect("view/admin/bldg/deleteBldg.jsp");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
