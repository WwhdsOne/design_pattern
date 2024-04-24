package principles.接口隔离原则.before;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/21 下午6:48
 * @description Wwh安全门
 **/
public class Wwh安全门 implements 安全门{
    @Override
    public void 防盗() {
        System.out.println("防盗");
    }

    @Override
    public void 防火() {
        System.out.println("防火");
    }

    @Override
    public void 防水() {
        System.out.println("防水");
    }
}
