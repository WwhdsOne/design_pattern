package 结构型模式.桥接模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/24 下午7:57
 * @description Mac(扩展抽象化角色)
 **/
public class Mac extends OperatingSystem{
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
