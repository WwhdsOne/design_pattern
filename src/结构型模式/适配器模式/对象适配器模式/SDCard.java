package 结构型模式.适配器模式.对象适配器模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/24 下午6:47
 * @description 目标接口
 **/
public interface SDCard {
    //从SD卡中读取数据

    String readSD();

    //往SD卡中写数据

    void writeSD(String msg);
}
