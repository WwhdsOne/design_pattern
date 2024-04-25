package 行为型模式.策略模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/25 下午12:09
 * @description 策略A
 **/
public class StrategyA implements Strategy{
    @Override
    public void show() {
        System.out.println("策略A");
    }
}
