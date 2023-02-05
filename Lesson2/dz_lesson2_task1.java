public class dz_lesson2_task1 {
    public static void main(String[] args){
        double norm = 10;
        double sumS = 0;
        for(int days = 0;days<7;days++){
            sumS += norm;
            norm = norm*0.1+norm;
            String result = String.format("%.3f",sumS);
            System.out.println(result);
        }
    }
}
