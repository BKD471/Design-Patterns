package creational.factorymethod.lambofactory.impl;

import creational.factorymethod.enums.SeatType;
import creational.factorymethod.enums.TransmissionType;
import creational.factorymethod.lambofactory.LamboCreator;
import creational.factorymethod.lambos.Lamborghini;
import creational.factorymethod.lambos.impls.Aventador;
import creational.factorymethod.lambos.impls.Gallardo;

public class GallardoCreator extends LamboCreator {
    /**
     * @return
     */
    @Override
    public Lamborghini getLambo() {
        return new Gallardo("gallardm2",800,
                SeatType.TWIN_SEATER,
                TransmissionType.AUTOMATIC);
    }
}
