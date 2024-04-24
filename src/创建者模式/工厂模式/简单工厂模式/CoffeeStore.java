package 创建者模式.工厂模式.简单工厂模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/23 上午8:46
 * @description CoffeeStore
 **/
public class CoffeeStore {
        public Coffee orderCoffee(String type){
            // 创建咖啡工厂对象
            SimpleCofferFactory simpleCofferFactory = new SimpleCofferFactory();
            return simpleCofferFactory.createCoffee(type);
        }
}
