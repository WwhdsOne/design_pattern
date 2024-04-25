package 行为型模式.责任链模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/25 下午3:07
 * @description GroupLeader
 **/
public class GroupLeader extends Handler {

    public GroupLeader() {
        super(NUMBER_ONE,NUMBER_THREE);
    }

    @Override
    protected void handleLeaveRequest(LeaveRequest request) {
        System.out.println("组长审批员工" + request.getName() + "的请假条，请假天数为" + request.getDays() + "天");
    }
}
