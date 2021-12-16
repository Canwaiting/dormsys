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
}
