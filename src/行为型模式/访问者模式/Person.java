package 行为型模式.访问者模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/26 下午9:27
 * @description 抽象访问者
 **/
public interface Person {
    void feed(Cat cat);

    void feed(Dog dog);
}
