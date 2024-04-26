package 行为型模式.中介者模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/26 下午8:42
 * @description Client
 **/
public class Client {
    public static void main(String[] args) {
        MediatorStructure mediator = new MediatorStructure();
        Tenant tenant = new Tenant("张三", mediator);
        HouseOwner houseOwner = new HouseOwner("李四", mediator);
        mediator.setTenant(tenant);
        mediator.setHouseOwner(houseOwner);
        tenant.constact("我想租一套房子");
        houseOwner.constact("我有一套房子出租");
    }
}
