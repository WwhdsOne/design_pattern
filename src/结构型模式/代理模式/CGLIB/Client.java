package 结构型模式.代理模式.CGLIB;



/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/24 下午12:07
 * @description 客户端
 **/
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        TrainStation trainStation = proxyFactory.getProxyObject();
        trainStation.sell();


    }
}
