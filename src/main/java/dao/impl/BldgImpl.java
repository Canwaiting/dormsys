package dao.impl;

import bean.Bldg;
import bean.Stu;
import bean.User;
import dao.inter.BldgInter;
import tool.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BldgImpl implements BldgInter {
    /*展示所有楼房*/
    public List<Bldg> showBldg() throws Exception{
        //初始化
        PreparedStatement pstmt = null;
        String sql = "select * from bldg";
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
            List<Bldg> bldgList = new ArrayList<Bldg>(); /*创建User数据集*/
            while(rs.next()){
                /*获取楼房数据*/
                Bldg bldg = new Bldg();
                bldg.setBldg_id(rs.getString(1));
                bldg.setBldg_floor(rs.getString(2));
                bldg.setBldg_pos(rs.getString(3));
                /*不断添加到List中*/
                bldgList.add(bldg);
            }
            /*返回数据集*/
            return bldgList;
        }
        catch(Exception e){
            throw new Exception("操作异常");
        }
        finally {
            dbc.close(); //关闭数据库连接
        }

    }


    /*增加楼房信息*/
    public void addBldg(String bldg_id,String bldg_floor,String bldg_pos) throws Exception{
        //初始化
        PreparedStatement pstmt = null;
        String sql = "insert into user(bldg_id,bldg_floor,bldg_pos) values(?,?,?)";
        DBConnection dbc = null;

        try{
            //创建连接
            dbc = new DBConnection();
            Connection conn = dbc.getConnection();
            //处理sql语句
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,bldg_id);
            pstmt.setString(2,bldg_floor);
            pstmt.setString(3,bldg_pos);
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

    /*删除楼房信息*/
    public void deleteBldg(String bldg_id) throws Exception{
        //初始化
        PreparedStatement pstmt = null;
        String sql = "delete from  bldg where bldg_id=?";
        DBConnection dbc = null;

        try{
            //创建连接
            dbc = new DBConnection();
            Connection conn = dbc.getConnection();
            //处理sql语句
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,bldg_id);
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


    /*修改楼房信息*/
    public void editBldg(String bldg_id,String bldg_floor,String bldg_pos) throws Exception{
        //初始化
        PreparedStatement pstmt = null;
        String sql = "UPDATE bldg SET bldg_id=?,bldg_floor=?,bldg_pos=? WHERE bldg_id=?" ;
        DBConnection dbc = null;

        try{
            //创建连接
            dbc = new DBConnection();
            Connection conn = dbc.getConnection();
            //处理sql语句
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,bldg_id);
            pstmt.setString(2,bldg_floor);
            pstmt.setString(3,bldg_pos);
            pstmt.setString(4,bldg_id);
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

    /*条件查询楼房信息*/
    public List<Bldg> searchBldg(String choices, String info) throws Exception{
        //初始化
        String sql="";
        PreparedStatement pstmt = null;

        /*根据选项使用相应的sql语句*/
        if(choices.equals("bldg_id")){
            sql = "select * from bldg where bldg_id=?";
        }
        else if(choices.equals("bldg_floor")){
            sql = "select * from bldg where bldg_floor=?";
        }
        else if(choices.equals("bldg_pos")){
            sql = "select * from bldg where bldg_pos=?";
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
            List<Bldg>  bldgList = new ArrayList<Bldg>(); /*创建Bldg数据集*/
            while(rs.next()){
                /*获取学生数据*/
                Bldg bldg = new Bldg();
                bldg.setBldg_id(rs.getString(1));
                bldg.setBldg_floor(rs.getString(2));
                bldg.setBldg_pos(rs.getString(3));
                /*不断添加到List中*/
                bldgList.add(bldg);
            }
            rs.close();
            pstmt.close();
            /*返回数据集*/
            return bldgList;
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
