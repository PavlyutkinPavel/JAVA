package hw38.aop;

import hw38.aop.annotations.FootballAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class FootballMatchService {
    private FootballMatch footballMatch;
    public void createMatch(FootballMatch match) {
        this.footballMatch = match;
        System.out.println("Creating football match: " + match.getHomeTeam() + " vs " + match.getAwayTeam());
    }

    @FootballAnnotation
    public void deleteMatch(FootballMatch match) {
        System.out.println("Deleting football match: " + match.getHomeTeam() + " vs " + match.getAwayTeam());
    }
}
