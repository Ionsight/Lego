/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import FunctionLayer.OrderBuilder;
import FunctionLayer.LogicFacade;
import FunctionLayer.LoginException;
import FunctionLayer.OrderException;
import FunctionLayer.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Dradrach
 */
public class OrderCommand extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginException, OrderException {
        int height = Integer.parseInt(request.getParameter("height"));
        int width = Integer.parseInt(request.getParameter("width"));
        int length = Integer.parseInt(request.getParameter("length"));
       
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        
        OrderBuilder house = LogicFacade.createOrderBuilder(height, width, length);
        LogicFacade.createOrder(house, user);
        //do something with generated house?
        return "orderconfirmation"; // + id from order
    }
    
}
