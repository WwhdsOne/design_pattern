package principles.依赖倒转原则.after;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/21 下午5:54
 * @description 硬盘接口
 **/
public interface 硬盘{
    //存储数据
    void save(String data);

    //读取数据
    String get();

}
