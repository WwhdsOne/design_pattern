package 创建者模式.工厂模式.模式扩展;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/23 下午12:40
 * @description 咖啡工厂类
 **/
public class CoffeeFactory {
    private static Map<String,Coffee> coffeeMap = new HashMap<>();

    static {
        //1. 读取配置
        Properties properties = new Properties();
        //2. 加载配置
        try {
            FileInputStream fis = new FileInputStream(
                    "D:\\Programming_Learning\\Project\\design_pattern\\src\\创建者模式\\工厂模式\\模式扩展\\bean.properties");
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            properties.load(isr);
            //3. 创建对象
            Set<Object> objects = properties.keySet();
            for (Object object : objects) {
                String key = (String) object;
                String value = properties.getProperty(key);
                Class clazz = Class.forName(value);
                clazz.getDeclaredConstructor().setAccessible(true);
                Coffee coffee = (Coffee) clazz.getDeclaredConstructor().newInstance();
                coffeeMap.put(key,coffee);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(coffeeMap);
    }

    public static Coffee createCoffee(String name){
        return coffeeMap.get(name);
    }
}
