package creational.abstractFactory.factories.jetFacfory.impl;

import creational.abstractFactory.enums.Type;
import creational.abstractFactory.factories.jetFacfory.JetFactory;
import creational.abstractFactory.factories.jets.Jets;
import creational.abstractFactory.factories.jets.impl.FighterJetType1;
import creational.abstractFactory.factories.jets.impl.FighterJetType2;

import java.util.Objects;

public class FighterJets implements JetFactory {
    /**
     * @return
     */
    @Override
    public Jets getJet(Type type,String modelName) {
        if(Objects.isNull(type)) throw new RuntimeException("Wrong request type null");
        switch (type){
            case FIGHTER_TYPE1 :return new FighterJetType1(modelName);
            case FIGHTER_TYPE2 :return new FighterJetType2(modelName);
            default: throw new RuntimeException("Wron request type for Fighter jet");
        }
    }
}
