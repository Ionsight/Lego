package FunctionLayer;

import DBAccess.OrderMapper;
import DBAccess.UserMapper;
import java.util.List;

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

    public static void createOrder(House house, User user) throws OrderException {
        OrderMapper.createOrder(house, user);
    }
    
    public static void createOrder(House house, int userid) throws OrderException {
        OrderMapper.createOrder(house, userid);
    }
    
    public static House createHouse(int height, int width, int length){
        return new House(height, width, length);
    }

    public static List getOrders(User user) throws OrderException {
        return OrderMapper.getOrders(user);
    }
}
