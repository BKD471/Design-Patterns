package org.example.creational.abstractFactory.factories.jets.impl;

import org.example.creational.abstractFactory.factories.jets.Jets;

public class FighterJetType2 implements Jets {
    private final String modelName;

    public FighterJetType2(String modelName){
        this.modelName=modelName;
    }
    /**
     *
     */
    @Override
    public void fly() {
        System.out.printf("Fighter Jet Type 2 %s Flying..........",modelName);
        System.out.println();
    }

    @Override
    public String toString() {
        return "FighterJetType2{" +
                "modelName='" + modelName + '\'' +
                '}';
    }
}
