package org.example.creational.factorymethod.lambofactory.impl;

import org.example.creational.factorymethod.enums.SeatType;
import org.example.creational.factorymethod.enums.TransmissionType;
import org.example.creational.factorymethod.lambofactory.LamboCreator;
import org.example.creational.factorymethod.lambos.Lamborghini;
import org.example.creational.factorymethod.lambos.impls.Aventador;
import org.example.creational.factorymethod.lambos.impls.Revuelto;

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
