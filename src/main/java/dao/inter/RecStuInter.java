package dao.inter;

import bean.RecStu;

import java.util.List;

public interface RecStuInter {
    /*显示所有学生记录表*/
    public List<RecStu> showRecStu() throws Exception;
}
