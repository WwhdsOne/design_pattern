package 结构型模式.装饰者模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/24 下午7:22
 * @description 具体装饰者角色
 **/
public class Bacon extends Garnish {
    public Bacon(FastFood fastFood) {
        super(fastFood, 5, "培根");
    }

    public float cost() {
        //计算价格
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }



}
