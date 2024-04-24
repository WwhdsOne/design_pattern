package 创建者模式.单例设计模式.反射破坏单例模式;

import java.io.Serializable;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/22 下午5:53
 * @description 静态内部类懒汉式
 **/
public class 静态内部类懒汉式 implements Serializable {

    private static boolean flag = false;
    private 静态内部类懒汉式() {
        synchronized (静态内部类懒汉式.class){
            if( flag ){
                throw new RuntimeException("不要试图使用反射破坏单例模式");
            }
            flag = true;
        }

    }

    private static class 静态内部类懒汉式实例 {
        private static final 静态内部类懒汉式 静态内部类懒汉式实例 = new 静态内部类懒汉式();
    }

    public static 静态内部类懒汉式 getInstance() {
        return 静态内部类懒汉式实例.静态内部类懒汉式实例;
    }
}
