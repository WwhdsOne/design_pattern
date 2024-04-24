package principles.开闭原则案例;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/21 下午5:00
 * @description 搜狗输入法
 **/
public class 搜狗输入法 {
    private 抽象皮肤类 skin;
    public void setSkin(抽象皮肤类 skin) {
        this.skin = skin;
    }

    public void display() {
        skin.display();
    }
}
