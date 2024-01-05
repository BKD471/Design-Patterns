package javaRefresher.nestedclasses;

//Member inner class
class OuterClassType3 {
    private final int instanceVariable = 10;
    private final static int classVariable = 47;

    class NestedClass {
        final int nestedInstVar=79;
        public void print() {
            System.out.println("class "+classVariable);  //classmembers is allowed
            System.out.println("instance "+instanceVariable); // instance memebers are alowed
        }
    }

    class NestedClassType1 extends NestedClass{  //inheritance between nested classes
        public void prints(){
            System.out.println(nestedInstVar+" "+instanceVariable+" "+classVariable);
        }
    }
}

class OuterClassType4 {
    private final int instanceVariable = 10;
    private final static int classVariable = 77;

    private class NestedClass {
        public void print() {
            System.out.println("class "+classVariable);  //classmembers is allowed
            System.out.println("instance "+instanceVariable); //allowed
        }
    }

    public void display() {
        NestedClass nestedClass = new NestedClass();
        nestedClass.print();
    }
}

public class NonStaticNestedClass {
    public static void main(String[] args) {
        OuterClassType3 outerClassObj1 = new OuterClassType3();
        OuterClassType3.NestedClass nestedObj1 = outerClassObj1.new NestedClass();
        nestedObj1.print();

        OuterClassType4 outerClassObj2 = new OuterClassType4();
        outerClassObj2.display();
    }
}
