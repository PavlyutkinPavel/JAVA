public class dz_lesson2_task3 {
    public static void main(String[] args){
        int sum = 0;
        for(int i = 1;i<=256;i=i*2){
            sum+=i;
        }
        System.out.println("Sum of sequence = "+sum);
    }
}
