package 结构型模式.外观模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/24 下午8:09
 * @description 外观类
 **/
public class SimpleFacade {
    private Light light;
    private TV tv;
    private Computer computer;

    public SimpleFacade() {
        this.light = new Light();
        this.tv = new TV();
        this.computer = new Computer();
    }

    public void say(String message) {
        if ( "on".equals(message) ) {
            on();
        } else if ( "off".equals(message) ) {
            off();
        } else {
            System.out.println("无法识别的指令");
        }
    }

    private void on() {
        light.on();
        tv.on();
        computer.on();
    }

    private void off() {
        light.off();
        tv.off();
        computer.off();
    }
}
