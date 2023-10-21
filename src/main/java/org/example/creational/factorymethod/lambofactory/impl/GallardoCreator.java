package org.example.creational.factorymethod.lambofactory.impl;

import org.example.creational.factorymethod.enums.SeatType;
import org.example.creational.factorymethod.enums.TransmissionType;
import org.example.creational.factorymethod.lambofactory.LamboCreator;
import org.example.creational.factorymethod.lambos.Lamborghini;
import org.example.creational.factorymethod.lambos.impls.Aventador;
import org.example.creational.factorymethod.lambos.impls.Gallardo;

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
