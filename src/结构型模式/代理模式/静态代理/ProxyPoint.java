package 结构型模式.代理模式.静态代理;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/24 下午12:03
 * @description 代售点
 **/
public class ProxyPoint implements SellTickets{

    //声明一个代理对象
    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代售点开始卖票，收取服务费用");
        trainStation.sell();
    }
}
