package dao.inter;

import bean.RecPer;

import java.util.List;

public interface RecPerInter {
    /*显示所有访客记录表*/
    public List<RecPer> showRecPer() throws Exception;
}
