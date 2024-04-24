package 结构型模式.外观模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/24 下午8:12
 * @description Client
 **/
public class Client {
    public static void main(String[] args) {
        SimpleFacade simpleFacade = new SimpleFacade();
        simpleFacade.say("off");
    }
}
