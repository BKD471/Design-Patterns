package javaRefresher.interfces.fi;

class ImplWay1 implements  IMyFi{
    public String say(){
        return "using class to implement fi";
    }
}

public class MyFiImpl {
    public static void main(String[] args) {
        IMyFi myFi=null;
        myFi=new ImplWay1();
        String res1=executeFiObj(myFi);
        System.out.println(res1);
        //useing aic
        myFi=new IMyFi(){
            @Override
            public String say(){
                return "Using aic to implement fi";
            }
        };
        String res2=executeFiObj(myFi);
        System.out.println(res2);

        //using lambda
        myFi=()-> "Using lambda to implement fi";
        String res3=executeFiObj(myFi);
        System.out.println(res3);
    }

    public static String executeFiObj(IMyFi myFi){
        return myFi.say();
    }
}
