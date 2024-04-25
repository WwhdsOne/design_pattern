package 行为型模式.策略模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/25 下午12:11
 * @description SalesMan
 **/
public class SalesMan {
    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    public void show() {
        strategy.show();
    }
}
