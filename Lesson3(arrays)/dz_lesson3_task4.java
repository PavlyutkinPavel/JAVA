import java.util.Random;
import java.util.Scanner;

public class dz_lesson3_task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nInput a length of ur array(5;10]: ");
        int arrLength = in.nextInt();
        while(arrLength<6 || arrLength>=11){
            System.out.println("Invalid input!Try again");
            System.out.print("\nInput a length of ur array(5;10]: ");
            arrLength = in.nextInt();
        }
        int array[]=new int[arrLength];
        int arrayCopy[]=new int[10];
        Random r = new Random();
        System.out.println("Arr1: ");
        for(int i = 0; i<arrLength;i++){
            array[i]=r.nextInt(-100,100);
            System.out.println(array[i]);
        }
        boolean found = false;
        System.out.println("New array:");
        for(int i = 0; i<arrLength;i++){
            if(array[i]%2==0){
                arrayCopy[i]=array[i];
                System.out.println(arrayCopy[i]);
                found=true;
            }
        }
        if(found==false){
            System.out.println("The aren't any even number in ur array ");
        }

        in.close();

    }
}
