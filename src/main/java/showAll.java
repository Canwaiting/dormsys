import com.alibaba.fastjson.JSONObject;
import com.mysql.cj.xdevapi.JsonArray;
import dao.UseDao;
import dao.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/showAll")
public class showAll extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*发送数据给jsp*/
        request.setAttribute("test","hello world");
        /*获取来自jsp的数据*/
        String info = request.getParameter("info");
        /*发送数据给jsp*/
        try {
            /*获取javabean的数据*/
            List<User> userList = new ArrayList<User>(); /*创建User数据集*/
            userList = new UseDao().showAll(); /*获取UseDao的数据集*/
            if(userList==null){
                System.out.println("showAll::userList is NULL");
            }
            request.setAttribute("userList",userList);
//            request.getRequestDispatcher("stuinfo_mvc.jsp").forward(request,response);
            request.getRequestDispatcher("view/user/useruser.jsp").forward(request,response);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
