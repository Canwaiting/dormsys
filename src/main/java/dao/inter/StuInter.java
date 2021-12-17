package dao.inter;

import bean.Stu;

import java.util.List;

public interface StuInter {
    /*显示所有学生信息*/
    public List<Stu> showStu() throws Exception;

    /*增加学生信息*/
    public void addStu(String stu_id,String stu_name,String stu_class,String dorm_id) throws Exception;

    /*删除学生信息*/
    public void deleteStu(String stu_id) throws Exception;

    /*条件查询学生信息*/
    List<Stu> searchStu(String choices, String info) throws Exception;

    /*修改学生信息*/
    public void editStu(String stu_id,String stu_name,String stu_class,String dorm_id) throws Exception;
}
