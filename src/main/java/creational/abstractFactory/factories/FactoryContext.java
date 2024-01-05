package creational.abstractFactory.factories;

import creational.abstractFactory.enums.JetType;
import creational.abstractFactory.enums.Type;
import creational.abstractFactory.factories.jetFacfory.JetFactory;
import creational.abstractFactory.factories.jetFacfory.impl.CommercialJets;
import creational.abstractFactory.factories.jetFacfory.impl.FighterJets;
import creational.abstractFactory.factories.jets.Jets;
import creational.abstractFactory.factories.jets.impl.FighterJetType1;

public class FactoryContext{

  public static JetFactory getJets(JetType jetType){

      switch (jetType){
          case FIGHTER_JET : return new FighterJets();
          case COMMERCIAL_JET: return new CommercialJets();
          default:throw new RuntimeException("Wrong request type for Jet");
      }
  }
}
