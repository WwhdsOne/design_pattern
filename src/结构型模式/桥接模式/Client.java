package 结构型模式.桥接模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/24 下午7:57
 * @description 测试类
 **/
public class Client {
    public static void main(String[] args) {
        VideoFile videoFile = new AviFile();
        OperatingSystem windows = new Windows(videoFile);
        windows.play("流浪地球2");

    }
}
