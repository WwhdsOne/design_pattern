package spring_demo.dao.impl;

import spring_demo.dao.UserDAO;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/27 下午4:36
 * @description 数据访问层实现类
 **/
public class UserDAOImpl implements UserDAO {

    private String name;

    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDAOImpl{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public UserDAOImpl() {
        System.out.println("UserDAOImpl被创建了");
    }

    @Override
    public void add() {
        System.out.println("UserDAOImpl add()...");
        System.out.println(this);
    }
}
