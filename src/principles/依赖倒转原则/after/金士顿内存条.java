package principles.依赖倒转原则.after;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/21 下午5:46
 * @description 金士顿内存条
 **/
public class 金士顿内存条 implements 内存{

    //存储
    public void save() {
        System.out.println("使用金士顿内存条存储");
    }
}
