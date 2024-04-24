package 结构型模式.桥接模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/24 下午7:55
 * @description OperatingSystem
 **/
public abstract class OperatingSystem {
    //声明VideoFile对象
    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
