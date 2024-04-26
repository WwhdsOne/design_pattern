package 行为型模式.中介者模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/26 下午8:33
 * @description 具体同事角色类
 **/
public class Tenant extends Person {
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void constact(String message) {
        mediator.contract(message, this);
    }

    public void getMessage(String message) {
        System.out.println("租房者" + name + "获得信息：" + message);
    }
}
