package dao.impl;

import bean.RecPer;
import dao.inter.RecPerInter;
import tool.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RecPerImpl implements RecPerInter {

    /*展示所有的访客登记表*/
    public List<RecPer> showRecPer() throws Exception{
        //初始化
        PreparedStatement pstmt = null;
        String sql = "select * from rec_per";
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
            List<RecPer> recperList = new ArrayList<RecPer>(); /*创建RecPer数据集*/
            while(rs.next()){
                /*获取访客数据*/
                RecPer recper = new RecPer();
                recper.setRec_id(rs.getString(1));
                recper.setPer_name(rs.getString(2));
                recper.setPer_tel(rs.getString(3));
                recper.setRec_per_sta(rs.getString(4));
                recper.setRec_per_time(rs.getString(5));
                /*不断添加到List中*/
                recperList.add(recper);
            }
            /*返回数据集*/
            return recperList;
        }
        catch(Exception e){
            throw new Exception("操作异常");
        }
        finally {
            dbc.close(); //关闭数据库连接
        }

    }

    /*增加访客登记信息*/
    public void addRecPer(String rec_id,String per_name,String per_tel,String rec_per_sta,String rec_per_time) throws Exception{
        //初始化
        PreparedStatement pstmt = null;
        String sql = "insert into rec_per(rec_id,per_name,per_tel,rec_per_sta,rec_per_time) values(?,?,?,?,?)";
        DBConnection dbc = null;

        try{
            //创建连接
            dbc = new DBConnection();
            Connection conn = dbc.getConnection();
            //处理sql语句
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,rec_id);
            pstmt.setString(2,per_name);
            pstmt.setString(3,per_tel);
            pstmt.setString(4,rec_per_sta);
            pstmt.setString(5,rec_per_time);
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
}
