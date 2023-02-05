public class dz_lesson2_task8 {
    public static void main(String[] args) {
        System.out.println("Matrix 1: \n");
        String[][] matrix = new String[][]
                {
                        {" "," "," ","*"},
                        {" "," ","*","*"},
                        {" ","*","*","*"},
                        {"*","*","*","*"}
                };
        for (int i = 0; i < matrix.length; i++){
            for(int j=0; j < matrix[i].length; j++){

                System.out.printf("%s ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nMatrix 2: \n");
        String[][] matrix2 = new String[][]
                {
                        {"*","*","*","*"},
                        {" ","*","*","*"},
                        {" "," ","*","*"},
                        {" "," "," ","*"}
                };
        for (int i = 0; i < matrix2.length; i++){
            for(int j=0; j < matrix2[i].length; j++){

                System.out.printf("%s ", matrix2[i][j]);
            }
            System.out.println();
        }
    }
}
