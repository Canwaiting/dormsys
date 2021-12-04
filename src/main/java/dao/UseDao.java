package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UseDao{
    public boolean login(String name,String password) throws Exception {
        //初始化
        PreparedStatement pstmt = null;
        String sql = "select * from user where name=?";
        DBConnection dbc = null;

        try{
            //创建连接
            dbc = new DBConnection();
            Connection conn = dbc.getConnection();
            //处理sql语句
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,name);
            //接收返回数据
            ResultSet rs = pstmt.executeQuery();
            //处理数据
            while(rs.next()){
                boolean bl = false;
                //获取密码
                User user = new User();
                user.setPassword(rs.getString(2));
                //判断密码是否正确
                bl= password.equals(user.getPassword());
                //关闭数据流
                rs.close();
                pstmt.close();
                if(bl){
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
        System.out.println("see where we go");
        return false;
    }

    /*获取所有用户数据*/
    public List<User> showAll() throws Exception{
        //初始化
        PreparedStatement pstmt = null;
        String sql = "select * from user";
        DBConnection dbc = null;

        try{
            //创建连接
            dbc = new DBConnection();
            Connection conn = dbc.getConnection();
            //处理sql语句
            pstmt = conn.prepareStatement(sql); /*TODO*/
            //接收返回数据
            ResultSet rs = pstmt.executeQuery();
            //处理数据
            List<User> userList = new ArrayList<User>(); /*创建User数据集*/
            while(rs.next()){
                /*获取当前的User数据*/
                User user = new User();
                user.setName(rs.getString(1));
                user.setPassword(rs.getString(2));
                /*不断添加到List中*/
                userList.add(user);
            }
            /*TODO:TEST*/
            for(User user : userList){
                System.out.println(user.getName());
                System.out.println(user.getPassword());
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

    /*以用户名来获取用户数据*/
    public User searchByName(String name) throws Exception{
        System.out.println("-------------------");
        System.out.println("javabean-->database");
        System.out.println(name);
        System.out.println("-------------------");
        //初始化
        PreparedStatement pstmt = null;
        String sql = "select * from user where name=?";
        DBConnection dbc = null;

        try{
            //创建连接
            dbc = new DBConnection();
            Connection conn = dbc.getConnection();
            //处理sql语句
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,name);
            //接收返回数据
            ResultSet rs = pstmt.executeQuery();
            //处理数据
            while(rs.next()){
                //获取用户信息
                User user = new User();
                boolean bl = name.equals(rs.getString(1));
                System.out.println("rs.getString(1)");
                System.out.println(rs.getString(1));
                System.out.println("rs.getString(1)");
                /*把当前数据库的数据传入User*/
                user.setName(rs.getString(1));
                user.setPassword(rs.getString(2));
                //关闭数据流
                rs.close();
                pstmt.close();
                if(bl){
                    System.out.println("SEARch");
                    System.out.println(user.name);
                    System.out.println("SEARch");

                    return user;
                }
            }
        }
        catch(Exception e){
            throw new Exception("操作异常");
        }
        finally {
            dbc.close(); //关闭数据库连接
        }
        return null; /*没有找到,返回空*/
    }

    /*插入数据*/
    /*TODO:检查是否重复*/
    /*TODO:没有检查是否插入成功*/
    public void addFunc(String name,String password) throws Exception{
        System.out.println("addFunc::name:" + name);
        System.out.println("addFunc::password:" + password);
        //初始化
        PreparedStatement pstmt = null;
        String sql = "insert into user(name,password) values(?,?)";
        DBConnection dbc = null;

        try{
            //创建连接
            dbc = new DBConnection();
            Connection conn = dbc.getConnection();
            //处理sql语句
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,name);
            pstmt.setString(2,password);
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

    /*删除数据*/
    /*TODO:没有检查是否有此用户*/
    /*TODO:没有检查是否删除成功*/
    public void deleteFunc(String name) throws Exception{
        //初始化
        PreparedStatement pstmt = null;
        String sql = "delete from user where name=?";
        DBConnection dbc = null;

        try{
            //创建连接
            dbc = new DBConnection();
            Connection conn = dbc.getConnection();
            //处理sql语句
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,name);
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
