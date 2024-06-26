package Wwh_Spring.framework.beans.factory.support;

import Wwh_Spring.framework.beans.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/27 下午6:06
 * @description 用来封装bean标签的信息
 **/
public class SimpleBeanDefinitionRegistry implements BeanDefinitionRegistry {
    //定义一个容器，用来存放BeanDefinition对象
    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.merge(beanName, beanDefinition, (oldValue, newValue) -> newValue);
    }

    @Override
    public void removeBeanDefinition(String beanName) throws Exception {
        beanDefinitionMap.remove(beanName);
    }

    @Override
    public BeanDefinition getBeanDefinition(String beanName) throws Exception {
        return beanDefinitionMap.get(beanName);
    }

    @Override
    public boolean containsBeanDefinition(String beanName) {
        return beanDefinitionMap.containsKey(beanName);
    }

    @Override
    public int getBeanDefinitionCount() {
        return beanDefinitionMap.size();
    }

    @Override
    public String[] getBeanDefinitionNames() {
        return beanDefinitionMap.keySet().toArray(new String[0]);
    }
}
