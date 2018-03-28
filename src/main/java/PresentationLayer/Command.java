package PresentationLayer;

import FunctionLayer.LoginException;
import FunctionLayer.OrderException;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

abstract class Command {

    private static HashMap<String, Command> commands;

    private static void initCommands() {
        commands = new HashMap<>();
        commands.put("login", new LoginCommand());
        commands.put("register", new RegisterCommand());
        commands.put("help", new HelpCommand());
        commands.put("order", new OrderCommand());
        commands.put("showorders", new AllOrdersCommand());
    }

    static Command from(HttpServletRequest request) {
        String commandName = request.getParameter("command");
        if (commands == null) {
            initCommands();
        }
        return commands.getOrDefault(commandName, new UnknownCommandCommand());
    }

    abstract String execute(HttpServletRequest request, HttpServletResponse response)
            throws LoginException, OrderException;

}
