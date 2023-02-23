import java.util.Scanner;

public class dz_lesson5_task1 {
    public static void main(String[] args) {
        Computer comp = new Computer("Intel", 32, 500, 10);
        comp.printInfo();
        System.out.println("Do u want to turn on ur computer? If yes enter \"1\"");
        Scanner in = new Scanner(System.in);
        int on = in.nextInt();
        if (on == 1) {
            comp.computerOn();
            System.out.println("Do u want to turn off ur computer? If yes enter \"0\"");
            int off = in.nextInt();
            if (off == 0) {
                comp.computerOff();
            }
        }


    }
}
