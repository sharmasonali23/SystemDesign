package parkingLot;

import java.util.Date;

public class Exit extends Gate{
    ParkingSpace parkingSpace;
    public ParkingTicket payForTicket(ParkingTicket parkingTicket, PaymentType paymentType) {
        Date exitDate=java.util.Calendar.getInstance().getTime();
           if(parkingTicket.getParkingSpaceType().equals(VehicleType.BIKE)){
               Date date = parkingTicket.getVehicleEntryDateTime();
               long dateDiff = exitDate.getDate()-date.getDate();
               long totalCost = (long) (parkingTicket.getTotalCost()*dateDiff);
               parkingTicket.updateTicketCost(totalCost);
               parkingTicket.setVehicleExitDateTime(exitDate);
           }
        return parkingTicket;
    }
}
