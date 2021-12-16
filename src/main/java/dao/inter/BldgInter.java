package dao.inter;

import bean.Bldg;

import java.util.List;

public interface BldgInter {
    /*显示所有楼房信息*/
    public List<Bldg> showBldg() throws Exception;
}
