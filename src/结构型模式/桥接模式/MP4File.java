package 结构型模式.桥接模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/24 下午7:54
 * @description MP4文件（具体实现化角色）
 **/
public class MP4File implements VideoFile {
    @Override
    public void decode(String fileName) {
        System.out.println("mp4文件：" + fileName);
    }
}
