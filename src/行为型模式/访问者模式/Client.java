package 行为型模式.访问者模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/26 下午9:33
 * @description Client
 **/
public class Client {
    public static void main(String[] args) {
        Home home = new Home();
        home.addAnimal(new Cat());
        home.addAnimal(new Dog());
        Person owner = new Owner();
        Person guest = new Guest();
        home.action(owner);
        home.action(guest);
    }
}
