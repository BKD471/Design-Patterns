package org.example.creational.factorymethod.lambofactory.impl;

import org.example.creational.factorymethod.enums.SeatType;
import org.example.creational.factorymethod.enums.TransmissionType;
import org.example.creational.factorymethod.lambofactory.LamboCreator;
import org.example.creational.factorymethod.lambos.Lamborghini;
import org.example.creational.factorymethod.lambos.impls.Aventador;
import org.example.creational.factorymethod.lambos.impls.Urus;

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
