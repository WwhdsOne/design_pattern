package principles.依赖倒转原则.before;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/21 下午5:44
 * @description 希捷硬盘
 **/
public class 希捷硬盘 {

    //存储数据
    public void save(String data){
        System.out.println("使用希捷硬盘存储数据："+data);
    }

    //读取数据
    public String get(){
        System.out.println("使用希捷硬盘读取数据");
        return "数据";
    }

}
