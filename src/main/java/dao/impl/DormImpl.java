package dao.impl;

import bean.Bldg;
import bean.Dorm;
import dao.inter.DormInter;
import tool.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DormImpl implements DormInter {
    /*展示所有宿舍*/
    public List<Dorm> showDorm() throws Exception{
        //初始化
        PreparedStatement pstmt = null;
        String sql = "select * from dorm";
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
            List<Dorm> dormList = new ArrayList<Dorm>(); /*创建User数据集*/
            while(rs.next()){
                /*获取宿舍数据*/
                Dorm dorm = new Dorm();
                dorm.setDorm_id(rs.getString(1));
                dorm.setDorm_size(rs.getString(2));
                dorm.setBldg_id(rs.getString(3));
                /*不断添加到List中*/
                dormList.add(dorm);
            }
            /*返回数据集*/
            return dormList;
        }
        catch(Exception e){
            throw new Exception("操作异常");
        }
        finally {
            dbc.close(); //关闭数据库连接
        }

    }
}
