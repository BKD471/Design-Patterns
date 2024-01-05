package creational.builder1.parts;

import java.util.Set;

public class Engine {
    private final String  modelName;
    private final long maxPower;
    private final long minPowerToHeight;
    private final EngineDimensions dimensions;
    private final long maxTorque;
    private final Set<Integer> firingOrder;
    private final double co2Emissions;
    private final double combineFuelConsumption;
    private final double engineDisplacement;

    Engine(Builder builder){
      this.modelName=builder.modelName;
      this.maxPower= builder.maxPower;
      this.minPowerToHeight= builder.minPowerToHeight;
      this.dimensions=builder.dimensions;
      this.maxTorque= builder.maxTorque;
      this.firingOrder=builder.firingOrder;
      this.co2Emissions= builder.co2Emissions;
      this.combineFuelConsumption= builder.combineFuelConsumption;
      this.engineDisplacement= builder.engineDisplacement;
    }

    public static final class Builder{
        private String  modelName;
        private long maxPower;
        private long minPowerToHeight;
        private EngineDimensions dimensions;
        private long maxTorque;
        private Set<Integer> firingOrder;
        private double co2Emissions;
        private double combineFuelConsumption;
        private double engineDisplacement;

        public Builder(){}

        public Builder modelName(String modelName){
            this.modelName=modelName;
            return this;
        }

        public Builder maxPower(long maxPower){
            this.maxPower=maxPower;
            return this;
        }

        public Builder minPowerToHeight(long minPowerToHeight){
            this.minPowerToHeight=minPowerToHeight;
            return this;
        }

        public Builder dimensions(EngineDimensions dimensions){
            this.dimensions=dimensions;
            return this;
        }

        public Builder maxTorque(long maxTorque){
            this.maxTorque=maxTorque;
            return this;
        }

        public Builder firingOrder(Set<Integer> firingOrder){
            this.firingOrder=firingOrder;
            return this;
        }

        public Builder co2Emissions(double co2Emissions){
            this.co2Emissions=co2Emissions;
            return this;
        }

        public Builder combineFuelConsumption(double combineFuelConsumption){
            this.combineFuelConsumption=combineFuelConsumption;
            return this;
        }

        public Builder engineDisplacement(double engineDisplacement){
            this.engineDisplacement=engineDisplacement;
            return this;
        }

        public Engine build(){
            return new Engine(this);
        }
    }

    @Override
    public String toString() {
        return "Engine{" +
                "modelName='" + modelName + '\'' +
                ", maxPowerInPs=" + maxPower +
                ", minPowerToHeightInPs=" + minPowerToHeight +
                ", dimensions=" + dimensions +
                ", maxTorqueInNM=" + maxTorque +
                ", firingOrder=" + firingOrder +
                ", co2Emissions(g/km)=" + co2Emissions +
                ", combineFuelConsumption (L/100km)=" + combineFuelConsumption +
                ", engineDisplacement=" + engineDisplacement +
                '}';
    }
}
