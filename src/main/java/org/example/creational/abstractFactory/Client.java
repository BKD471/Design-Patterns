package org.example.creational.abstractFactory;

import org.example.creational.abstractFactory.enums.JetType;
import org.example.creational.abstractFactory.enums.Type;
import org.example.creational.abstractFactory.factories.FactoryContext;
import org.example.creational.abstractFactory.factories.jetFacfory.JetFactory;
import org.example.creational.abstractFactory.factories.jets.Jets;

public class Client {
    public static void main(String[] args) {
        JetFactory jetFactory=FactoryContext.getJets(JetType.COMMERCIAL_JET);
        Jets myJet=jetFactory.getJet(Type.COMMERCIAL_TYPE1,"Boeing 747 Dream Liner");
        myJet.fly();

        jetFactory=FactoryContext.getJets(JetType.COMMERCIAL_JET);
        myJet=jetFactory.getJet(Type.COMMERCIAL_TYPE2,"AirBus A321");
        myJet.fly();

        jetFactory=FactoryContext.getJets(JetType.FIGHTER_JET);
        myJet=jetFactory.getJet(Type.FIGHTER_TYPE1,"Su 30 MKI");
        myJet.fly();

        jetFactory=FactoryContext.getJets(JetType.FIGHTER_JET);
        myJet=jetFactory.getJet(Type.FIGHTER_TYPE2,"F22 Raptor");
        myJet.fly();
    }
}
