package 创建者模式.原型模式.深克隆;

import java.io.Serializable;

//奖状类
public class Citation implements Cloneable, Serializable {
    private Student stu;

    public void setStu(Student stu) {
        this.stu = stu;
    }

    public Student getStu() {
        return this.stu;
    }

    public void show() {
        System.out.println(stu.getName() + "同学：在2020学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}

