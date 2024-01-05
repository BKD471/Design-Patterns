package structural.bridge.bad_approach;

public abstract class LivingThings {
  abstract public void breatheProcess();

  /*********we cant add new BreatheIn Process unless i add a new child class
   * impl and sbtract are tightly coupled *************/
}
