package dao.inter;

import bean.RecStu;

import java.util.List;

public interface RecStuInter {
    /*显示所有学生记录表*/
    public List<RecStu> showRecStu() throws Exception;

    /*增加学生登记信息*/
    public void addRecStu(String rec_id,String stu_id,String stu_name,String rec_stu_sta,String rec_stu_time) throws Exception;
}
