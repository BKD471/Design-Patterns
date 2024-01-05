package javaRefresher.nestedclasses;

class OuterClassType1 {
    private final int instanceVariable = 10;
    private final static int classVariable = 47;

     static class NestedClass {
        public void print() {
            System.out.println(classVariable);  //classmembers is allowed
            //System.out.println(instanceVariable); //np
        }
    }
}

class OuterClassType2 {
    private final int instanceVariable = 30;
    private final static int classVariable = 97;

    private static class NestedClass {
        public void print() {
            System.out.println(classVariable);  //classmembers is allowed
            //System.out.println(instanceVariable); //np
        }
    }

    public void display(){
        NestedClass nestedObj=new NestedClass();
        nestedObj.print();
    }
}
public class StaticNestedClass {
    public static void main(String[] args) {
      //nested class obj can be instantiated
        // without creating the outer class object
      OuterClassType1.NestedClass nestedObj= new OuterClassType1.NestedClass();
      nestedObj.print();

      OuterClassType2 outerClassType2=new OuterClassType2();
      outerClassType2.display();
    }
}