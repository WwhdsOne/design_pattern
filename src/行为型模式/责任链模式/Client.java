package 行为型模式.责任链模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/25 下午3:10
 * @description Client
 **/
public class Client {
    public static void main(String[] args) {
        LeaveRequest request = new LeaveRequest("小明", 8, "回家探亲");
        Handler groupLeader = new GroupLeader();
        Handler manager = new Manager();
        Handler generalManager = new GeneralManager();
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);
        groupLeader.submit(request);
    }
}
