package 结构型模式.代理模式.静态代理;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/24 下午12:03
 * @description TrainStation
 **/
public class TrainStation implements SellTickets{
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
