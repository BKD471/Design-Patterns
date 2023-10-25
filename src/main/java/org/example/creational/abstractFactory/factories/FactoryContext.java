package org.example.creational.abstractFactory.factories;

import org.example.creational.abstractFactory.enums.JetType;
import org.example.creational.abstractFactory.enums.Type;
import org.example.creational.abstractFactory.factories.jetFacfory.JetFactory;
import org.example.creational.abstractFactory.factories.jetFacfory.impl.CommercialJets;
import org.example.creational.abstractFactory.factories.jetFacfory.impl.FighterJets;
import org.example.creational.abstractFactory.factories.jets.Jets;
import org.example.creational.abstractFactory.factories.jets.impl.FighterJetType1;

public class FactoryContext{

  public static JetFactory getJets(JetType jetType){

      switch (jetType){
          case FIGHTER_JET : return new FighterJets();
          case COMMERCIAL_JET: return new CommercialJets();
          default:throw new RuntimeException("Wrong request type for Jet");
      }
  }
}
