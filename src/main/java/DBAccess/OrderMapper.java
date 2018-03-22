/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBAccess;

import FunctionLayer.House;
import FunctionLayer.OrderException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Dradrach
 */
public class OrderMapper {

    public static void createOrder(House house) throws OrderException { //User user or int userid?
        try {
            Connection con = Connector.connection();
             
            String SQL = "INSERT INTO `useradmin`.`orders` (`users_id`, `height`, `width`, `length`) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            
            //ps.setInt(1, user.getId); Get from user in session
            ps.setInt(2, house.getHeight());
            ps.setInt(3, house.getLength());
            ps.setInt(4, house.getWidth());
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            //Maybe do something with generated keys, or remove generated keys entirely
            
        } catch (SQLException | ClassNotFoundException ex) {
            throw new OrderException(ex.getMessage());
        }
    }
}
