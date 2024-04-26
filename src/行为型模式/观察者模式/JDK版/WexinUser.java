package 行为型模式.观察者模式.JDK版;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/26 下午8:06
 * @description 微信用户
 **/
public class WexinUser implements Observer {
    private String name;

    public WexinUser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("用户" + name + "收到了消息：" + arg);
    }
}
