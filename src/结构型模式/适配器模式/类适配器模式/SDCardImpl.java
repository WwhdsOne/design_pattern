package 结构型模式.适配器模式.类适配器模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/24 下午6:47
 * @description 具体SD卡类
 **/
public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        return "SDCard read msg : hello word SD";
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write msg : " + msg);
    }
}
