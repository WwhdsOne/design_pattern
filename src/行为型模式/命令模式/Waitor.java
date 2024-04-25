package 行为型模式.命令模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/25 下午12:36
 * @description 服务员
 **/
public class Waitor {
    private List<Command> commands;

    public Waitor() {
        commands = new ArrayList<>();
    }

    public void setOrder(Command command) {
        commands.add(command);
    }

    public void orderUp() {
        System.out.println("美女服务员：叮咚，大厨，新订单来了.......");
        for (int i = 0; i < commands.size(); i++) {
            Command cmd = commands.get(i);
            if (cmd != null) {
                cmd.execute();
            }
            commands.remove(i);
        }
    }
}
