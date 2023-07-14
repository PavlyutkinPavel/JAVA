package hw_36_javaEE_patterns.frontController;

import hw_36_javaEE_patterns.sessionFacade.ChampionsLeagueService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class ChampionsLeagueController {
    private ChampionsLeagueService championsLeagueService;
    public  void getAllManagers(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        ArrayList<String> allManagers = championsLeagueService.getAllManagers(req);
        Writer writer = resp.getWriter();
        writer.write("Managers: Pep Gvardiola, Gose Mourinho, Alex Ferguson, Luis Enrique");
    }
    public  void getAllMatches(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        ArrayList<String> allMatches = championsLeagueService.getAllMatches(req);
        Writer writer = resp.getWriter();
        writer.write("Matches: \nReal:Barcelona, Man United: PSG");
    }
}
