package 创建者模式.单例设计模式.反射破坏单例模式;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/22 下午4:29
 * @description 客户端
 **/
public class 客户端 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class instance = 静态内部类懒汉式.class;
        Constructor constructors = instance.getDeclaredConstructor();
        constructors.setAccessible(true);
        静态内部类懒汉式 instance1 = (静态内部类懒汉式) constructors.newInstance();
        静态内部类懒汉式 instance2 = (静态内部类懒汉式) constructors.newInstance();
        System.out.println(instance1 == instance2);
    }

}
