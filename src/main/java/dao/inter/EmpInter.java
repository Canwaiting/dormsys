package dao.inter;

import bean.Emp;

import java.util.List;

public interface EmpInter {
    /*显示所有员工信息*/
    public List<Emp> showEmp() throws Exception;
}
