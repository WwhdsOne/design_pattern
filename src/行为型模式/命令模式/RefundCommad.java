package 行为型模式.命令模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/25 下午12:49
 * @description RefundCommad
 **/
public class RefundCommad implements Command{

    private SeniorChef receiver;

    private Order order;

    public RefundCommad(SeniorChef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }
    @Override
    public void execute() {
        order.getFoodDic().forEach((k,v)->{
            receiver.refundFood(k,v);
        });
    }
}
