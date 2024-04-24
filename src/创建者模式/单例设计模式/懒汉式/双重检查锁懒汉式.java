package 创建者模式.单例设计模式.懒汉式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/22 下午4:34
 * @description 双重检查锁懒汉式
 **/
public class 双重检查锁懒汉式 {
    private 双重检查锁懒汉式() {

    }
    private static volatile 双重检查锁懒汉式 双重检查锁懒汉式实例;
    public static 双重检查锁懒汉式 getInstance() {
        if (双重检查锁懒汉式实例 == null) {
            synchronized (双重检查锁懒汉式.class) {
                if (双重检查锁懒汉式实例 == null) {
                    双重检查锁懒汉式实例 = new 双重检查锁懒汉式();
                }
            }
        }
        return 双重检查锁懒汉式实例;
    }
}
