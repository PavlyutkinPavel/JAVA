import java.util.Random;
import java.util.Scanner;

public class dz_lesson4_task1 {
    public static void main(String[] args) {
        int a;
        Scanner in = new Scanner(System.in);

        int[][][] mas = new int[][][]{
            { {1,2,3}, {4,5,6}, {7,8,9}},
            { {1,2,3},{4,5,6}, {7,8,9}},
            { {1,2,3},{4,5,6}, {7,8,9}}
        };
        Random r = new Random();
        for (int i = 0; i < mas.length; i++){
            System.out.println("Page№: "+i+"\n");
            for(int j=0; j < mas[i].length; j++){
                for(int k = 0;k<mas[i][j].length;k++){
                    mas[i][j][k]=r.nextInt(-100,100);
                    System.out.print(mas[i][j][k]+" ");
                }
                System.out.print("\n");
            }
            System.out.println("\n");
        }

        System.out.println("Input the number to increase ur elements: ");
        a=in.nextInt();

        for (int i = 0; i < mas.length; i++){
            System.out.println("Page№: "+i+"\n");
            for(int j=0; j < mas[i].length; j++){
                for(int k = 0;k<mas[i][j].length;k++){
                    mas[i][j][k]+=a;
                    System.out.print(mas[i][j][k]+" ");
                }
                System.out.print("\n");
            }
            System.out.println("\n");
        }


        in.close();
    }
}
