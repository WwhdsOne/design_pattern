package 创建者模式.单例设计模式.懒汉式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/22 下午5:53
 * @description 静态内部类懒汉式
 **/
public class 静态内部类懒汉式 {
    private 静态内部类懒汉式() {

    }

    private static class 静态内部类懒汉式实例 {
        private static final 静态内部类懒汉式 静态内部类懒汉式实例 = new 静态内部类懒汉式();
    }

    public static 静态内部类懒汉式 getInstance() {
        return 静态内部类懒汉式实例.静态内部类懒汉式实例;
    }
}
