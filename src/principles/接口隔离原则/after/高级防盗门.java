package principles.接口隔离原则.after;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/21 下午6:51
 * @description 高级防盗门
 **/
 public class 高级防盗门 implements 防盗, 防火{
    @Override
    public void 防盗() {
        System.out.println("防盗");
    }

    @Override
    public void 防火() {
        System.out.println("防火");
    }
}
