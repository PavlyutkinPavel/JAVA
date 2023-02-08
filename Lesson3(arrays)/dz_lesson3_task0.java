import java.util.Random;
import java.util.Scanner;

public class dz_lesson3_task0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nInput a length of ur array: ");
        int arrLength = in.nextInt();
        int array[]=new int[arrLength];
        Random r = new Random();
        for(int i = 0; i<arrLength;i++){
            //arr2[i] = (int) Math.round((Math.random() * 30)-15);
            array[i]=r.nextInt(-100,100);
            System.out.println(array[i]);
        }
        System.out.println("Enter number which u want to find in the array: ");
        int findNum = in.nextInt();
        boolean found = false;
        for(int i = 0; i<arrLength;i++){
            if(array[i]==findNum){
                System.out.println(findNum+" is in ur array");
                found = true;
            }
        }
        if(found==false){
            System.out.println(findNum+" isn't in ur array ");
        }
        in.close();

    }
}
