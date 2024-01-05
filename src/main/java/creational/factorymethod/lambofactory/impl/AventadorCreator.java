package creational.factorymethod.lambofactory.impl;

import creational.factorymethod.enums.SeatType;
import creational.factorymethod.enums.TransmissionType;
import creational.factorymethod.lambofactory.LamboCreator;
import creational.factorymethod.lambos.Lamborghini;
import creational.factorymethod.lambos.impls.Aventador;

public class AventadorCreator extends LamboCreator {
    /**
     * @return
     */
    @Override
    public Lamborghini getLambo() {
        return new Aventador("aventm1",700,
                SeatType.TWIN_SEATER,
                TransmissionType.AUTOMATIC);
    }
}
