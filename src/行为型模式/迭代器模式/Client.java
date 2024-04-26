package 行为型模式.迭代器模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/26 下午9:04
 * @description Client
 **/
public class Client {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("张三");
        student1.setID("001");

        Student student2 = new Student();
        student2.setName("李四");
        student2.setID("002");

        Student student3 = new Student();
        student3.setName("王五");
        student3.setID("003");

        StudentAggregate studentAggregate = new StudentAggregateImpl();
        studentAggregate.addStudent(student1);
        studentAggregate.addStudent(student2);
        studentAggregate.addStudent(student3);

        StudentIterator studentIterator = studentAggregate.getStudentIterator();
        while ( studentIterator.hasNext() ) {
            System.out.println(studentIterator.next());
        }
    }
}
