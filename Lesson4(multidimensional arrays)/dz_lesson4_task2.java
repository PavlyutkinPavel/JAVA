public class dz_lesson4_task2 {
    public static void main(String[] args) {
        int size = 8;
        String b ="B",w="W";
        String mas[][]=new String[size][size];
        for(int i = 0;i< mas.length;i++){
            for(int j = 0;j< mas.length;j++){
                if((i+j)%2==0){
                    mas[i][j]=b;
                }else{
                    mas[i][j]=w;
                }
                System.out.print(mas[i][j]+"   ");
            }
            System.out.println("\n");
        }
    }
}
