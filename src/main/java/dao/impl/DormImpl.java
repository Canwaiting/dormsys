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


    /*增加宿舍信息*/
    public void addDorm(String dorm_id,String dorm_size,String bldg_id) throws Exception{
        //初始化
        PreparedStatement pstmt = null;
        String sql = "insert into dorm(dorm_id,dorm_size,bldg_id) values(?,?,?)";
        DBConnection dbc = null;

        try{
            //创建连接
            dbc = new DBConnection();
            Connection conn = dbc.getConnection();
            //处理sql语句
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,dorm_id);
            pstmt.setString(2,dorm_size);
            pstmt.setString(3,bldg_id);
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

    /*删除宿舍信息*/
    public void deleteDorm(String dorm_id) throws Exception{
        //初始化
        PreparedStatement pstmt = null;
        String sql = "delete from  dorm where dorm_id=?";
        DBConnection dbc = null;

        try{
            //创建连接
            dbc = new DBConnection();
            Connection conn = dbc.getConnection();
            //处理sql语句
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,dorm_id);
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

    /*修改宿舍信息*/
    public void editDorm(String dorm_id,String dorm_size,String bldg_id) throws Exception{
        //初始化
        PreparedStatement pstmt = null;
        String sql = "UPDATE dorm SET dorm_id=?,dorm_size=?,bldg_id=? WHERE dorm_id=?" ;
        DBConnection dbc = null;

        try{
            //创建连接
            dbc = new DBConnection();
            Connection conn = dbc.getConnection();
            //处理sql语句
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,dorm_id);
            pstmt.setString(2,dorm_size);
            pstmt.setString(3,bldg_id);
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

}
