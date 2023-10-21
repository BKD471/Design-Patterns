package org.example.creational.factorymethod.lambofactory.impl;

import org.example.creational.factorymethod.enums.SeatType;
import org.example.creational.factorymethod.enums.TransmissionType;
import org.example.creational.factorymethod.lambofactory.LamboCreator;
import org.example.creational.factorymethod.lambos.Lamborghini;
import org.example.creational.factorymethod.lambos.impls.Aventador;
import org.example.creational.factorymethod.lambos.impls.Hurracane;

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
