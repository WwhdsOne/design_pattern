package 行为型模式.中介者模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/26 下午8:31
 * @description 抽象同事类
 **/
public abstract class Person {
    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

}
