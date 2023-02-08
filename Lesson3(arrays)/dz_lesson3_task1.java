import java.util.Random;
import java.util.Scanner;

public class dz_lesson3_task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nInput a length of ur array: ");
        int arrLength = in.nextInt();
        int array[]=new int[arrLength];
        int arrayCopy[]=new int[arrLength];
        Random r = new Random();
        for(int i = 0; i<arrLength;i++){
            array[i]=r.nextInt(-100,100);
            arrayCopy[i]=r.nextInt();
            System.out.println(array[i]);
        }
        System.out.println("Enter number which u want to find in the array: ");
        int findNum = in.nextInt();
        boolean found = false;
        System.out.println("New array:");
        for(int i = 0; i<arrLength;i++){
            if(array[i]==findNum){
                found = true;

            }else{
                arrayCopy[i]=array[i];
                System.out.println(arrayCopy[i]);
            }
        }
        if(found==false){
            System.out.println(findNum+" isn't in ur array ");
        }
        in.close();
    }
}
