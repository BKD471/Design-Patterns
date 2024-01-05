package creational.abstractFactory.factories.jetFacfory;

import creational.abstractFactory.enums.Type;
import creational.abstractFactory.factories.jets.Jets;

public interface JetFactory {
    Jets getJet(Type type,String modelName);
}
