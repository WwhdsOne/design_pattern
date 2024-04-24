package 结构型模式.适配器模式.类适配器模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/24 下午6:53
 * @description 适配器
 **/
public class SDAdapterTF extends TFCardImpl implements SDCard{
    @Override
    public String readSD() {
        System.out.println("adapter read tf card ");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card ");
        writeTF(msg);
    }
}
