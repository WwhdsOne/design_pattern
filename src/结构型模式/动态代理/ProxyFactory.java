package 结构型模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/24 下午12:09
 * @description ProxyFactory
 **/
public class ProxyFactory {

    private TrainStation trainStation = new TrainStation();

    public SellTickets getProxyObject() {
        //返回代理对象
        /*
            ClassLoader loader,   类加载器
            Class<?>[] interfaces,代理类实现的接口的字节码对象
            InvocationHandler h   代理对象的方法调用处理器
         */
        Class clazz = trainStation.getClass();
        SellTickets sellTickets = (SellTickets) Proxy.newProxyInstance(
                clazz.getClassLoader(),
                clazz.getInterfaces(),
                new InvocationHandler() {
                    /*
                        proxy:代理对象
                        method:代理对象调用的方法，被封装为的对象
                        args:代理对象调用方法时传递的实际参数
                     */
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("Jdk动态代理开始卖票，收取服务费用");
                        return method.invoke(trainStation, args);
                    }
                }
        );
        return sellTickets;
    }
}
