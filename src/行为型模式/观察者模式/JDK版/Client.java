package 行为型模式.观察者模式.JDK版;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/26 下午8:12
 * @description Client
 **/
public class Client {
    public static void main(String[] args) {
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();
        WexinUser wexinUser = new WexinUser("张三");
        WexinUser wexinUser1 = new WexinUser("李四");
        WexinUser wexinUser2 = new WexinUser("王五");
        subscriptionSubject.addObserver(wexinUser);
        subscriptionSubject.addObserver(wexinUser1);
        subscriptionSubject.addObserver(wexinUser2);
        subscriptionSubject.notifyObservers("微信公众号更新了");

    }
}
