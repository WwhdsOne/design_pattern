package 行为型模式.中介者模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/26 下午8:40
 * @description 具体中介者类
 **/
public class MediatorStructure implements Mediator {

    private HouseOwner houseOwner;

    private Tenant tenant;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public void contract(String message, Person person) {
        if(person instanceof HouseOwner) {
            tenant.getMessage(message);
        } else{
            houseOwner.getMessage(message);
        }
    }
}
