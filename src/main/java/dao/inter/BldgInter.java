package dao.inter;

import bean.Bldg;
import bean.User;

import java.util.List;

public interface BldgInter {
    /*显示所有楼房信息*/
    public List<Bldg> showBldg() throws Exception;

    /*增加楼房信息*/
    public void addBldg(String bldg_id,String bldg_floor,String bldg_pos) throws Exception;

    /*删除楼房信息*/
    public void deleteBldg(String bldg_id) throws Exception;

    /*修改楼房信息*/
    public void editBldg(String bldg_id,String bldg_floor,String bldg_post) throws Exception;

    /*条件查询楼房信息*/
    List<Bldg> searchBldg(String choices, String info) throws Exception;
}
