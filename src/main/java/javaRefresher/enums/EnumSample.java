package javaRefresher.enums;

public enum EnumSample {
    MONDAY(101,"1st Day of Week"),
    TUESDAY(102,"2nd Day of Week"),
    WEDNESDAY(103,"3rd Day of Week"),
    THURSDAY(104,"4th Day of Week"),
    FRIDAY(105,"5th Day of Week"),
    SATURDAY(106,"6th Day of Week"),
    SUNDAY(107,"7th Day of Week");

    private final int val;
    private final String comment;
    EnumSample(int val, String comment){
        this.val=val;
        this.comment=comment;
    }

    public int getVal() {
        return val;
    }

    public String getComment() {
        return comment;
    }

    public static EnumSample getEnumByValue(int value){
        for(EnumSample enumSample:EnumSample.values()){
            if(enumSample.val==value) return enumSample;
        }
        return null;
    }
}
