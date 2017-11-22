package z_appendix.chain_of_responsibility_pattern.client;

import z_appendix.chain_of_responsibility_pattern.concreteHandler.CEO;
import z_appendix.chain_of_responsibility_pattern.concreteHandler.DepartmentManager;
import z_appendix.chain_of_responsibility_pattern.concreteHandler.GroupLeader;
import z_appendix.chain_of_responsibility_pattern.concreteHandler.ProjectManager;

/**
 * 此处以请假审批流程为例
 * 公司人员层级划分为: 员工-小组长-项目经理-部门经理-总经理。
 * 公司规定请假审批如下(请假时间为t,时间单位day，简写d)：
 *      t< 0.5d，小组长审批;
 *      t>=0.5d,t<2,项目经理审批；
 *      t>=2,t<5部门经理审批；
 *      t>=5总经理审批。
 * 
 * @author XinyuTian
 * @date 2017年3月16日
 **/
public class Test {
    public static void main(String[] args) {
        // 创建节点
        GroupLeader gl = new GroupLeader();
        ProjectManager pm = new ProjectManager();
        DepartmentManager dm = new DepartmentManager();
        CEO ceo = new CEO();
        // 建立责任链
        gl.setHandler(pm);
        pm.setHandler(dm);
        dm.setHandler(ceo);
        // 向小组长发出申请，请求审批4天的假期
        gl.approve(4D);
    }
}
