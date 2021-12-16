package dao.inter;

import bean.Emp;

import java.util.List;

public interface EmpInter {
    /*显示所有员工信息*/
    public List<Emp> showEmp() throws Exception;

    /*增加员工信息*/
    public void addEmp(String emp_id,String emp_name,String emp_tel) throws Exception;

    /*删除员工信息*/
    public void deleteEmp(String emp_id) throws Exception;
}
