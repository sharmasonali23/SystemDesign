package parkingLot;

import java.time.LocalDateTime;
import java.util.Date;

public class Entrance extends  Gate{


       public ParkingTicket getParkingTicket(Vehicle vehicle) {
              Date date=java.util.Calendar.getInstance().getTime();
              ParkingTicket pt = new ParkingTicket();
              if(vehicle.getVehicleType().equals(VehicleType.BIKE)){

                      pt.setLevelId(1);
                      pt.setTicketId(23);
                      pt.setSpaceId(123);
                      pt.setParkingSpaceType(vehicle.getVehicleType());
                      pt.setParkingTicketStatus(ParkingTicketStatus.ACTIVE);
                      pt.setVehicleEntryDateTime(date);
                      pt.setTotalCost(10);

              }
              return pt;
       }
}
