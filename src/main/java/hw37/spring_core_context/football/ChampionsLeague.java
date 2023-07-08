package hw37.spring_core_context.football;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ChampionsLeague {
    public Barcelona barcelona;
    private FootballMatch match1;
    private FootballMatch match2;

    //IoC+DI
    @Autowired
    public ChampionsLeague(@Qualifier("barcelona") FootballMatch match1, @Qualifier("liverpool") FootballMatch match2) {
        this.match1 = match1;
        this.match2 = match2;
    }

    public void groupStage(){
        System.out.println("GroupStage: " + match1.startMatch());
        System.out.println("GroupStage: " + match2.startMatch());
    }

    public void knockOutStage(){
        System.out.println("Terrible news: " + match1.endPlaying());
        System.out.println("Terrible news: " + match2.endPlaying());
    }

}
