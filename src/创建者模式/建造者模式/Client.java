package 创建者模式.建造者模式;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/23 下午4:22
 * @description Client
 **/
public class Client {
    public static void main(String[] args) {
        Director director = new Director(new MobileBikeBuilder());
        Bike bike = director.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());

    }
}
