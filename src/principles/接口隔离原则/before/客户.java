package principles.接口隔离原则.before;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/21 下午6:48
 * @description 客户使用
 **/
public class 客户 {
    public static void main(String[] args) {
        Wwh安全门 wwh安全门 = new Wwh安全门();
        wwh安全门.防盗();
        wwh安全门.防火();
        wwh安全门.防水();
    }
}
