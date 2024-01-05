package javaRefresher.annotations.defiined.meta.inheritedann;

public class Runner {
    public static void main(String[] args) {
        Class ch=ChildClass.class;
        System.out.println(ch.getAnnotation(MyCustomAnnotation.class));
    }
}
