package hw37.spring_core_context.football;


import org.springframework.stereotype.Component;

@Component(value = "liverpool")
public class Liverpool implements FootballMatch{
    public String startMatch() {
        return "Liverpool cant play in CL, hahahah";
    }

    public String endPlaying() {
        return "Liverpool has lost even in EL";
    }
}
