package 创建者模式.抽象工厂类;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/23 下午12:28
 * @description 普通甜品工厂
 **/
public class NormalDessertFactory implements 甜品制造工厂{
    @Override
    public Coffee createCoffee() {
        return new normalCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new 蛋糕();
    }
}
