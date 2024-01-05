package creational.factorymethod.lambofactory.impl;

import creational.factorymethod.enums.SeatType;
import creational.factorymethod.enums.TransmissionType;
import creational.factorymethod.lambofactory.LamboCreator;
import creational.factorymethod.lambos.Lamborghini;
import creational.factorymethod.lambos.impls.Aventador;
import creational.factorymethod.lambos.impls.Urus;

public class UrusCreator extends LamboCreator {
    /**
     * @return
     */
    @Override
    public Lamborghini getLambo() {
        return new Urus("urusm23",300,
                SeatType.FOUR_SEATER,
                TransmissionType.AUTOMATIC);
    }
}
