package Wwh_Spring.framework.context.support;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/27 下午6:31
 * @description ApplicationContext的抽象实现，用于立即加载
 **/

import Wwh_Spring.framework.beans.BeanDefinition;
import Wwh_Spring.framework.beans.factory.support.BeanDefinitionReader;
import Wwh_Spring.framework.beans.factory.support.BeanDefinitionRegistry;
import Wwh_Spring.framework.context.ApplicationContext;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractApplicationContext implements ApplicationContext{
    //声明解析器
    protected BeanDefinitionReader reader;

    //定义用于存储bean的Map容器
    protected Map<String,Object> singletonObjects = new HashMap<>();

    //声明配置文件路径
    protected String configLocation;

    @Override
    public void refresh() throws Exception {
        //1.加载配置文件
        reader.loadBeanDefinitions(configLocation);
        //2.注册bean
        finishBeanInitialization();
    }

    private void finishBeanInitialization() throws Exception {
        BeanDefinitionRegistry registry = reader.getRegistry();
        String[] beanNames = registry.getBeanDefinitionNames();

        for (String beanName : beanNames) {
            getBean(beanName);
        }
    }
}
