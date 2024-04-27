package Wwh_Spring.framework.utils;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/27 下午6:58
 * @description 字符串工具类
 **/
public class StringUtils {
    private StringUtils() {
    }

    public static String getSetterMethodName(String fieldName) {
        return "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
    }
}
