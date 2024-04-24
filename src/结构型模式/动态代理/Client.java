package 结构型模式.动态代理;

import 结构型模式.静态代理.ProxyPoint;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/24 下午12:07
 * @description 客户端
 **/
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTickets proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();
        System.out.println(proxyObject.getClass());
        while ( true ){

        }

    }
}
