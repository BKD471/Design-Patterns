package org.example.creational.abstractFactory.factories.jets.impl;

import org.example.creational.abstractFactory.factories.jets.Jets;

import java.lang.reflect.Field;

public class FighterJetType1 implements Jets {
    private final String modelName;

    public FighterJetType1(String modelName){
        this.modelName=modelName;
    }
    /**
     *
     */
    @Override
    public void fly() {
        System.out.printf("Fighter Jet Type 1 %s Flying..........",modelName);
        System.out.println();
    }

    @Override
    public String toString() {
        return "FighterJetType1{" +
                "modelName='" + modelName + '\'' +
                '}';
    }
}
