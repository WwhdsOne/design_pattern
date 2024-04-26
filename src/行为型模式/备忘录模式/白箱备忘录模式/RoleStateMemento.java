package 行为型模式.备忘录模式.白箱备忘录模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/26 下午10:01
 * @description 角色状态存储箱
 **/
public class RoleStateMemento {
    private int vit; //生命力
    private int atk; //攻击力
    private int def; //防御力

    public RoleStateMemento(int vit, int atk, int def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
