package dao.impl;

import bean.Stu;
import dao.inter.StuInter;
import tool.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StuImpl implements StuInter {

    /*展示所有学生信息*/
    public List<Stu> showStu() throws Exception{
        //初始化
        PreparedStatement pstmt = null;
        String sql = "select * from stu";
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
            List<Stu> stuList = new ArrayList<Stu>(); /*创建Stu数据集*/
            while(rs.next()){
                /*获取学生数据*/
                Stu stu = new Stu();
                stu.setStu_id(rs.getString(1));
                stu.setStu_name(rs.getString(2));
                stu.setStu_class(rs.getString(3));
                stu.setDorm_id(rs.getString(4));
                /*不断添加到List中*/
                stuList.add(stu);
            }
            /*返回数据集*/
            return stuList;
        }
        catch(Exception e){
            throw new Exception("操作异常");
        }
        finally {
            dbc.close(); //关闭数据库连接
        }

    }


    /*增加学生信息*/
    public void addStu(String stu_id,String stu_name,String stu_class,String dorm_id) throws Exception{
        //初始化
        PreparedStatement pstmt = null;
        String sql = "insert into stu(stu_id,stu_name,stu_class,dorm_id) values(?,?,?,?)";
        DBConnection dbc = null;

        try{
            //创建连接
            dbc = new DBConnection();
            Connection conn = dbc.getConnection();
            //处理sql语句
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,stu_id);
            pstmt.setString(2,stu_name);
            pstmt.setString(3,stu_class);
            pstmt.setString(4,dorm_id);
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

    /*删除学生信息*/
    public void deleteStu(String stu_id) throws Exception{
        //初始化
        PreparedStatement pstmt = null;
        String sql = "delete from stu where stu_id=?";
        DBConnection dbc = null;

        try{
            //创建连接
            dbc = new DBConnection();
            Connection conn = dbc.getConnection();
            //处理sql语句
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,stu_id);
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

    /*修改学生信息*/
    public void editStu(String stu_id,String stu_name,String stu_class,String dorm_id) throws Exception{
        //初始化
        PreparedStatement pstmt = null;
        String sql = "UPDATE stu SET stu_name=?,stu_class=?,dorm_id=? WHERE stu_id=?" ;
        DBConnection dbc = null;

        try{
            //创建连接
            dbc = new DBConnection();
            Connection conn = dbc.getConnection();
            //处理sql语句
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,stu_name);
            pstmt.setString(2,stu_class);
            pstmt.setString(3,dorm_id);
            pstmt.setString(4,stu_id);
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


    /*条件查询学生信息*/
    public List<Stu> searchStu(String choices, String info) throws Exception{
        //初始化
        String sql="";
        PreparedStatement pstmt = null;

        /*根据选项使用相应的sql语句*/
        if(choices.equals("stu_id")){
             sql = "select * from stu where stu_id=?";
        }
        else if(choices.equals("stu_name")){
            sql = "select * from stu where stu_name=?";
        }
        else if(choices.equals("stu_class")){
            sql = "select * from stu where stu_class=?";
        }
        else if(choices.equals("dorm_id")){
            sql = "select * from stu where dorm_id=?";
        }
        else if(choices.equals("bldg_id")){
//             sql = "insert into stu(stu_id,stu_name,stu_class,dorm_id) values(?,?,?,?)";
            sql = "select * from stu where dorm_id in (select dorm_id from dorm where bldg_id=?)";
        }

        DBConnection dbc = null;

        try{
            //创建连接
            dbc = new DBConnection();
            Connection conn = dbc.getConnection();

            //处理sql语句
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,info);

            //执行语句
            ResultSet rs = pstmt.executeQuery();
            //处理数据
            List<Stu> stuList = new ArrayList<Stu>(); /*创建Stu数据集*/
            while(rs.next()){
                /*获取学生数据*/
                Stu stu = new Stu();
                stu.setStu_id(rs.getString(1));
                stu.setStu_name(rs.getString(2));
                stu.setStu_class(rs.getString(3));
                stu.setDorm_id(rs.getString(4));
                /*不断添加到List中*/
                stuList.add(stu);
            }
            rs.close();
            pstmt.close();
            /*返回数据集*/
            return stuList;
        }
        catch(Exception e){
            throw new Exception("操作异常");
        }
        finally {
            dbc.close(); //关闭数据库连接
        }
//        return null;

    }
}

