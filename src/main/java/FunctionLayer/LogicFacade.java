package FunctionLayer;

import DBAccess.OrderMapper;
import DBAccess.UserMapper;

/**
 * The purpose of LogicFacade is to...
 *
 * @author kasper
 */
public class LogicFacade {

    public static User login(String email, String password) throws LoginException {
        return UserMapper.login(email, password);
    }

    public static User createUser(String email, String password) throws LoginException {
        User user = new User(email, password, "customer");
        UserMapper.createUser(user);
        return user;
    }

    public static void createOrder(House house) {
        OrderMapper.createOrder(house);
    }
}
