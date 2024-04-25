package 结构型模式.组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/25 上午9:33
 * @description 菜单（树枝节点）
 **/
public class Menu extends MenuComponent{

    //菜单的名称
    private final List<MenuComponent> menuComponentList = new ArrayList<>();

    public Menu(String name, int level) {
        this.name = name;
        this.level = level;
    }
    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }
    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponentList.get(index);
    }


    @Override
    public void print() {
        //打印菜单名称
        for (int i = 1; i < level; i++) {
            System.out.print("--");
        }
        System.out.println("菜单名称：" + name);
        //打印子菜单或者子菜单项的名称
        for (MenuComponent menuComponent : menuComponentList) {
            menuComponent.print();
        }
    }
}
