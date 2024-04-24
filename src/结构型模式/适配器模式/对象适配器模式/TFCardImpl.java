package 结构型模式.适配器模式.对象适配器模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/24 下午6:46
 * @description 适配者类
 **/
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        return "TFCard read msg : hello word TFCard";
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard write msg : " + msg);
    }
}
