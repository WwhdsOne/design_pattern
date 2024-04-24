package 创建者模式.工厂模式.抽象工厂类;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/23 下午12:24
 * @description 美国甜品工厂
 **/
public class AmericaDessertFactory implements 甜品制造工厂 {
    @Override
    public Coffee createCoffee() {
        return new AmericaCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new 巧克力();
    }
}
