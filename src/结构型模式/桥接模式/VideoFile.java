package 结构型模式.桥接模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/24 下午7:52
 * @description 视频文件（抽象化角色）
 **/
public interface VideoFile {
    //解码
    void decode(String fileName);
}
