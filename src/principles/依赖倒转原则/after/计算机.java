package principles.依赖倒转原则.after;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/21 下午5:47
 * @description 计算机
 **/
public class 计算机 {
    private 硬盘 硬盘;
    private CPU CPU;
    private 内存 内存;

    public 硬盘 get硬盘() {
        return 硬盘;
    }

    public void set硬盘(硬盘 硬盘) {
        this.硬盘 = 硬盘;
    }

    public CPU getCPU() {
        return CPU;
    }

    public void setCPU(CPU CPU) {
        this.CPU = CPU;
    }

    public 内存 get内存() {
        return 内存;
    }

    public void set内存(内存 内存) {
        this.内存 = 内存;
    }

    public void run(){
        System.out.println("计算机运行");
        硬盘.save("数据");
        内存.save();
        CPU.run();
    }
}
