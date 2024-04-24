package 创建者模式.工厂模式.before;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/23 上午8:47
 * @description 客户端
 **/
public class client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("America");
        System.out.println(coffee.getName());
    }
}
