package hw37.spring_core_context;

import hw37.spring_core_context.football.ChampionsLeague;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan("hw37")
public class SpringTest {
    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("spring-settings.html");
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringTest.class);

        ChampionsLeague championsLeague = context.getBean("championsLeague", ChampionsLeague.class);
        championsLeague.groupStage();
        championsLeague.knockOutStage();

        ((ConfigurableApplicationContext) context).close();
    }
}
