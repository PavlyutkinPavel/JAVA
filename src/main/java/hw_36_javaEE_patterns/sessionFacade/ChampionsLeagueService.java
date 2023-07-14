package hw_36_javaEE_patterns.sessionFacade;

import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.util.ArrayList;

public class ChampionsLeagueService {
    public ArrayList<String> getAllManagers(HttpServletRequest req) throws IOException {
        return new ArrayList<>();
    }
    public ArrayList<String> getAllMatches(HttpServletRequest req) throws IOException {
        return new ArrayList<>();
    }
}
