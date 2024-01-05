package javaRefresher.nestedclasses;


/**
 * Those are classes which are defined in any block like for loop,
 * while loop, if condition block,method etc
 *
 *
 * it cannot be decalred private proteced default.Only default access midifier is used
 * It cannot be initiated outside of the block
 * */
public class LocalInnerCLass {
    public static void main(String[] args) {
        OuterClass ot=new OuterClass();
        ot.display();

        //LocalInnerClasses localInnerCLass=new LocalInnerClasses();
        // cant be instantiated here outside of block
    }
}


class OuterClass{
    private final int instanceVariable=10;
    private final static int classVariable=77;

    public void display(){
        final int methodLocalVariable=1;
        class LocalInnerClasses{
            private final int localInnerVariable=4;
            public void print(){
                System.out.println(instanceVariable+" "+classVariable+" "+methodLocalVariable+" "+localInnerVariable);
            }
        }

        LocalInnerClasses localInnerClass=new LocalInnerClasses();
        localInnerClass.print();
    }
}