package 行为型模式.责任链模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/25 下午3:07
 * @description GroupLeader
 **/
public class GeneralManager extends Handler {

    public GeneralManager() {
        super(NUMBER_SEVEN,10);
    }

    @Override
    protected void handleLeaveRequest(LeaveRequest request) {
        System.out.println("总经理审批员工" + request.getName() + "的请假条，请假天数为" + request.getDays() + "天");
    }
}
