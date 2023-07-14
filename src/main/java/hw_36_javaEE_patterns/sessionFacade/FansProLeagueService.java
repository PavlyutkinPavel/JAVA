package hw_36_javaEE_patterns.sessionFacade;

import com.classes.User;
import hw_36_javaEE_patterns.frontController.Match;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

public class FansProLeagueService {
    public  String getNewSchedule(HttpServletRequest req) throws IOException {
        return new String();
    }

    public boolean deleteMatch(HttpServletRequest req) throws IOException {
        //logic...
        return false;
    }
    public Match createMatch(HttpServletRequest req) throws IOException {
        //logic...
        return  new Match("FC FIFERS","FC MINSK", "dinamo uni");
    }
}
