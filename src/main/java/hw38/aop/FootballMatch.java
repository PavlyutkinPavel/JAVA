package hw38.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component()
@Scope("prototype")
public class FootballMatch {
    private String homeTeam;
    private String awayTeam;

    public FootballMatch(String hTeam, String awTeam) {
        this.homeTeam = hTeam;
        this.awayTeam = awTeam;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }
}
