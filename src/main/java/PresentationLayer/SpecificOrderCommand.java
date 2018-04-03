/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import FunctionLayer.Brick;
import FunctionLayer.LogicFacade;
import FunctionLayer.LoginException;
import FunctionLayer.Order;
import FunctionLayer.OrderException;
import FunctionLayer.User;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dradrach
 */
public class SpecificOrderCommand extends Command {

    public SpecificOrderCommand() {
    }

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginException, OrderException {
        int id = Integer.parseInt(request.getParameter("orderid"));
        User user = (User) request.getSession().getAttribute("user");
        int userid = user.getId();
        int height = Integer.parseInt(request.getParameter("height"));
        int width = Integer.parseInt(request.getParameter("width"));
        int length = Integer.parseInt(request.getParameter("length"));
        
        Order order = LogicFacade.createOrderObject(id, userid, height, width, length);
        List<Brick> bricks = LogicFacade.calculateBricks(order);
        request.setAttribute("bricks", bricks);
        
        return user.getRole() + "specificorder";
    }
    
}
