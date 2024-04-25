package 行为型模式.责任链模式;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/25 下午2:59
 * @description 请假申请
 **/
public class LeaveRequest {
    private String name;
    private int days;
    private String content;

    public LeaveRequest(String name, int days, String content) {
        this.name = name;
        this.days = days;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
