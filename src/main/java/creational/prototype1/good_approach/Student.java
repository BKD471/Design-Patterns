package creational.prototype1.good_approach;

public class Student implements Prototype{
    int age;
    private int rollNumber;
    String name;

    Student(){}
    Student(int age, int rollNumber, String name){
        this.age=age;
        this.rollNumber=rollNumber;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     * @return
     */
    @Override
    public Prototype clone() {
        return new Student(age,rollNumber,name);
    }
}
