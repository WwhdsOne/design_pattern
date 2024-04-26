package 行为型模式.迭代器模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/26 下午9:02
 * @description TODO
 **/
public class StudentAggregateImpl implements StudentAggregate{

    private final List<Student> list = new ArrayList<>();  // 学生列表
    @Override
    public void addStudent(Student student) {
        list.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        list.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}
