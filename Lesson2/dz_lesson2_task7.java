public class dz_lesson2_task7 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1;i<=99;i++){
            if(i%2==1){
                sum+=i;
                System.out.println(sum);
            }
        }
        System.out.println("Sum = "+sum);
    }
}
