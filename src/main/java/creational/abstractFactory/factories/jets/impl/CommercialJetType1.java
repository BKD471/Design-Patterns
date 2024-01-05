package creational.abstractFactory.factories.jets.impl;

import creational.abstractFactory.factories.jets.Jets;

public class CommercialJetType1 implements Jets {
    private final String modelName;

    public CommercialJetType1(String modelName){
        this.modelName=modelName;
    }
    /**
     *
     */
    @Override
    public void fly() {
        System.out.printf("Commercial Jet Type 1 %s Flying..........%n",modelName);
        System.out.println();
    }

    @Override
    public String toString() {
        return "CommercialJetType1{" +
                "modelName='" + modelName + '\'' +
                '}';
    }
}
