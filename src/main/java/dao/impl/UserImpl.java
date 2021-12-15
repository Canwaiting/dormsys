package dao.impl;

import bean.User;
import dao.inter.UserInter;
import org.w3c.dom.events.UIEvent;
import tool.DBConnection;

import java.sql.*;

public class UserImpl implements UserInter {
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
}
