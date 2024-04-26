package 行为型模式.观察者模式.自制版;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/26 下午7:50
 * @description 抽象观察者角色类
 **/
public interface Observer {
    /**
     * 更新方法
     * @param message
     */
    void update(String message);
}
