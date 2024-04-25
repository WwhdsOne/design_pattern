package 结构型模式.享元模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/25 上午11:03
 * @description Client
 **/
public class Client {
    public static void main(String[] args) {
        BoxFactory boxFactory = BoxFactory.getInstance();
        AbstractBox box = boxFactory.getShape("IBOX");
        box.display("red");
        AbstractBox box1 = boxFactory.getShape("IBOX");
        box1.display("blue");
        AbstractBox box2 = boxFactory.getShape("OBOX");
        box2.display("yellow");
        AbstractBox box3 = boxFactory.getShape("LBOX");
        box3.display("green");
        System.out.println(box == box1);
    }
}
