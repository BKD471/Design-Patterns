package javaRefresher.interfces.defaultmethods;



interface m5{
    default int myFavouriteNumber(){
        return 69;
    }
}

interface  m6 extends  m5{
    @Override
    default int myFavouriteNumber(){
        return m5.super.myFavouriteNumber();
    }
}
public class Type3 implements m6{
    public static void main(String[] args) {
        System.out.println(new Type3().myFavouriteNumber());
    }
}
