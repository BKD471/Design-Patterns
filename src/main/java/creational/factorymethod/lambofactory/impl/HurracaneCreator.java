package creational.factorymethod.lambofactory.impl;

import creational.factorymethod.enums.SeatType;
import creational.factorymethod.enums.TransmissionType;
import creational.factorymethod.lambofactory.LamboCreator;
import creational.factorymethod.lambos.Lamborghini;
import creational.factorymethod.lambos.impls.Aventador;
import creational.factorymethod.lambos.impls.Hurracane;

public class HurracaneCreator extends LamboCreator {
    /**
     * @return
     */
    @Override
    public Lamborghini getLambo() {
        return new Hurracane("hurracanem1",910,
                SeatType.TWIN_SEATER,
                TransmissionType.AUTOMATIC);
    }
}
