package tool;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    //定义数据库驱动类
    private static String DBDRIVER = "com.mysql.cj.jdbc.Driver" ;
    //定义数据库连接URL
    private static String DBURL = "jdbc:mysql://localhost:3306/dormsys" ;
    //定义数据库连接用户名
    private static String DBUSER = "root" ;
    //定义数据库连接密码
    private static String DBPASSWORD = "12345" ;
    //定义数据库连接对象
    private Connection conn = null ;
    //构造方法，加载驱动
    public DBConnection(){
        try{
            Class.forName(DBDRIVER) ;
            this.conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD) ;
        }
        catch (Exception e){
            System.out.println("加载驱动失败");
        }
    }
    // 取得数据库连接
    public Connection getConnection(){
        return conn ;
    }
    // 关闭数据库连接
    public void close(){
        try{
            conn.close() ;
        }catch (Exception e){
            System.out.println("数据库连接关闭失败");
        }
    }
}