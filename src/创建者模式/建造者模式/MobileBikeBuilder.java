package 创建者模式.建造者模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/23 下午4:15
 * @description MobileBikeBuilder
 **/
public class MobileBikeBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("Mobile Frame");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("Mobile Seat");
    }

    @Override
    public Bike createBike(){
        return bike;
    }
}
