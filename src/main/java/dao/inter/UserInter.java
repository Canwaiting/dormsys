package dao.inter;

import bean.Stu;
import bean.User;

import java.util.List;

public interface UserInter {
    /*普通用户登录*/
    public boolean login(String name,String password) throws Exception;

    /*显示所有用户信息*/
    public List<User> showUser() throws Exception;

    /*增加用户信息*/
    public void addUser(String user_id,String user_name,String user_pw) throws Exception;

    /*删除用户信息*/
    public void deleteUser(String user_id) throws Exception;

    /*修改用户信息*/
    public void editUser(String user_id,String user_name) throws Exception;

    /*修改用户密码*/
    public void editpwUser(String user_id,String user_pw) throws Exception;

    /*条件查询学生信息*/
    List<User> searchUser(String choices, String info) throws Exception;

}
