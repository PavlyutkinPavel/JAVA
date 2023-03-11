import java.util.ArrayList;

public class Student {
    String name;
    int group;
    int course;
    int markMath;
    int markPhysics;

    public Student(String nameStudent, int groupNum, int courseNum, int markM, int markPh) {
        name = nameStudent;
        group = groupNum;
        course = courseNum;
        markMath = markM;
        markPhysics = markPh;
    }

    Student() {
    }
    public String toString() {
        return "Student: { name = " + this.name + ", group number = " + this.group +" course number = "+course+ " }";
    }
    //avg only for 2 marks just for example :)
    private double countAvgMark(){
        return (this.markMath+this.markPhysics)/2;
    }

    public static void deleteBadStudents(ArrayList<Student> students){
        for (Student student : students) {
            if(student.countAvgMark()<3){
                students.remove(student);
            }
        }
    }
    public static void transferToNextCourse(ArrayList<Student> students){
        for (Student student : students) {
            if(student.countAvgMark()>3){
                student.course++;
            }
        }
    }
    public static void displayStudentsByCourseNum(ArrayList<Student> students,int courseNum){
        System.out.printf("Students on %d course: ",courseNum);
        for (Student student : students) {
            if(student.course == courseNum){
                System.out.println("\nName = " + student.name + ", group number = " + student.group +" course number = "+student.course);
            }
        }
    }

}
