package 结构型模式.组合模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/25 上午9:37
 * @description Client
 **/
public class Client {
    public static void main(String[] args) {
        //创建子菜单
        MenuComponent menu1 = new Menu("菜单管理", 2);
        menu1.add(new MenuItem("页面访问",3));
        menu1.add(new MenuItem("展开菜单",3));
        menu1.add(new MenuItem("删除菜单",3));
        menu1.add(new MenuItem("新增菜单",3));
        menu1.add(new MenuItem("修改菜单",3));

        MenuComponent menu2 = new Menu("权限管理", 2);
        menu2.add(new MenuItem("页面访问",3));
        menu2.add(new MenuItem("提交保存",3));

        MenuComponent menu3 = new Menu("角色管理", 2);
        menu3.add(new MenuItem("页面访问",3));
        menu3.add(new MenuItem("新增角色",3));
        menu3.add(new MenuItem("修改角色",3));

        //创建主菜单
        MenuComponent root = new Menu("系统管理", 1);
        root.add(menu1);
        root.add(menu2);
        root.add(menu3);

        //打印菜单
        root.print();
    }
}
