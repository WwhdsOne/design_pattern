package 行为型模式.命令模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/25 下午12:30
 * @description TODO
 **/
public class OrderCommand implements Command{
    //持有者对象
    private SeniorChef receiver;
    //订单对象
    private Order order;

    public OrderCommand(SeniorChef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }
    @Override
    public void execute() {
        System.out.println("订单已经下达：" + order.getDiningTable());
        order.getFoodDic().forEach((k,v)->{
            receiver.makeFood(k,v);
        });
    }
}
