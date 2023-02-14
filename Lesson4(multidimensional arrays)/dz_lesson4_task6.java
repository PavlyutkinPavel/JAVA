import java.util.Arrays;

public class dz_lesson4_task6 {
    public static void main(String[] args) {
        int[][] mas = new int[][]
                {
                        {1, 3, 2},
                        {6, 5, 4},
                        {8, 9, 7}
                };
        int min = 50;
        int max = 100;
        int temp;
        System.out.println("\nYour array: ");
        for (int i = 0; i < mas.length; i++){
            for(int j=0; j < mas[i].length; j++){
                System.out.print(mas[i][j]+" ");
            }
            System.out.println(" ");
        }
        //buble sort
        System.out.println("\nNew array: ");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                for (int k = j + 1; k < mas.length; k++) {
                    if (mas[i][j] > mas[i][k]) {
                        temp = mas[i][j];
                        mas[i][j] = mas[i][k];
                        mas[i][k] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }

    }

}

