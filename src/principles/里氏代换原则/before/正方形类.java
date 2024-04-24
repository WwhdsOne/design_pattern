package principles.里氏代换原则.before;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/21 下午5:14
 * @description 正方形类
 **/
public class 正方形类 extends 长方形类{
    @Override
    public void set长(double 长) {
        super.set长(长);
        super.set宽(长);
    }

    @Override
    public void set宽(double 宽) {
        super.set宽(宽);
        super.set长(宽);
    }
}
