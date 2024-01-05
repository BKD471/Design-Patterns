package creational.builder1;

import creational.builder1.parts.Dimensions;
import creational.builder1.parts.Engine;
import creational.builder1.parts.FuelType;

public class Lamborghini {
    private final String modelName;
    private final Engine engine;
    private final Dimensions dimensions;
    private final FuelType fuelType;
    private final double fuelTankCapacity;
    private final double groundClearanceUnladen;
    private final int seatingCapacity;
    private final double bootSpace;

    private final Boolean antiLockBrakingSystem;
    private final Boolean driverAirBag;
    private final Boolean passengerAirBag;

    public Lamborghini(Builder builder){
        this.modelName= builder.modelName;
        this.engine= builder.engine;
        this.dimensions= builder.dimensions;
        this.fuelType=builder.fuelType;
        this.groundClearanceUnladen= builder.groundClearanceUnladen;
        this.fuelTankCapacity= builder.fuelTankCapacity;
        this.seatingCapacity= builder.seatingCapacity;
        this.bootSpace= builder.bootSpace;
        this.passengerAirBag=builder.passengerAirBag;
        this.driverAirBag=builder.driverAirBag;
        this.antiLockBrakingSystem=builder.antiLockBrakingSystem;
    }

    public static final class Builder{
        private String modelName;
        private Engine engine;
        private Dimensions dimensions;
        private FuelType fuelType;
        private double fuelTankCapacity;
        private double groundClearanceUnladen;
        private int seatingCapacity;
        private double bootSpace;

        private Boolean antiLockBrakingSystem;
        private Boolean driverAirBag;
        private Boolean passengerAirBag;

        public Builder(){}
        public Builder modelName(String modelName){
            this.modelName=modelName;
            return this;
        }

        public Builder engine(Engine engine){
            this.engine=engine;
            return this;
        }

        public Builder dimensions(Dimensions dimensions){
            this.dimensions=dimensions;
            return this;
        }

        public Builder fuelType(FuelType fuelType){
            this.fuelType=fuelType;
            return this;
        }

        public Builder fuelTankCapacity(double fuelTankCapacity){
            this.fuelTankCapacity=fuelTankCapacity;
            return this;
        }

        public Builder seatingCapacity(int seatingCapacity){
            this.seatingCapacity=seatingCapacity;
            return this;
        }

        public Builder groundClearanceUnladen(double groundClearanceUnladen){
            this.groundClearanceUnladen=groundClearanceUnladen;
            return this;
        }

        public Builder bootSpace(double bootSpace){
            this.bootSpace=bootSpace;
            return this;
        }

        public Builder antiLockBrakingSystem(Boolean antiLockBrakingSystem){
            this.antiLockBrakingSystem=antiLockBrakingSystem;
            return this;
        }

        public Builder driverAirBag(Boolean driverAirBag){
            this.driverAirBag=driverAirBag;
            return this;
        }

        public Builder passengerAirBag(Boolean passengerAirBag){
            this.passengerAirBag=passengerAirBag;
            return this;
        }

        public Lamborghini build(){
            return new Lamborghini(this);
        }
    }

    @Override
    public String toString() {
        return "Lamborghini{" +
                "modelName='" + modelName + '\'' +
                ", engine=" + engine +
                ", dimensions=" + dimensions +
                ", fuelType=" + fuelType +
                ", fuelTankCapacity=" + fuelTankCapacity +
                ", groundClearanceUnladenInMM=" + groundClearanceUnladen +
                ", seatingCapacity=" + seatingCapacity +
                ", bootSpace=" + bootSpace +
                ", antiLockBrakingSystem=" + antiLockBrakingSystem +
                ", driverAirBag=" + driverAirBag +
                ", passengerAirBag=" + passengerAirBag +
                '}';
    }
}
