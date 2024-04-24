package principles.依赖倒转原则.after;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/21 下午5:46
 * @description 英特尔CPU
 **/
public class 英特尔CPU implements CPU{

    //运行
    public void run() {
        System.out.println("使用英特尔CPU运行");
    }
}
