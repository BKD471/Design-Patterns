package creational.factorymethod.lambos;

public abstract class Lamborghini {
    private final String modelName;
    private final double horsePower;
    protected Lamborghini(String modelName, double horsePower){
        this.modelName=modelName;
        this.horsePower=horsePower;
    }



    @Override
    public String toString() {
        return "Lamborghini{" +
                "modelName='" + modelName + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}
