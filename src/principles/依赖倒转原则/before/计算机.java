package principles.依赖倒转原则.before;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/21 下午5:47
 * @description 计算机
 **/
public class 计算机 {
    private 希捷硬盘 希捷硬盘;
    private 英特尔CPU 英特尔CPU;
    private 金士顿内存条 金士顿内存条;

    public 希捷硬盘 get希捷硬盘() {
        return 希捷硬盘;
    }

    public void set希捷硬盘(希捷硬盘 希捷硬盘) {
        this.希捷硬盘 = 希捷硬盘;
    }

    public 英特尔CPU get英特尔CPU() {
        return 英特尔CPU;
    }

    public void set英特尔CPU(英特尔CPU 英特尔CPU) {
        this.英特尔CPU = 英特尔CPU;
    }

    public 金士顿内存条 get金士顿内存条() {
        return 金士顿内存条;
    }

    public void set金士顿内存条(金士顿内存条 金士顿内存条) {
        this.金士顿内存条 = 金士顿内存条;
    }

    public void run(){
        System.out.println("计算机运行");
        希捷硬盘.save("数据");
        金士顿内存条.save();
        英特尔CPU.run();
    }
}
