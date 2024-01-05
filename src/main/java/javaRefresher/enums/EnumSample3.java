package javaRefresher.enums;

//enum with abs method
public enum EnumSample3 implements MyInterFace{
    MONDAY, TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;

    @Override
    public String toLowerCase(){
        return this.name().toLowerCase();
    }
}
