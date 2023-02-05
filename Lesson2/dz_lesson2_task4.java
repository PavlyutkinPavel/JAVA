import java.util.Scanner;
public class dz_lesson2_task4 {
    static Scanner in = new Scanner(System.in);

    public static void main (String[] args){
        System.out.println("Enter a: ");
        int a = in.nextInt();
        System.out.println("Enter b: ");
        int b = in.nextInt();
        int c = 0;
        for(int i = 0;i<b;i++){
            c=c+a;
        }
        System.out.println("A*B = " + c);
    }
}