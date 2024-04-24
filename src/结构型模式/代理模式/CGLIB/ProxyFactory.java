package 结构型模式.代理模式.CGLIB;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/24 下午12:46
 * @description 代理对象工厂
 **/
public class ProxyFactory implements MethodInterceptor {

    private TrainStation target = new TrainStation();

    public TrainStation getProxyObject() {
        //创建Enhancer对象，类似于JDK动态代理的Proxy类，下一步就是设置几个参数
        Enhancer enhancer = new Enhancer();
        //设置父类的字节码对象
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建代理对象
        TrainStation obj = (TrainStation) enhancer.create();
        return obj;
    }

    /*
        Object o：这是代理对象本身，也就是你通过enhancer.create()方法创建的对象。
        Method method：这是被调用的方法的java.lang.reflect.Method实例。你可以通过这个对象获取方法的名称、参数类型等信息。
        Object[] args：这是调用方法时传递的参数。这是一个对象数组，你可以通过它获取或修改实际的参数值。
        MethodProxy methodProxy：这是代理方法的net.sf.cglib.proxy.MethodProxy实例。
                        你可以通过这个对象调用invokeSuper方法来调用被代理对象的原始方法。这个方法的调用不会再次触发方法拦截，所以不会导致无限循环。
     */
    public TrainStation intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理点收取一些服务费用(CGLIB动态代理方式)");
        TrainStation result = (TrainStation) methodProxy.invokeSuper(o, args);
        return result;
    }
}
