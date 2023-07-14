package hw_36_javaEE_patterns.frontController;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet("/")
public class FrontController extends HttpServlet {

    ChampionsLeagueController championsLeagueController = new ChampionsLeagueController();
    FansProLeagueController fansProLeagueController = new FansProLeagueController();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getRequestURI();
        checkIfEliteTournament(path);
        loggingUrl(path);
        dispatcher(path, "POST", req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getRequestURI();
        checkIfEliteTournament(path);
        loggingUrl(path);
        dispatcher(path, "GET", req, resp);

    }
    void checkIfEliteTournament(String uri){
        if(uri.startsWith("get")){
            System.out.println("ChampionsLeagueController:");
        }
    }
    void loggingUrl(String uri){
        System.out.println(LocalDateTime.now() + uri);
    }
    public void dispatcher(String path, String method, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        if("GET".equals(method)){
            switch (path){
                case "/getAllManagers" -> championsLeagueController.getAllManagers(req, resp);
                case "/getAllMatches" -> championsLeagueController.getAllMatches(req, resp);
                case "/updateSchedule" -> fansProLeagueController.getNewSchedule(req, resp);
            }
        }
        if("POST".equals(method)){
            switch (path){
                case "/createMatch" -> fansProLeagueController.createMatch(req, resp);
                case "/deleteMatch" -> fansProLeagueController.deleteMatch(req, resp);
            }
        }
    }
}
