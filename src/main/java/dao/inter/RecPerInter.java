package dao.inter;

import bean.RecPer;

import java.util.List;

public interface RecPerInter {
    /*显示所有访客记录表*/
    public List<RecPer> showRecPer() throws Exception;

    /*增加访客登记信息*/
    public void addRecPer(String rec_id,String per_name,String per_tel,String rec_per_sta,String rec_per_time) throws Exception;
}
