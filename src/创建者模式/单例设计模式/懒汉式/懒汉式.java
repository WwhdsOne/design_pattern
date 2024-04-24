package 创建者模式.单例设计模式.懒汉式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/22 下午4:26
 * @description 懒汉式
 **/
public class 懒汉式 {
    //1.私有化构造器
    private 懒汉式() {

    }
    //2.创建私有静态变量
    private static 懒汉式 懒汉式实例;

    /**
     * 提供一个公有的静态方法，当使用该方法时，才创建实例
     *
     * @return 返回懒汉式单例对象
     */
    public static 懒汉式 getInstance() {
        if (懒汉式实例 == null) {
            懒汉式实例 = new 懒汉式();
        }
        return 懒汉式实例;
    }
}
