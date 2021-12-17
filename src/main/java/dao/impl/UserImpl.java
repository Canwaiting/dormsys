package dao.impl;

import bean.Stu;
import bean.User;
import dao.inter.UserInter;
import org.w3c.dom.events.UIEvent;
import tool.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserImpl implements UserInter {

    /*普通用户登录*/
    public boolean login(String id,String pw) throws Exception {
        //初始化
        PreparedStatement pstmt = null;
        String sql = "select * from user where user_id=?"; /*TODO:可能数据集为空*/
        DBConnection dbc = null;

        try{
            /*创建连接*/
            dbc = new DBConnection();
            Connection conn = dbc.getConnection();
            /*处理sql语句*/
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,id);
            //接收返回数据
            ResultSet rs = pstmt.executeQuery();
            //处理数据
            while(rs.next()){
                boolean bl = false;
                User user = new User();
                //获取密码
                user.setUser_pw(rs.getString(3)); /*数据库中的第三列*/
                //判断密码是否正确
                bl = pw.equals(user.getUser_pw());
                //关闭数据流
                rs.close();
                pstmt.close();

                if(bl){
                    /*test*/
                    System.out.println("true");

                    return true;
                }
            }
        }

        catch(Exception e){
            throw new Exception("操作异常");
        }
        finally {
            dbc.close(); //关闭数据库连接
        }
        return false;
    }

    /*展示所有用户*/
    public List<User> showUser() throws Exception{
        //初始化
        PreparedStatement pstmt = null;
        String sql = "select * from user";
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
            List<User> userList = new ArrayList<User>(); /*创建User数据集*/
            while(rs.next()){
                /*获取学生数据*/
                User user = new User();
                user.setUser_id(rs.getString(1));
                user.setUser_name(rs.getString(2));
                user.setUser_pw(rs.getString(3));
                /*不断添加到List中*/
                userList.add(user);
            }
            /*返回数据集*/
            return userList;
        }
        catch(Exception e){
            throw new Exception("操作异常");
        }
        finally {
            dbc.close(); //关闭数据库连接
        }

    }


    /*增加用户信息*/
    public void addUser(String user_id,String user_name,String user_pw) throws Exception{
        //初始化
        PreparedStatement pstmt = null;
        String sql = "insert into user(user_id,user_name,user_pw) values(?,?,?)";
        DBConnection dbc = null;

        try{
            //创建连接
            dbc = new DBConnection();
            Connection conn = dbc.getConnection();
            //处理sql语句
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,user_id);
            pstmt.setString(2,user_name);
            pstmt.setString(3,user_pw);
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

    /*删除用户信息*/
    public void deleteUser(String user_id) throws Exception{
        //初始化
        PreparedStatement pstmt = null;
        String sql = "delete from  user where user_id=?";
        DBConnection dbc = null;

        try{
            //创建连接
            dbc = new DBConnection();
            Connection conn = dbc.getConnection();
            //处理sql语句
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,user_id);
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

    /*修改用户信息*/
    public void editUser(String user_id,String user_name) throws Exception{
        //初始化
        PreparedStatement pstmt = null;
        String sql = "UPDATE user SET user_id=?,user_name=? WHERE user_id=?" ;
        DBConnection dbc = null;

        try{
            //创建连接
            dbc = new DBConnection();
            Connection conn = dbc.getConnection();
            //处理sql语句
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,user_id);
            pstmt.setString(2,user_name);
            pstmt.setString(3,user_id);
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


    /*修改用户密码*/
    public void editpwUser(String user_id,String user_pw) throws Exception{
        //初始化
        PreparedStatement pstmt = null;
        String sql = "UPDATE user SET user_id=?,user_pw=? WHERE user_id=?" ;
        DBConnection dbc = null;

        try{
            //创建连接
            dbc = new DBConnection();
            Connection conn = dbc.getConnection();
            //处理sql语句
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,user_id);
            pstmt.setString(2,user_pw);
            pstmt.setString(3,user_id);
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

    /*条件查询用户信息*/
    public List<User> searchUser(String choices, String info) throws Exception{
        //初始化
        String sql="";
        PreparedStatement pstmt = null;

        /*根据选项使用相应的sql语句*/
        if(choices.equals("user_id")){
            sql = "select * from user where user_id=?";
        }
        else if(choices.equals("user_name")){
            sql = "select * from user where user_name=?";
        }


        DBConnection dbc = null;

        /*TODO:DOThat*/
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
            List<User> userList = new ArrayList<User>(); /*创建Stu数据集*/
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
