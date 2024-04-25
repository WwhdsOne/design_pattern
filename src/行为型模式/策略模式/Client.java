package 行为型模式.策略模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/25 下午12:10
 * @description Client
 **/
public class Client {
    public static void main(String[] args) {
        Strategy strategy = new StrategyA();
        SalesMan salesMan = new SalesMan(strategy);
        salesMan.show();
    }
}
