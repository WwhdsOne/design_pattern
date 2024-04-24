package 结构型模式.装饰者模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/24 下午7:16
 * @description 快餐类（抽象构件角色）
 **/
public abstract class FastFood {
    //价格
    private float price;

    //介绍
    private String desc;

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public FastFood() {
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract float cost();
}
