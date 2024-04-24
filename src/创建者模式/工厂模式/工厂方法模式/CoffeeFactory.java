package 创建者模式.工厂模式.工厂方法模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/23 上午9:09
 * @description CoffeeFactory
 **/
public interface CoffeeFactory {
    Coffee createCoffee(String type);
}
