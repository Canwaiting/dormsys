//import dao.UseDao;
//import dao.User;
//
//import javax.servlet.*;
//import javax.servlet.http.*;
//import javax.servlet.annotation.*;
//import java.io.IOException;
//
//@WebServlet(name = "searchName", value = "/searchName")
//public class searchName extends HttpServlet {
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        /*获取来自jsp的数据*/
//        String name = request.getParameter("name");
//        /*searchName<-->database*/
//        User user = new User();
//        try {
//            user = new UseDao().searchByName(name);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        /*业务处理*/
//        request.setAttribute("user",user);
//        request.getRequestDispatcher("stuinfo_mvc.jsp").forward(request,response);
//
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
//
//}
