package 创建者模式.工厂模式.before;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/23 上午8:46
 * @description CoffeeStore
 **/
public class CoffeeStore {
        public Coffee orderCoffee(String type){
            Coffee coffee = null;
            if("America".equals(type)){
                coffee = new AmericaCoffee();
            }else if("normal".equals(type)){
                coffee = new normalCoffee();
            } else{
                throw new RuntimeException("不存在此种咖啡");
            }
            coffee.addMilk();
            coffee.addSugar();
            return coffee;
        }
}
