package 行为型模式.备忘录模式.黑箱备忘录模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/26 下午10:03
 * @description Client
 **/
public class Client {
    public static void main(String[] args) {
        GameRole gameRole = new GameRole();

        System.out.println("初始状态");
        gameRole.initState();
        gameRole.stateDisplay();

        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setRoleStateMemento(gameRole.saveState());

        System.out.println("战斗后状态");

        gameRole.fight();
        gameRole.stateDisplay();

        System.out.println("恢复后状态");

        gameRole.recoverState(roleStateCaretaker.getRoleStateMemento());
        gameRole.stateDisplay();
    }
}
