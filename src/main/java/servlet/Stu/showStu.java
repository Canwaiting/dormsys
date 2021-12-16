package servlet.Stu;

import bean.Stu;
import dao.impl.StuImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "showStu", value = "/showStu")
public class showStu extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("hello world");
//        /*获取来自jsp的数据*/
//        String info = request.getParameter("info");

        /*发送数据给jsp*/
        try {
            /*获取javabean的数据*/
            List<Stu> stuList = new ArrayList<Stu>(); /*创建stu数据集*/
            stuList = new StuImpl().showStu(); /*获取数据库*/

            request.setAttribute("stuList",stuList);
            request.getRequestDispatcher("view/user/student/showStudent.jsp").forward(request,response);
//            response.sendRedirect("view/user/student/showStudent.jsp");
//            System.out.println("response.sendRedirect(\"view/user/student/showStudent.jsp\");");



        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("you are in get");
        /*发送数据给jsp*/
        try {
            /*获取javabean的数据*/
            List<Stu> stuList = new ArrayList<Stu>(); /*创建stu数据集*/
            stuList = new StuImpl().showStu(); /*获取数据库*/

            request.setAttribute("stuList",stuList);
            request.getRequestDispatcher("view/user/student/showStudent.jsp").forward(request,response);
//            response.sendRedirect("view/user/student/showStudent.jsp");
//            System.out.println("response.sendRedirect(\"view/user/student/showStudent.jsp\");");



        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
