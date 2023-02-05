public class dz_lesson2_task5 {
    public static void main(String[] args) {
        double inch = 1;
        for(int i = 1;i<=20;i++){
            inch=i*2.54;
            if(i==1){
                System.out.println(i+" inch = "+inch);
            }else{
                System.out.println(i+" inches = "+inch);
            }
        }
    }
}
