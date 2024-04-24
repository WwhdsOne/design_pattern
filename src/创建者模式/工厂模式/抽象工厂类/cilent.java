package 创建者模式.工厂模式.抽象工厂类;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/23 下午12:30
 * @description cilent
 **/
public class cilent {
    public static void main(String[] args) {
        NormalDessertFactory normalDessertFactory = new NormalDessertFactory();
        Coffee coffee = normalDessertFactory.createCoffee();
        Dessert dessert = normalDessertFactory.createDessert();
        System.out.println(coffee.getName());
        dessert.show();
    }
}
