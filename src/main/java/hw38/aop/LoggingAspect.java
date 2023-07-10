package hw38.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* hw38.aop.*.*(..))")
    public void messageBeforeAllChanges() {
        System.out.println("____________________________________________");
        System.out.println("Wait, UEFA makes changes in the schedule...");
        System.out.println("____________________________________________");
    }
    @After(value = "@annotation(hw38.aop.annotations.FootballAnnotation)")
    public void deleteNotification(){
        System.out.println("*********************************************");
        System.out.println("!Users, notice that match above was declined!");
        System.out.println("*********************************************");
    }
}