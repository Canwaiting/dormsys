package dao.inter;

import bean.Dorm;

import java.util.List;

public interface DormInter {
    /*显示所有宿舍信息*/
    public List<Dorm> showDorm() throws Exception;

    /*增加宿舍信息*/
    public void addDorm(String dorm_id,String dorm_size,String bldg_id) throws Exception;

    /*删除宿舍信息*/
    public void deleteDorm(String dorm_id) throws Exception;
}
