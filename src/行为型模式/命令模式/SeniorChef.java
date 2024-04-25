package 行为型模式.命令模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/25 下午12:29
 * @description 厨师类
 **/
public class SeniorChef {
    public void makeFood(String name, int num) {
        System.out.println("厨师正在做：" + name + " 数量：" + num);
    }

    public void refundFood(String name, int num) {
        System.out.println("厨师正在退菜：" + name + " 数量：" + num);
    }
}
