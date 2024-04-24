package 创建者模式.单例设计模式.序列化反序列化破坏单例模式;

import java.io.*;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/22 下午4:29
 * @description 客户端
 **/
public class 客户端 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //write();
        read();
        read();
    }

    //从文件中读取单例对象
    public static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                "D:\\Programming_Learning\\Project\\design_pattern\\src\\创建者模式\\单例设计模式\\序列化反序列化破坏单例模式\\测试破坏单例.txt"));
        静态内部类懒汉式 静态内部类懒汉式实例 = (静态内部类懒汉式) ois.readObject();
        System.out.println(静态内部类懒汉式实例);
        ois.close();
    }

    //向文件中写入单例对象
    public static void write() throws IOException {
        静态内部类懒汉式 静态内部类懒汉式实例 = 静态内部类懒汉式.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
                "D:\\Programming_Learning\\Project\\design_pattern\\src\\创建者模式\\单例设计模式\\序列化反序列化破坏单例模式\\测试破坏单例.txt"));
        oos.writeObject(静态内部类懒汉式实例);
        oos.close();
    }
}
