package 结构型模式.适配器模式.类适配器模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/24 下午6:48
 * @description 电脑
 **/
public class Computer {
    //从SD卡中读取数据
    public String readSDCard(SDCard sdCard){
        if(sdCard == null){
            throw new NullPointerException("sd card can't be null");
        }
        return sdCard.readSD();
    }
    //往SD卡中写数据
    public void writeSDCard(SDCard sdCard,String msg){
        sdCard.writeSD(msg);
    }
}
