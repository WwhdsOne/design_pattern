package 创建者模式.工厂模式.抽象工厂类;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/23 下午12:17
 * @description 甜品制造工厂
 **/
public interface 甜品制造工厂 {
    Coffee createCoffee();

    Dessert createDessert();
}
