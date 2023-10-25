package org.example.creational.abstractFactory.factories.jetFacfory;

import org.example.creational.abstractFactory.enums.Type;
import org.example.creational.abstractFactory.factories.jets.Jets;

public interface JetFactory {
    Jets getJet(Type type,String modelName);
}
