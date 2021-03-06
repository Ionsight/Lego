package PresentationLayer;

import FunctionLayer.LoginException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * The purpose of UnknownCommand is to...
 *
 * @author kasper
 */
public class UnknownCommandCommand extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginException {
        String msg = "Unknown command. Contact IT";
        throw new LoginException(msg);
    }

}
