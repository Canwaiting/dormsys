package dao.impl;

import bean.RecStu;
import dao.inter.RecStuInter;
import tool.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RecStuImpl implements RecStuInter {

    /*展示所有的访客登记表*/
    public List<RecStu> showRecStu() throws Exception{
        //初始化
        PreparedStatement pstmt = null;
        String sql = "select * from rec_stu";
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
            List<RecStu> recstuList = new ArrayList<RecStu>(); /*创建RecPer数据集*/
            while(rs.next()){
                /*获取访客数据*/
                RecStu recstu = new RecStu();
                recstu.setRec_id(rs.getString(1));
                recstu.setStu_id(rs.getString(2));
                recstu.setStu_name(rs.getString(3));
                recstu.setRec_stu_sta(rs.getString(4));
                recstu.setRec_stu_time(rs.getString(5));
                /*不断添加到List中*/
                recstuList.add(recstu);
            }
            /*返回数据集*/
            return recstuList;
        }
        catch(Exception e){
            throw new Exception("操作异常");
        }
        finally {
            dbc.close(); //关闭数据库连接
        }

    }
}
