package 结构型模式.享元模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/25 上午10:56
 * @description 抽象享元角色
 **/
public abstract class AbstractBox {
    //获取图形的方法
    public abstract String getShape();
    //展示图形的方法
    public void display(String color){
        System.out.println("方块形状：" + getShape() + ", 颜色：" + color);
    }
}
