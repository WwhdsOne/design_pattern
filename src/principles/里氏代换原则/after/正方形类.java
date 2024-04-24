package principles.里氏代换原则.after;


/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/21 下午5:14
 * @description 正方形类
 **/
public class 正方形类 implements 四边形 {
    private double 边长;

    public void set边长(double 边长) {
        this.边长 = 边长;
    }
    public double get边长() {
        return 边长;
    }

    @Override
    public double get长() {
        return 边长;
    }

    @Override
    public double get宽() {
        return 边长;
    }
}
