package 结构型模式.装饰者模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/24 下午7:19
 * @description 炒面（具体构建角色）
 **/
public class FriedNoodles extends FastFood{
    public FriedNoodles() {
        super(12,"炒面");
    }

    public float cost() {
        return getPrice();
    }
}
