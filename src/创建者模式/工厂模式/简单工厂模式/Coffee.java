package 创建者模式.工厂模式.简单工厂模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/23 上午8:41
 * @description 咖啡
 **/
public abstract class Coffee {

    public abstract String getName();
    //加糖
    public void addSugar(){
        System.out.println("加糖");
    }

    //加奶
    public void addMilk(){
        System.out.println("加奶");
    }
}
