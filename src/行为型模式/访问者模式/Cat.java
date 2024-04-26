package 行为型模式.访问者模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/26 下午9:28
 * @description 具体元素类
 **/
public class Cat implements Animal{
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("猫接受了喂食");
    }
}
