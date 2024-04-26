package 行为型模式.迭代器模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/26 下午8:58
 * @description 学生类迭代器接口
 **/
public interface StudentIterator {
    //判断是否有下一个元素
    boolean hasNext();
    //获取下个元素
    Student next();

}
