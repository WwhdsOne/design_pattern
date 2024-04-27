package Wwh_Spring.framework.beans.factory.support;

import Wwh_Spring.framework.beans.BeanDefinition;
import Wwh_Spring.framework.beans.PropertyValue;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import javax.xml.parsers.SAXParser;
import java.io.InputStream;
import java.util.List;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/27 下午6:14
 * @description 用来读取xml配置文件
 **/
public class XmlBeanDefinitionReader implements BeanDefinitionReader{

    //获取注册表对象
    private BeanDefinitionRegistry beanDefinitionRegistry;

    public XmlBeanDefinitionReader() {
        this.beanDefinitionRegistry = new SimpleBeanDefinitionRegistry();
    }
    @Override
    public BeanDefinitionRegistry getRegistry() {
        return beanDefinitionRegistry;
    }

    @Override
    public void loadBeanDefinitions(String configLocation) throws Exception {
        //1.加载配置文件
        SAXReader saxReader = new SAXReader();
        //获取类路径下的配置文件
        InputStream resourceAsStream =
                XmlBeanDefinitionReader.class.getClassLoader().getResourceAsStream(configLocation);
        Document document = saxReader.read(resourceAsStream);
        Element rootElement = document.getRootElement();
        //2.解析配置文件
        //获取根标签下的bean标签对象
        List<Element> beans = rootElement.elements("bean");
        //遍历bean标签
        for (Element bean : beans) {
            //获取bean标签的id属性值
            String id = bean.attributeValue("id");
            //获取bean标签的class属性值
            String className = bean.attributeValue("class");
            //创建BeanDefinition对象
            BeanDefinition beanDefinition = new BeanDefinition();
            beanDefinition.setId(id);
            beanDefinition.setClassName(className);
            //获取bean标签下的property标签
            List<Element> properties = bean.elements("property");
            //遍历property标签
            for (Element property : properties) {
                //获取property标签的name属性值
                String name = property.attributeValue("name");
                //获取property标签的value属性值
                String value = property.attributeValue("value");
                //获取property标签的ref属性值
                String ref = property.attributeValue("ref");
                //创建PropertyValue对象
                PropertyValue propertyValue = new PropertyValue(value, name, ref);
                //3.将PropertyValue对象封装到BeanDefinition对象中
                beanDefinition.getPropertyValues().addPropertyValue(propertyValue);
            }
            //4.将BeanDefinition对象注册到注册表中
            beanDefinitionRegistry.registerBeanDefinition(id,beanDefinition);
        }
    }
}
