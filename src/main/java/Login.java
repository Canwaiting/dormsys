import dao.UseDao;
import dao.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/Login")
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //处理用户数据
        User user = new User();
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        user.setName(name);
        user.setPassword(password);
        //判断用户登录
        boolean index = false;
        try {
            index = new UseDao().login(user.getName(),user.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
        }

        if(index==true){
            response.sendRedirect("Success.html");
        }
        else{
            response.sendRedirect("False.html");

        }
    }
}
