package 行为型模式.责任链模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/25 下午3:00
 * @description 抽象处理者类
 **/
public abstract class Handler {
    protected final static int NUMBER_ONE = 1;
    protected final static int NUMBER_THREE = 3;
    protected final static int NUMBER_SEVEN = 7;

    //该领导处理的请假请求天数区间
    private int numStart;

    private int numEnd;

    //声明后继者（上级领导）
    private Handler nextHandler;

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    //各级领导处理请假的方法

    protected abstract void handleLeaveRequest(LeaveRequest request);

    //提交请假条
    public final void submit(LeaveRequest leave){
        if(0 == this.numStart){
            return;
        }

        //如果请假天数达到该领导者的处理要求
        if(leave.getDays() >= this.numStart){
            this.handleLeaveRequest(leave);

            //如果还有上级 并且请假天数超过了当前领导的处理范围
            if(null != this.nextHandler && leave.getDays() > numEnd){
                this.nextHandler.submit(leave);//继续提交
            } else {
                System.out.println("流程结束");
            }
        }
    }
}
