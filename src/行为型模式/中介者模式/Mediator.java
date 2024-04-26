package 行为型模式.中介者模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/26 下午8:30
 * @description 抽象中介者类
 **/
public interface Mediator {
    void contract(String message, Person person);
}
