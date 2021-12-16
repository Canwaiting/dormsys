package dao.inter;

import bean.User;

import java.util.List;

public interface UserInter {
    /*普通用户登录*/
    public boolean login(String name,String password) throws Exception;

    /*显示所有学生信息*/
    public List<User> showUser() throws Exception;
}
