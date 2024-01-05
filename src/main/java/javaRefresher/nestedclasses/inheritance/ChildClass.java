package javaRefresher.nestedclasses.inheritance;

public class ChildClass extends OuterClass.NestedClass{
    public  void print(){
        display();
    }

    public static void main(String[] args) {
        new ChildClass().print();
    }
}


