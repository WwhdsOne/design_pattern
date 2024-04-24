package principles.开闭原则案例;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/21 下午5:01
 * @description 输入法客户端
 **/
public class 客户端 {
    public static void main(String[] args) {
        搜狗输入法 input = new 搜狗输入法();
        默认皮肤 默认皮肤 = new 默认皮肤();
        Wwh皮肤 wwh皮肤 = new Wwh皮肤();
        input.setSkin(默认皮肤);
        input.display();
        input.setSkin(wwh皮肤);
        input.display();
    }
}
