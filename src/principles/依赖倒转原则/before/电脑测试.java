package principles.依赖倒转原则.before;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/21 下午5:50
 * @description 电脑测试
 **/
public class 电脑测试 {
    public static void main(String[] args) {
        计算机 计算机 = new 计算机();
        计算机.set希捷硬盘(new 希捷硬盘());
        计算机.set英特尔CPU(new 英特尔CPU());
        计算机.set金士顿内存条(new 金士顿内存条());
        计算机.run();
    }
}
