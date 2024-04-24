package 结构型模式.装饰者模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/24 下午7:28
 * @description Client
 **/
public class Client {
    public static void main(String[] args) {
        FriedRice friedRice = new FriedRice();
        System.out.println(friedRice.getDesc() + " 价钱：" + friedRice.cost());

        System.out.println("===============");
        //加鸡蛋
        Egg egg = new Egg(friedRice);
        Bacon bacon = new Bacon(egg);
        System.out.println(egg.getDesc() + " 价钱：" + egg.cost());
        System.out.println(bacon.getDesc() + " 价钱：" + bacon.cost());
    }
}
