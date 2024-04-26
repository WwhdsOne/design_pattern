package 行为型模式.访问者模式;


/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/26 下午9:26
 * @description 抽象元素
 **/
public interface Animal {
    void accept(Person person);
}
