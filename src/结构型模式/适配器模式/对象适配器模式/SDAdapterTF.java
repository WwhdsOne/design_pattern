package 结构型模式.适配器模式.对象适配器模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/24 下午6:53
 * @description 适配器
 **/
public class SDAdapterTF implements SDCard {
    //声明适配者类
    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }
    @Override
    public String readSD() {
        System.out.println("adapter read tf card ");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card ");
        tfCard.writeTF(msg);
    }

}
