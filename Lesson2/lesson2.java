import org.w3c.dom.ls.LSOutput;

public class lesson2 {
    public static void main(String[] args){
        String a[]={"one","two","three","four","five","six","seven","eight","nine","ten"};
        for(String i : a){
            System.out.println(i);
        }
        int sum =0;
        int i=10;
        while(i>=10 && i<=55){
            if(i%2==0){
                sum+=i;
            }
            i++;
        }
        System.out.println("Sum of numbers = "+ sum);
    }

}
