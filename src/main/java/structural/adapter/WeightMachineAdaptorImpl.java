package structural.adapter;

public class WeightMachineAdaptorImpl implements IWeightMachineAdaptor{
    private final IWeightMachine weightMachine;
    WeightMachineAdaptorImpl(IWeightMachine weightMachine){
        this.weightMachine=weightMachine;
    }
    /**
     * @return
     */
    @Override
    public double getWeightInKg() {
        int weightInPound=weightMachine.getWeightInPounds();
        return weightInPound*0.45;
    }
}
