package 结构型模式.组合模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/25 上午9:29
 * @description 菜单组件（抽象根节点）
 **/
public abstract class MenuComponent {
    //菜单组件的名称
    protected String name;
    //菜单组件的层级
    protected int level;

    //添加子菜单
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    //移除子菜单
    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    //获取指定的子菜单
    public MenuComponent getChild(int index){
        throw new UnsupportedOperationException();
    }

    //获取菜单组件的名称
    public String getName(){
        return name;
    }

    //打印菜单名称
    public abstract void print();

}
