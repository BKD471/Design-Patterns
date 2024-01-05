package parking_lot.pricing.pricingstrategy;

import parking_lot.tickets.Ticket;

public interface IPricingStrategy {
    void calculatePrice(Ticket ticket);
}
