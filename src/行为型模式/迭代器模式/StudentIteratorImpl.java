package 行为型模式.迭代器模式;

import java.util.List;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/26 下午8:59
 * @description 学生类迭代器实现类
 **/
public class StudentIteratorImpl implements StudentIterator{

    private List<Student> students;

    private int position = 0; //记录当前位置

    public StudentIteratorImpl(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean hasNext() {
        return position < students.size();
    }

    @Override
    public Student next() {
        return students.get(position++);
    }
}
