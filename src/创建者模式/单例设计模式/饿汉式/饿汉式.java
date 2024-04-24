package 创建者模式.单例设计模式.饿汉式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/22 下午3:55
 * @description 饿汉式
 **/
public class 饿汉式 {
    //类加载会导致对象的创建
    //1. 私有构造方法
    private 饿汉式() {

    }
    //2. 创建本类对象
    private static 饿汉式 饿汉式实例 = new 饿汉式();

    //3. 提供一个公共访问方式供外界获取本类对象
    public static 饿汉式 getInstance() {
        return 饿汉式实例;
    }
}
