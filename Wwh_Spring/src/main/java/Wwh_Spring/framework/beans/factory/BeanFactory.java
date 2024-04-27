package Wwh_Spring.framework.beans.factory;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/27 下午6:24
 * @description IOC容器父接口
 **/
public interface BeanFactory {
    Object getBean(String beanName) throws Exception;

    <T> T getBean(String beanName, Class<? extends T> clazz) throws Exception;
}
