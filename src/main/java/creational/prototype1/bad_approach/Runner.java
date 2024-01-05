package creational.prototype1.bad_approach;

public class Runner {
    public static void main(String[] args) {
        Student student=new Student(26,04,"Bhaskar Kumar Das");

        Student clonedStudent=new Student();
        clonedStudent.age=27;
        clonedStudent.name="Phoenix";
        //clonedStudent.rollNumber=02;
    }

    /******
     * To create a clone of student , first of all i need to know
     * all the properties to clone
     *
     * second there are some private properties
     * which cant be accessed from outside
     *
     *
     * **********/
}
