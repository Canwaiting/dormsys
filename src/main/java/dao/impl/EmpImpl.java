package dao.impl;

import bean.Dorm;
import bean.Emp;
import dao.inter.EmpInter;
import tool.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpImpl implements EmpInter {
    /*展示所有员工*/
    public List<Emp> showEmp() throws Exception{
        //初始化
        PreparedStatement pstmt = null;
        String sql = "select * from emp";
        DBConnection dbc = null;

        try{
            //创建连接
            dbc = new DBConnection();
            Connection conn = dbc.getConnection();
            //处理sql语句
            pstmt = conn.prepareStatement(sql);
            //接收返回数据
            ResultSet rs = pstmt.executeQuery();
            //处理数据
            List<Emp> empList = new ArrayList<Emp>(); /*创建User数据集*/
            while(rs.next()){
                /*获取员工数据*/
                Emp emp = new Emp();
                emp.setEmp_id(rs.getString(1));
                emp.setEmp_name(rs.getString(2));
                emp.setEmp_tel(rs.getString(3));
                /*不断添加到List中*/
                empList.add(emp);
            }
            /*返回数据集*/
            return empList;
        }
        catch(Exception e){
            throw new Exception("操作异常");
        }
        finally {
            dbc.close(); //关闭数据库连接
        }

    }
}
