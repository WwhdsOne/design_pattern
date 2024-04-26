package 行为型模式.备忘录模式.黑箱备忘录模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/26 下午10:02
 * @description 角色状态管理者
 **/
public class RoleStateCaretaker {
    private Memento roleStateMemento;

    public Memento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(Memento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
