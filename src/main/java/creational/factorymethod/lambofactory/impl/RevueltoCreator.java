package creational.factorymethod.lambofactory.impl;

import creational.factorymethod.enums.SeatType;
import creational.factorymethod.enums.TransmissionType;
import creational.factorymethod.lambofactory.LamboCreator;
import creational.factorymethod.lambos.Lamborghini;
import creational.factorymethod.lambos.impls.Aventador;
import creational.factorymethod.lambos.impls.Revuelto;

public class RevueltoCreator extends LamboCreator {
    /**
     * @return
     */
    @Override
    public Lamborghini getLambo() {
        return new Revuelto("reveultom1",990,
                SeatType.TWIN_SEATER,
                TransmissionType.AUTOMATIC);
    }
}
