package 结构型模式.静态代理;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/24 下午12:07
 * @description 客户端
 **/
public class Client {
    public static void main(String[] args) {
        // 创建代理对象
        ProxyPoint proxy = new ProxyPoint();
        // 调用代理对象的方法
        proxy.sell();
    }
}
