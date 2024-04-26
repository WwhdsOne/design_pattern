package 行为型模式.观察者模式.自制版;


/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/26 下午7:49
 * @description 抽象主题类
 **/
public interface Subject {
    /**
     * 添加观察者
     * @param observer
     */
    void attach(Observer observer);

    /**
     * 删除观察者
     * @param observer
     */
    void detach(Observer observer);

    /**
     * 通知观察者
     */
    void notify(String message);
}
