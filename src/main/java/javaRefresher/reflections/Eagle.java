package javaRefresher.reflections;

public class Eagle implements Bird{
    private final String breed;
    private final boolean canSwim;
    private int prvateField;
    public int publicField;

    Eagle(){
        this.breed=null;
        this.canSwim=false;
    }
    public Eagle(String breed,boolean canSwim){
        this.breed=breed;
        this.canSwim=canSwim;
    }

    private Eagle(int a,int b,String c,boolean d){
        this.publicField=a;
        this.prvateField=b;
        this.breed=c;
        this.canSwim=d;
    }

    private Bird specializedMehod(int a,double b,String c){
        return new Bird() {
            @Override
            public void fly() {
                System.out.println("Special flying");
            }

            @Override
            public void eat() {
                System.out.println("Special Eating....");
            }

            @Override
            public int flapPerHour() {
                return 6969;
            }

            @Override
            public double attainServiceCeiling(double a) {
                return 69696969.0d;
            }
        };
    }
    @Override
    public void fly(){
        System.out.println("Flying......");
    }

    @Override
    public void eat(){
        System.out.println("Eatng.........");
    }

    /**
     * @return
     */
    @Override
    public int flapPerHour() {
        return 690000;
    }

    /**
     * @param a
     * @return
     */
    @Override
    public double attainServiceCeiling(double a) {
        return 69000;
    }


}
