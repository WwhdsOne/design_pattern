package 创建者模式.工厂模式.工厂方法模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/23 上午8:46
 * @description CoffeeStore
 **/
public class CoffeeStore {

    private CoffeeFactory coffeeFactory;

    public CoffeeStore(CoffeeFactory coffeeFactory){
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee(String type){
        Coffee coffee = coffeeFactory.createCoffee(type);
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

}
