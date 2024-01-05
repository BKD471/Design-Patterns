package creational.prototype1.good_approach;

public class Runner {
    public static void main(String[] args) {
        Student student=new Student(26,04,"Bhaskar Kumar Das");
        Student clonedStudentObj=(Student) student.clone();
        System.out.println(clonedStudentObj);
    }
}
