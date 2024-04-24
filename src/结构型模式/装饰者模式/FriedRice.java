package 结构型模式.装饰者模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/24 下午7:18
 * @description 炒饭（具体构建角色）
 **/
public class FriedRice extends FastFood{
    public FriedRice() {
        super(10,"炒饭");
    }


    public float cost() {
        return getPrice();
    }

}
