package 创建者模式.工厂模式.工厂方法模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/23 上午8:47
 * @description 客户端
 **/
public class client {
    public static void main(String[] args) {
        CoffeeFactory factory = new normalCoffeeFactory();
        CoffeeStore store = new CoffeeStore(factory);
        Coffee coffee = store.orderCoffee("拿铁");
    }
}
