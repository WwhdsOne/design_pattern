package 创建者模式.单例设计模式.饿汉式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/22 下午4:19
 * @description 客户端
 **/
public class 客户端 {
    public static void main(String[] args) {
        饿汉式 饿汉式1 = 饿汉式.getInstance();
        饿汉式 饿汉式2 = 饿汉式.getInstance();
        System.out.println(饿汉式1 == 饿汉式2); //true
        静态代码块饿汉式 静态代码块饿汉式1 = 静态代码块饿汉式.getInstance();
        静态代码块饿汉式 静态代码块饿汉式2 = 静态代码块饿汉式.getInstance();
        System.out.println(静态代码块饿汉式1 == 静态代码块饿汉式2); //true
    }
}
