package 行为型模式.访问者模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/26 下午9:29
 * @description 具体访问者
 **/
public class Owner implements Person{

    @Override
    public void feed(Cat cat) {
        System.out.println("主人喂食猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("主人喂食狗");
    }
}
