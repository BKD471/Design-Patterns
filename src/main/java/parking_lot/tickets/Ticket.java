package parking_lot.tickets;

import parking_lot.parking.parkingspot.ParkingSpot;
import parking_lot.vehicles.Vehicle;

import java.time.LocalDateTime;

public class Ticket {
    private LocalDateTime entryTime;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
}
