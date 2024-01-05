package javaRefresher.nestedclasses.inheritance;

public class ChildClassNonStatic extends NonStaticOuterClass.NestedClasses{
    ChildClassNonStatic(){
        new NonStaticOuterClass().super();

        //when child class is invoked the parent class constructor is invoked first
        //patent class is NestedClasses so to invoke the const use outerclass object
    }

    public void displayBro(){
        display();
    }

    public static void main(String[] args) {
        new ChildClassNonStatic().display();
    }
}
