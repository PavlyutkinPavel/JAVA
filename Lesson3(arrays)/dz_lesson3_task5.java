import java.util.Random;
import java.util.Scanner;

public class dz_lesson3_task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nInput a length of ur array: ");
        int arrLength = in.nextInt();
        int arr[]=new int[arrLength];
        for(int i = 0; i<arrLength;i++){
            System.out.print("arr["+ i+"] = ");
            arr[i]=in.nextInt();
        }
        System.out.print("Your array : ");
        for(int i = 0;i<arrLength;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\nNew array : ");
        for(int i = 0;i<arrLength;i++){
            if(i%2!=0){
                arr[i]=0;
            }
        }
        for(int i = 0;i<arrLength;i++){
            System.out.print(arr[i]+" ");
        }


        in.close();

    }
}
