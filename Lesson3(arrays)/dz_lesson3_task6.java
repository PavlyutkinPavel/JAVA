import java.util.Arrays;
public class dz_lesson3_task6 {
    public static void main(String[] args) {
        //#1 with Arrays.sort :)
        String arrSurname[]={"Petrov","Kovalev","Aliev","Ivanov","Pavlyutkin"};
        Arrays.sort(arrSurname);
        for(String a : arrSurname){
            System.out.println(a);
        }
    }
}
