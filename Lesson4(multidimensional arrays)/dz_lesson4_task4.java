public class dz_lesson4_task4 {
    public static void main(String[] args) {
        int[][] mas = new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        int sum = 0;
        for (int i = 0; i < mas.length; i++){
            for(int j=0; j < mas[i].length; j++){
                sum += mas[i][j];
                System.out.printf("%d ", mas[i][j]);
            }
            System.out.println();
        }
        System.out.println("Sum of all elements = "+ sum);
    }
}
