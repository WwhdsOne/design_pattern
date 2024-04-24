package 结构型模式.桥接模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/24 下午7:53
 * @description AVI文件（具体实现化角色）
 **/
public class AviFile implements VideoFile {
    @Override
    public void decode(String fileName) {
        System.out.println("avi文件：" + fileName);
    }
}
