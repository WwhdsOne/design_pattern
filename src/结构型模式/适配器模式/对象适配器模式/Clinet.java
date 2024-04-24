package 结构型模式.适配器模式.对象适配器模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/24 下午6:49
 * @description 客户端
 **/
public class Clinet {
    public static void main(String[] args) {
        Computer computer = new Computer();
        String s = computer.readSDCard(new SDCardImpl());
        System.out.println(s);

        System.out.println("===============");

        //读取TF卡内容
        //定义一个TF卡
        TFCard tfCard = new TFCardImpl();
        String msg1 = computer.readSDCard(new SDAdapterTF(tfCard));
        System.out.println(msg1);
    }
}
