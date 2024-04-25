package 结构型模式.组合模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/25 上午9:36
 * @description 菜单项类（树叶节点）
 **/
public class MenuItem extends MenuComponent {

    public MenuItem(String name, int level) {
        this.name = name;
        this.level = level;
    }
    @Override
    public void print() {
        for (int i = 1; i < level; i++) {
            System.out.print("--");
        }
        System.out.println("菜单项名称：" + name);
    }
}
