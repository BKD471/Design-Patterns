package parking_lot.pricing.pricingstrategy.impls;

import parking_lot.pricing.pricingstrategy.IPricingStrategy;
import parking_lot.tickets.Ticket;

public class MinuteBased implements IPricingStrategy {
    private final double minuteBasedRate=0.5;
    /**
     * @param ticket
     */
    @Override
    public void calculatePrice(Ticket ticket) {

    }
}
