package principles.里氏代换原则.after;

import principles.里氏代换原则.after.长方形类;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/21 下午5:16
 * @description 矩形测试
 **/
public class 矩形测试 {
    public static void main(String[] args) {
        长方形类 长方形 = new 长方形类();
        长方形.set长(10);
        长方形.set宽(20);
        resize(长方形);
        打印长和宽(长方形);
    }

    private static void resize(长方形类 长方形) {
        while (长方形.get长() <= 长方形.get宽()) {
            长方形.set长(长方形.get长() + 1);
        }
    }

    private static void 打印长和宽(四边形 四边形) {
        System.out.println("长：" + 四边形.get长());
        System.out.println("宽：" + 四边形.get宽());
    }
}
