import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(Integer.valueOf(7));
        l.add(Integer.valueOf(6));
        double avg = MyMass.calculateAvg(l);
        System.out.println("Avg = " + avg);


        //shop
       Shop myShop = new Shop();
      //  myShop.products.put("0001","milk");
        System.out.println("\n 1 ");
        myShop.addProduct("12",new Product("eat","Pizza"));
        System.out.println("\n 2 ");
        try {
            myShop.deleteProduct("10");
        }catch (ProductNotExistException e){// можно в скобках Exception e
            System.out.println("Product doesn't exist");
        }
        System.out.println("\n 3 ");
        myShop.getProductByCategory("eat");

*/


        // dz task 1

        Scanner in = new Scanner(System.in);
        System.out.println("Enter string of  numbers (example 1,2,2,4,1,0):");
        String myString = in.next();
        LinkedHashSet<String> test=new LinkedHashSet<String>(Arrays.asList(myString.split(",")));
        System.out.println(test);

        // dz task 2
        Student student1 = new Student("Max",4,2,3,2);
        Student student2 = new Student("Pavel",5,2,9,5);
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(student1);
        studentList.add(student2);
        Student.deleteBadStudents(studentList);
        for (Student student:studentList) {
            System.out.println(student.toString());
        }
        Student.transferToNextCourse(studentList);
        for (Student student:studentList) {
            System.out.println(student.toString());
        }
        Student student3 = new Student("Dima",1,3,3,4);
        studentList.add(student3);
        Student.displayStudentsByCourseNum(studentList,3);

    }
}