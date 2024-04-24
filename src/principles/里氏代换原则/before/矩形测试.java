package principles.里氏代换原则.before;

import java.awt.*;

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
        System.out.println("===================");
        正方形类 正方形 = new 正方形类();
        正方形.set长(10);
        resize(正方形);  //进入死循环
                        //子类不能替代父类
        打印长和宽(正方形);
    }

    private static void resize(长方形类 长方形) {
        while (长方形.get长() <= 长方形.get宽()) {
            长方形.set长(长方形.get长() + 1);
        }
    }

    private static void 打印长和宽(长方形类 长方形) {
        System.out.println("长：" + 长方形.get长());
        System.out.println("宽：" + 长方形.get宽());
    }
}
