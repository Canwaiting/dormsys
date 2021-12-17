package dao.inter;

import bean.Dorm;
import bean.User;

import java.util.List;

public interface DormInter {
    /*显示所有宿舍信息*/
    public List<Dorm> showDorm() throws Exception;

    /*增加宿舍信息*/
    public void addDorm(String dorm_id,String dorm_size,String bldg_id) throws Exception;

    /*删除宿舍信息*/
    public void deleteDorm(String dorm_id) throws Exception;

    /*修改宿舍信息*/
    public void editDorm(String dorm_id,String dorm_size,String bldg_id) throws Exception;

    /*条件查询宿舍信息*/
    List<Dorm> searchDorm(String choices, String info) throws Exception;
}
