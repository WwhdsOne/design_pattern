package 创建者模式.单例设计模式.饿汉式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/22 下午4:22
 * @description 静态代码块饿汉式
 **/
public class 静态代码块饿汉式 {
    //1. 私有构造方法
    private 静态代码块饿汉式() {

    }
    //2. 创建本类对象
    private static 静态代码块饿汉式 静态代码块饿汉式实例;

    //3. 在静态代码块中创建对象
    static {
        静态代码块饿汉式实例 = new 静态代码块饿汉式();
    }

    //4. 提供一个公共访问方式供外界获取本类对象
    public static 静态代码块饿汉式 getInstance() {
        return 静态代码块饿汉式实例;
    }
}
