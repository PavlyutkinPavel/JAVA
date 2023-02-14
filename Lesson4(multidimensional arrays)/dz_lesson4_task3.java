import java.util.Random;
import java.util.Scanner;

public class dz_lesson4_task3 {
    public static void main(String[] args) {
        Random r =  new Random();
        Scanner in = new Scanner(System.in);
       // int mas1[][] = {{1,0,0,0},{0,1,0,0},{0,0,0,0}};
       // int mas2[][] = {{1,2,3},{1,1,1},{0,0,0},{2,1,0}};
        int a,b,c,d;
        System.out.println("Enter size of ur 1 matrix");
        System.out.println("Rows 1 matrix: ");
        a=in.nextInt();
        System.out.println("Columns 1 matrix");
        b=in.nextInt();
        System.out.println("Enter size of ur 2 matrix");
        System.out.println("Rows 2 matrix");
        c=in.nextInt();
        System.out.println("Columns 2 matrix");
        d=in.nextInt();
        while (b!=c){
            System.out.println("Number of columns of 1 matrix must be = Number of rows of 2 matrix");
            System.out.println("Enter size of ur 1 matrix");
            System.out.println("Rows 1 matrix: ");
            a=in.nextInt();
            System.out.println("Columns 1 matrix");
            b=in.nextInt();
            System.out.println("Enter size of ur 2 matrix");
            System.out.println("Rows 2 matrix");
            c=in.nextInt();
            System.out.println("Columns 2 matrix");
            d=in.nextInt();
        }
        int mas1[][]=new int[a][b];
        int mas2[][]=new int[c][d];
        int neWmas[][]=new int[a][d];
        int m=mas1.length;
        int n = mas2[0].length;
        int o = mas2.length;
        System.out.println("\nMatrix1");
        for(int i = 0;i< mas1.length;i++){
            for(int j = 0;j<mas1[i].length;j++){
                mas1[i][j]=r.nextInt(10,99);
                System.out.print(mas1[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("\nMatrix2");
        for(int i = 0;i<mas2.length;i++){
            for(int j = 0;j<mas2[i].length;j++){
                mas2[i][j]=r.nextInt(10,99);
                System.out.print(mas2[i][j]+" ");
            }
            System.out.print("\n");
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    neWmas[i][j] += mas1[i][k] * mas2[k][j];
                }
            }
        }

        for (int i = 0; i < neWmas.length; i++) {
            for (int j = 0; j < neWmas[0].length; j++) {
                System.out.format("%6d ", neWmas[i][j]);
            }
            System.out.println();
        }
        in.close();
    }
}
