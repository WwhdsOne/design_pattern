package 创建者模式.建造者模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/23 下午4:18
 * @description OfoBikeBuilder
 **/
public class OfoBikeBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("OFO Frame");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("OFO Seat");
    }


    @Override
    public Bike createBike(){
        return bike;
    }
}
