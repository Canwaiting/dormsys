package dao.impl;

import bean.Admin;
import bean.User;
import dao.inter.UserInter;
import tool.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminImpl implements UserInter {
    public boolean login(String id,String pw) throws Exception {
        //初始化
        PreparedStatement pstmt = null;
        String sql = "select * from admin where admin_id=?"; /*TODO:可能数据集为空*/
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
                Admin admin = new Admin();
                //获取密码
                admin.setAdmin_pw(rs.getString(3));
                //判断密码是否正确
                bl = pw.equals(admin.getAdmin_pw());
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
