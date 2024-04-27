package spring_demo.service.Impl;

import spring_demo.dao.UserDAO;
import spring_demo.service.UserService;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/27 下午4:38
 * @description TODO
 **/
public class UserServiceImpl implements UserService {
    private UserDAO userDAO;

    public UserServiceImpl() {
        System.out.println("UserServiceImpl被创建了");
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void add() {
        System.out.println("UserServiceImpl add()...");
        userDAO.add();
    }
}
