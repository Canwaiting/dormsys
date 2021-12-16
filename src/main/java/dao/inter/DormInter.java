package dao.inter;

import bean.Dorm;

import java.util.List;

public interface DormInter {
    /*显示所有宿舍信息*/
    public List<Dorm> showDorm() throws Exception;
}
