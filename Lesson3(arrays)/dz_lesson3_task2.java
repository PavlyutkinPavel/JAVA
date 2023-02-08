import java.util.Random;
import java.util.Scanner;

public class dz_lesson3_task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nInput a length of ur array: ");
        int arrLength = in.nextInt();
        int array[]=new int[arrLength];
        int max=array[0],min=array[0];
        double avg=0,sum=0;
        for(int i = 0; i<arrLength;i++){
            array[i] = (int) Math.round((Math.random() * 30)-15);
            System.out.println(array[i]);
            sum+=array[i];
        }
        for(int i = 1;i<array.length;i++){
            if(array[i]<min){
                min = array[i];
            }
            if(array[i]>max){
                max = array[i];
            }

        }
        avg=sum/arrLength;
        System.out.println("Max element of mas = "+max);
        System.out.println("Min element of mas = "+min);
        System.out.println("Average element of mas = "+avg);

        in.close();
    }
}
