package org.example.creational.abstractFactory.factories.jetFacfory.impl;

import org.apache.commons.lang3.StringUtils;
import org.example.creational.abstractFactory.enums.Type;
import org.example.creational.abstractFactory.factories.jetFacfory.JetFactory;
import org.example.creational.abstractFactory.factories.jets.Jets;
import org.example.creational.abstractFactory.factories.jets.impl.CommercialJetType1;
import org.example.creational.abstractFactory.factories.jets.impl.CommercialJetType2;

import java.util.Objects;

public class CommercialJets implements JetFactory {

    /**
     * @return
     */
    @Override
    public Jets getJet(Type type,String modelName) {
        if(Objects.isNull(type)) throw new RuntimeException("Invalid request type null");
        switch (type){
            case COMMERCIAL_TYPE1: return new CommercialJetType1(modelName);
            case COMMERCIAL_TYPE2: return new CommercialJetType2(modelName);
            default: throw new RuntimeException("wrong request type");
        }
    }
}
