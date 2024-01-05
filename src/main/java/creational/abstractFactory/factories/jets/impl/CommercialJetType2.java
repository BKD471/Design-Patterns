package creational.abstractFactory.factories.jets.impl;

import creational.abstractFactory.factories.jets.Jets;

public class CommercialJetType2 implements Jets {
    private final String modelName;

    public CommercialJetType2(String modelName){
        this.modelName=modelName;
    }
    /**
     *
     */
    @Override
    public void fly() {
        System.out.printf("Commercial Jet Type 2  %s Flying..........",modelName);
        System.out.println();
    }

    @Override
    public String toString() {
        return "CommercialJetType2{" +
                "modelName='" + modelName + '\'' +
                '}';
    }
}
