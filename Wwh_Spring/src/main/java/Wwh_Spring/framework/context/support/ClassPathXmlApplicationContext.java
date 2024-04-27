package Wwh_Spring.framework.context.support;

import Wwh_Spring.framework.beans.BeanDefinition;
import Wwh_Spring.framework.beans.MutablePropertyValues;
import Wwh_Spring.framework.beans.PropertyValue;
import Wwh_Spring.framework.beans.factory.support.XmlBeanDefinitionReader;
import Wwh_Spring.framework.utils.StringUtils;

import java.lang.reflect.Method;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/27 下午6:40
 * @description IOC容器具体子实现类，用于立即加载XML配置文件
 **/
public class ClassPathXmlApplicationContext extends AbstractApplicationContext {

    public ClassPathXmlApplicationContext(String configLocation) {
        this.configLocation = configLocation;
        this.reader = new XmlBeanDefinitionReader();
        try {
            refresh();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //根据beanName获取bean
    @Override
    public Object getBean(String beanName) throws Exception {
        boolean b = singletonObjects.containsKey(beanName);
        if ( b ) {
            return singletonObjects.get(beanName);
        }
        //获取BeanDefinition对象
        BeanDefinition beanDefinition = reader.getRegistry().getBeanDefinition(beanName);
        //获取类名
        String className = beanDefinition.getClassName();
        //通过反射创建对象
        Object bean = Class.forName(className).newInstance();
        //进行依赖注入
        MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
        //遍历属性集合
        for ( PropertyValue propertyValue : propertyValues ) {
            //获取属性名称
            String name = propertyValue.getName();
            //获取ref属性值
            Object ref = propertyValue.getRef();
            //获取value属性值
            Object value = propertyValue.getValue();
            //判断是否有ref属性值
            if ( ref != null && ref != "" ) {
                //递归调用getBean方法
                Object bean1 = getBean(name);
                //获取setter方法名
                String setterMethodName = StringUtils.getSetterMethodName(name);
                //获取方法对象
                Method[] methods = bean.getClass().getMethods();
                for ( Method method : methods ) {
                    if ( method.getName().equals(setterMethodName) ) {
                        //调用setter方法
                        method.invoke(bean, bean1);
                    }
                }
            }
            //判断是否有value属性值
            if ( value != null && value != "" ) {
                //获取setter方法名
                String setterMethodName = StringUtils.getSetterMethodName(name);
                //获取方法对象
                Method[] methods = bean.getClass().getMethods();
                for ( Method method : methods ) {
                    if ( method.getName().equals(setterMethodName) ) {
                        //调用setter方法
                        method.invoke(bean, value);
                    }
                }
            }
        }
        //将对象存入Map容器
        singletonObjects.put(beanName, bean);
        return bean;
    }

    @Override
    public <T> T getBean(String beanName, Class<? extends T> clazz) throws Exception {
        Object bean = getBean(beanName);
        if ( bean == null ) {
            return null;
        }
        return clazz.cast(bean);
    }
}
