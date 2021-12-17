package dao.inter;

import bean.Emp;
import bean.Stu;

import java.util.List;

public interface EmpInter {
    /*显示所有员工信息*/
    public List<Emp> showEmp() throws Exception;

    /*增加员工信息*/
    public void addEmp(String emp_id,String emp_name,String emp_tel) throws Exception;

    /*删除员工信息*/
    public void deleteEmp(String emp_id) throws Exception;

    /*修改员工信息*/
    public void editEmp(String emp_id,String emp_name,String emp_tel) throws Exception;

    /*条件查询员工信息*/
    List<Emp> searchEmp(String choices, String info) throws Exception;
}
