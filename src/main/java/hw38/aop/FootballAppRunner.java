package hw38.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("hw38.aop")
@EnableAspectJAutoProxy
public class FootballAppRunner {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(FootballAppRunner.class);
        FootballMatchService matchService = context.getBean("footballMatchService", FootballMatchService.class);


        FootballMatch match1 = new FootballMatch("FC Barcelona", "Real Madrid FC");
        FootballMatch match2 = new FootballMatch("Man United", "Man City");

        matchService.createMatch(match1);
        matchService.createMatch(match2);

        matchService.deleteMatch(match2);

        ((ConfigurableApplicationContext) context).close();
    }
}
