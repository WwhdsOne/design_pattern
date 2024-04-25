package 结构型模式.享元模式;

import java.util.HashMap;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/25 上午10:59
 * @description 工厂类，将该类设计为单例
 **/
public class BoxFactory {
    private HashMap<String,AbstractBox> map;

    private BoxFactory(){
        map = new HashMap<>();
        map.put("IBOX",new IBox());
        map.put("OBOX",new OBox());
        map.put("LBOX",new LBox());
    }

    //根据类型获取图形
    public static BoxFactory getInstance(){
        return boxFactory;
    }

    private static final BoxFactory boxFactory = new BoxFactory();
    public AbstractBox getShape(String type){
        return map.get(type);
    }
}
