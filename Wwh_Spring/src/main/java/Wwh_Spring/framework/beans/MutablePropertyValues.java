package Wwh_Spring.framework.beans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/27 下午5:41
 * @description 存储并管理多个property标签的信息
 **/
public class MutablePropertyValues implements Iterable<PropertyValue> {

    private final List<PropertyValue> propertyValueList;

    public MutablePropertyValues() {
        this.propertyValueList = new ArrayList<>();
    }

    public MutablePropertyValues(List<PropertyValue> propertyValueList) {
        this.propertyValueList = (propertyValueList != null ? propertyValueList : new ArrayList<>());
    }

    @Override
    public Iterator<PropertyValue> iterator() {
        return propertyValueList.iterator();
    }

    //获取所有的property标签信息
    public PropertyValue[] getPropertyValues() {
        return this.propertyValueList.toArray(new PropertyValue[0]);
    }

    //根据name属性值获取property标签信息
    public PropertyValue getPropertyValue(String propertyName) {
        return this.propertyValueList.stream()
                .filter(pv -> pv.getName().equals(propertyName))
                .findFirst()
                .orElse(null);
    }

    //判断集合是否为空
    public boolean isEmpty() {
        return this.propertyValueList.isEmpty();
    }

    //添加property标签信息
    public MutablePropertyValues addPropertyValue(PropertyValue pv) {
        for ( int i = 0; i < this.propertyValueList.size(); i++ ) {
            PropertyValue currentPv = this.propertyValueList.get(i);
            if ( currentPv.getName().equals(pv.getName()) ) {
                this.propertyValueList.set(i, pv);
                return this;
            }
        }
        this.propertyValueList.add(pv);
        return this; //返回当前对象，方便链式调用
    }

    //判断是否有指定的property标签信息
    public boolean contains(String propertyName) {
        return getPropertyValue(propertyName) != null;
    }
}
