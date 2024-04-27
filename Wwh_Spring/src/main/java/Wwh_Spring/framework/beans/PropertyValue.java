package Wwh_Spring.framework.beans;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/27 下午5:39
 * @description 用来封装bean标签下的property标签的信息
 * name:属性名 value:属性值 ref:引用
 **/
public class PropertyValue {
    private String name;
    private String value;
    private String ref;

    public PropertyValue() {
    }

    public PropertyValue(String value, String name,String ref) {
        this.value = value;
        this.name = name;
        this.ref = ref;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }
}
