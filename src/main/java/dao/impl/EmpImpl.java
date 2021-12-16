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


    /*增加员工信息*/
    public void addEmp(String emp_id,String emp_name,String emp_tel) throws Exception{
        //初始化
        PreparedStatement pstmt = null;
        String sql = "insert into dorm(emp_id,emp_name,emp_tel) values(?,?,?)";
        DBConnection dbc = null;

        try{
            //创建连接
            dbc = new DBConnection();
            Connection conn = dbc.getConnection();
            //处理sql语句
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,emp_id);
            pstmt.setString(2,emp_name);
            pstmt.setString(3,emp_tel);
            //执行语句
            pstmt.executeUpdate();
            pstmt.close();
        }
        catch(Exception e){
            throw new Exception("操作异常");
        }
        finally {
            dbc.close(); //关闭数据库连接
        }
    }


    /*删除员工信息*/
    public void deleteEmp(String emp_id) throws Exception{
        //初始化
        PreparedStatement pstmt = null;
        String sql = "delete from  emp where emp_id=?";
        DBConnection dbc = null;

        try{
            //创建连接
            dbc = new DBConnection();
            Connection conn = dbc.getConnection();
            //处理sql语句
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,emp_id);
            pstmt.executeUpdate();
            pstmt.close();
        }
        catch(Exception e){
            throw new Exception("操作异常");
        }
        finally {
            dbc.close(); //关闭数据库连接
        }
    }
}