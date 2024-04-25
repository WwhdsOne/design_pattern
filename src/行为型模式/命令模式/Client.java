package 行为型模式.命令模式;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/25 下午12:38
 * @description Client
 **/
public class Client {
    public static void main(String[] args) {
        Order order = new Order();
        order.setDiningTable(1);
        order.setFoodDic("鱼香肉丝", 1);
        order.setFoodDic("宫保鸡丁", 2);
        order.setFoodDic("米饭", 2);
        Order order1 = new Order();
        order1.setFoodDic("鱼香肉丝", 1);
        order1.setFoodDic("宫保鸡丁", 2);
        order1.setFoodDic("米饭", 2);
        Waitor waitor = new Waitor();
        SeniorChef seniorChef = new SeniorChef();
        Command command = new OrderCommand(seniorChef, order);
        Command command1 = new RefundCommad(seniorChef, order1);
        waitor.setOrder(command);
        waitor.orderUp();
        waitor.setOrder(command1);
        waitor.orderUp();
    }
}
