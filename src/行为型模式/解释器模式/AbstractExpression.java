package 行为型模式.解释器模式;

//抽象角色AbstractExpression
public abstract class AbstractExpression {
    public abstract int interpret(Context context);
}
