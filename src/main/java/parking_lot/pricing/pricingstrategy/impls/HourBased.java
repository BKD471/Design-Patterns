package parking_lot.pricing.pricingstrategy.impls;

import parking_lot.pricing.pricingstrategy.IPricingStrategy;
import parking_lot.tickets.Ticket;

public class HourBased implements IPricingStrategy {
    private final double hourBasedRate=500d;
    /**
     * @param ticket
     */
    @Override
    public void calculatePrice(Ticket ticket) {

    }
}
