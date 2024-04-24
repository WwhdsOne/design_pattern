package 创建者模式.单例设计模式.懒汉式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/22 下午4:29
 * @description 客户端
 **/
public class 客户端 {
    public static void main(String[] args) {
        懒汉式 instance = 懒汉式.getInstance();
        懒汉式 instance1 = 懒汉式.getInstance();
        System.out.println(instance == instance1);
        双重检查锁懒汉式 instance2 = 双重检查锁懒汉式.getInstance();
        双重检查锁懒汉式 instance3 = 双重检查锁懒汉式.getInstance();
        System.out.println(instance2 == instance3);
        静态内部类懒汉式 instance4 = 静态内部类懒汉式.getInstance();
        静态内部类懒汉式 instance5 = 静态内部类懒汉式.getInstance();
        System.out.println(instance4 == instance5);
        枚举懒汉式 instance6 = 枚举懒汉式.枚举懒汉式实例;
        枚举懒汉式 instance7 = 枚举懒汉式.枚举懒汉式实例;
        System.out.println(instance6 == instance7);
    }
}
