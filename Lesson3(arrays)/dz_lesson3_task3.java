import java.util.Random;


public class dz_lesson3_task3 {
    public static void main(String[] args) {
        int arrLength = 5;
        int array1[]=new int[arrLength];
        int array2[]=new int[arrLength];
        double avg1=0,sum1=0,avg2=0,sum2=0;
        Random r = new Random();
        System.out.println("Array 1: \n");
        for(int i = 0; i<arrLength;i++){
            array1[i]=r.nextInt(-100,100);
            System.out.print(array1[i]+"\t");
            sum1+=array1[i];
        }
        System.out.println("\n\nArray 2: \n");
        for(int i = 0; i<arrLength;i++){
            array2[i]=r.nextInt(-100,100);
            System.out.print(array2[i]+"\t");
            sum2+=array2[i];
        }
        avg1=sum1/arrLength;
        avg2=sum2/arrLength;
        System.out.println("\n\nAverage of the first mas = "+avg1);
        System.out.println("Average of the second mas = "+avg2);
        if(avg1>avg2){
            System.out.println("Average of the first mas > Average of the second mas");
        }else if(avg2>avg1){
            System.out.println("Average of the second mas > Average of the first mas");
        }else{
            System.out.println("Average of the first mas = Average of the second mas");
        }



    }
}
