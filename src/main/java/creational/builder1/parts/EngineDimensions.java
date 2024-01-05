package creational.builder1.parts;

public class EngineDimensions {
    private final double length;
    private final double breadth;
    private final double height;

    EngineDimensions(Builder builder){
        this.length= builder.length;
        this.breadth=builder.breadth;
        this.height= builder.height;
    }

    public static  final class Builder{
        public Builder(){}
        private double length;
        private double breadth;
        private double height;

        public Builder length(double length){
            this.length=length;
            return this;
        }
        public Builder breadth(double breadth){
            this.breadth=breadth;
            return this;
        }
        public Builder height(double height){
            this.height=height;
            return this;
        }
        public EngineDimensions build(){
            return new EngineDimensions(this);
        }
    }

    @Override
    public String toString() {
        return "EngineDimensions{" +
                "lengthInMM=" + length +
                ", breadthInMM=" + breadth +
                ", heightInMM=" + height +
                '}';
    }
}
