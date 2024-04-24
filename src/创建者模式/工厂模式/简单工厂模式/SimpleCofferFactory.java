package 创建者模式.工厂模式.简单工厂模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/23 上午9:09
 * @description CoffeeFactory
 **/
public class SimpleCofferFactory {
    public Coffee createCoffee(String type){
        Coffee coffee = null;
        if("America".equals(type)){
            coffee = new AmericaCoffee();
        }else if("normal".equals(type)){
            coffee = new normalCoffee();
        }
        return coffee;
    }
}
