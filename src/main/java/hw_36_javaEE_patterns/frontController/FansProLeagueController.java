package hw_36_javaEE_patterns.frontController;

import com.classes.User;
import hw_36_javaEE_patterns.sessionFacade.FansProLeagueService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Writer;

public class FansProLeagueController {
    private FansProLeagueService fansProLeagueService;
    public  void getNewSchedule(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String newSchedule = fansProLeagueService.getNewSchedule(req);
        Writer writer = resp.getWriter();
        writer.write("Updated matches: \nFC Dvor:FC BUMP ");
    }

    public boolean deleteMatch(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //logic...
        boolean result = fansProLeagueService.deleteMatch(req);
        Writer writer = resp.getWriter();
        writer.write(result ? "We deleted match!" : "We didnt delete match!");
        //jsp form...
        return false;
    }
    public void createMatch(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //logic...
        Match match = fansProLeagueService.createMatch(req);
        Writer writer = resp.getWriter();
        if(match!=null){
            writer.write("We created match!");
        }else{
            writer.write("We didnt create match!");
        }
        //jsp form...
    }
}
