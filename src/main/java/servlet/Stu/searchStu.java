package servlet.Stu;

import bean.Stu;
import dao.impl.StuImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "searchStu", value = "/searchStu")
public class searchStu extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*获取前台数据*/
        String choices = request.getParameter("choices");
        String info = request.getParameter("info");
        /*获取javabean的数据*/
        List<Stu> stuList = new ArrayList<Stu>(); /*创建stu数据集*/
//    stuList = new StuImpl().showStu(); /*获取数据*/
        try {
            stuList = new StuImpl().searchStu(choices,info); /*获取数据*/
        } catch (Exception e) {
            e.printStackTrace();
        }

        request.setAttribute("stuList",stuList);

    }
}
