package 创建者模式.原型模式.深克隆;

import java.io.*;

//测试访问类
public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Citation c1 = new Citation();
        Student stu = new Student();
        stu.setName("张三");
        c1.setStu(stu);
        //输出原始对象
        ObjectOutputStream oos = new
                ObjectOutputStream(new FileOutputStream("D:\\Programming_Learning\\Project\\design_pattern\\src\\创建者模式\\原型模式\\深克隆\\stu.txt"));
        oos.writeObject(c1);
        oos.close();

        //读取原始对象
        ObjectInputStream ois = new
                ObjectInputStream(new FileInputStream("D:\\Programming_Learning\\Project\\design_pattern\\src\\创建者模式\\原型模式\\深克隆\\stu.txt"));
        Citation c2 = (Citation)ois.readObject();
        Student stu1 = c2.getStu();
        stu1.setName("李四");
        //判断stu对象和stu1对象是否是同一个对象
        System.out.println("stu和stu1是同一个对象？" + (stu == stu1));

        c1.show();
        c2.show();
    }
}
