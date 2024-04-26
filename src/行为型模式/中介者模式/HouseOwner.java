package 行为型模式.中介者模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/26 下午8:38
 * @description TODO
 **/
public class HouseOwner extends Person{
    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void constact(String message) {
        mediator.contract(message, this);
    }

    public void getMessage(String message) {
        System.out.println("房主" + name + "获得信息：" + message);
    }
}
