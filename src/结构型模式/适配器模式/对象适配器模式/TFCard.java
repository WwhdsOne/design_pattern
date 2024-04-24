package 结构型模式.适配器模式.对象适配器模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/24 下午6:43
 * @description 适配者类的接口
 **/
public interface TFCard {
    //从TF卡中读取数据
    String readTF();
    //从TF卡中写数据
    void writeTF(String msg);
}
