package 创建者模式.工厂模式.模式扩展;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/23 下午12:50
 * @description Client
 **/
public class Client {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee("america");
        coffee.addSugar();
        coffee.addMilk();
        System.out.println(coffee.getName());
    }
}
