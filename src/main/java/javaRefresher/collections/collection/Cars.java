package javaRefresher.collections.collection;


public class Cars implements  Comparable<Cars>{
    private final String carName;
    private final double carPrice;
    private final FuelType fuelType;

    Cars(String carName,double carPrice,FuelType fuelType){
        this.carName=carName;
        this.carPrice=carPrice;
        this.fuelType=fuelType;
    }

    public String getCarName() {
        return carName;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "carName='" + carName + '\'' +
                ", carPrice=" + carPrice +
                ", fuelType=" + fuelType +
                '}'+"\n";
    }

    //default behavipur sorting in descending of carname
    /**
     * @param car the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Cars b) {
        return -this.carName.compareTo(b.carName);
    }
}
