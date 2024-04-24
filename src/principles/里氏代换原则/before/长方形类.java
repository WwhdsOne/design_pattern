package principles.里氏代换原则.before;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/21 下午5:13
 * @description 长方形类
 **/
public class 长方形类 {
    private double 长;
    private double 宽;

    public double get长() {
        return 长;
    }

    public void set长(double 长) {
        this.长 = 长;
    }

    public double get宽() {
        return 宽;
    }

    public void set宽(double 宽) {
        this.宽 = 宽;
    }

    public double get面积() {
        return 长 * 宽;
    }
}
