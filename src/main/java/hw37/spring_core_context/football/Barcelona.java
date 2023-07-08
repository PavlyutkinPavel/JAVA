package hw37.spring_core_context.football;

import org.springframework.stereotype.Component;


@Component(value = "barcelona")
public class Barcelona implements FootballMatch{
    public String endPlaying() {
        return "Barcelona has finished playing in CL(lost)";
    }

    public String startMatch() {
        return "Barcelona has started playing in CL";

    }
}
