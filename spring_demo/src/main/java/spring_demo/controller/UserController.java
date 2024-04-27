package spring_demo.controller;

import Wwh_Spring.framework.context.ApplicationContext;
import Wwh_Spring.framework.context.support.ClassPathXmlApplicationContext;

import spring_demo.service.UserService;


/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/27 下午4:39
 * @description 控制层
 **/
public class UserController {
    private UserService userService;

    public static void main(String[] args) throws Exception {
        //1. 创建Spring容器对象

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        //2. 从Spring容器中获取指定名称的bean对象
        UserService userService = applicationContext.getBean("UserService", UserService.class);
        //UserService userService = beanFactory.getBean("UserService", UserService.class);
        //3. 调用方法
        userService.add();
    }
}
