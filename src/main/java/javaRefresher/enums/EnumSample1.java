package javaRefresher.enums;


//enum with overriden method
public enum EnumSample1 {
    MONDAY{
        @Override
        public void dummyMethod(){
            System.out.println("Special Monday method");
        }
    },
    TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;

    public void dummyMethod(){
        System.out.println("Default method");
    }
}
