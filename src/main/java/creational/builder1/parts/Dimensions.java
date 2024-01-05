package creational.builder1.parts;

public class Dimensions {
    private final double length;
    private final double width;
    private final double height;
    private final double kerbWeight;
    private final double wheelBase;
    Dimensions(Builder builder){
        this.length= builder.length;
        this.width= builder.width;
        this.height= builder.height;
        this.kerbWeight= builder.kerbWeight;
        this.wheelBase=builder.wheelBase;
    }

    public static final class Builder{
        private  double length;
        private  double width;
        private  double height;
        private  double kerbWeight;
        private  double wheelBase;

        public Builder(){}

        public Builder length(double length){
            this.length=length;
            return this;
        }

        public Builder width(double width){
            this.width=width;
            return this;
        }

        public Builder height(double height){
            this.height=height;
            return this;
        }

        public Builder kerbWeight(double kerbWeight){
            this.kerbWeight=kerbWeight;
            return this;
        }

        public Builder wheelBase(double wheelBase){
            this.wheelBase=wheelBase;
            return this;
        }

        public Dimensions build(){
            return new Dimensions(this);
        }
    }

    @Override
    public String toString() {
        return "Dimensions{" +
                "lengthInMM1=" + length +
                ", widthInmm123=" + width +
                ", heightInmm12=" + height +
                ", kerbWeightInKg1=" + kerbWeight +
                ", wheelBaseInmm13=" + wheelBase +
                '}';
    }
}
