package 行为型模式.观察者模式.自制版;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/26 下午7:51
 * @description 具体主题类
 **/
public class SubscriptionSubject implements Subject {
    //储存订阅公众号的微信用户
    private List<Observer> weixinUserlist = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        weixinUserlist.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weixinUserlist.remove(observer);
    }

    @Override
    public void notify(String message) {
        for ( Observer observer : weixinUserlist) {
            observer.update(message);
        }
    }
}
