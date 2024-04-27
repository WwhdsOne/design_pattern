package Wwh_Spring.framework.context;

import Wwh_Spring.framework.beans.factory.BeanFactory;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/27 下午6:28
 * @description IOC容器的顶层接口，非延时加载
 **/
public interface ApplicationContext extends BeanFactory {

    void refresh() throws Exception;
}
