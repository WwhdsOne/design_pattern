package 行为型模式.迭代器模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/26 下午9:02
 * @description 学生类聚合接口
 **/
public interface StudentAggregate {
    //添加学生
    void addStudent(Student student);
    //删除学生
    void removeStudent(Student student);
    //获取迭代器
    StudentIterator getStudentIterator();
}
