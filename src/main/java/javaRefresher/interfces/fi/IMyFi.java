package javaRefresher.interfces.fi;

@FunctionalInterface
public interface IMyFi {
    String say();
}

@FunctionalInterface           //allowed since its overridining
interface  IMyFi2 extends  IMyFi{
    String say();
}

//np,,no longer an fi
//@FunctionalInterface
//interface  IMyFi3 extends  IMyFi{
//    String hello();
//}
