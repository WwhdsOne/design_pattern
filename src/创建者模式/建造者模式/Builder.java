package 创建者模式.建造者模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/23 下午4:13
 * @description Builder
 **/
public abstract class Builder {
    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();
}
