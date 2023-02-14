public class Main {
    public static void main(String[] args) {
        //task1
        /*int[][] mas = new int[][]
                {
                        {4, 7, 0},
                        {5, 9, 2},
                        {-11, 10, 19}
                };
        int max = mas[0][0];
        for (int i = 0; i < mas.length; i++){
            for(int j=0; j < mas[i].length; j++){
                if(mas[i][j]>max){
                    max = mas[i][j];
                }
                System.out.printf("%d ", mas[i][j]);
            }
            System.out.println();
        }
        System.out.println("Max element = "+ max);
        //task2

        int sumGl = 0;
        int sumPob = 0;
        for (int i = 0; i < mas.length; i++){
            for(int j=0; j < mas[i].length; j++){
                if(i==j){
                    sumGl+=mas[i][j];
                }
            }
        }
        for (int i = 0; i < mas.length; i++){
            for(int j=0; j < mas[i].length; j++){
                if(j== mas.length-i-1){
                    sumPob+=mas[i][j];
                }
            }
        }
        System.out.println("Sum main diag = "+sumGl);
        System.out.println("Sum main diag = "+sumPob);
*/
        //task3
        int[][] matrix = new int[][]
                {
                        {4, 7, 0,4},
                        {5, 9, 2,5},
                        {-11, 10, 19,8},
                        {2,4,5,1}
                };
        double avg = 0;
        int max = 0;
        double sumOfMax = 0;
        for (int i = 0; i < matrix.length; i++){
             max = matrix[i][0];
            for(int j=0; j < matrix[i].length; j++){
                if(matrix[i][j]>max){
                    max=matrix[i][j];
                }
                System.out.printf("%d ", matrix[i][j]);
            }
            sumOfMax+=max;
            System.out.println();
        }
        System.out.println("Sum of max elements = "+ sumOfMax);
        avg=sumOfMax/matrix.length;
        System.out.println("Avg = "+avg);

        //task4
        int sumEven=0;
        int sumNode=0;
        for (int i = 0; i < matrix.length; i++){
            for(int j=0; j < matrix[i].length; j++){
                if(i%2==0){
                    sumEven+=matrix[i][j];
                }else{
                    sumNode+=matrix[i][j];
                }
            }
        }
        System.out.println("Sum even = "+sumEven);
        System.out.println("Sum node = "+sumNode);
        if(sumEven>sumNode){
            System.out.println("SumEven>SumNode");
        } else if (sumEven<sumNode) {
            System.out.println("SumNde>SumEven");
        }else {
            System.out.println("=");
        }
    }
}