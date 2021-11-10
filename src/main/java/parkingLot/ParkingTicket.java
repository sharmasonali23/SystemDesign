package parkingLot;

import java.util.Date;

public class ParkingTicket {

      int ticketId;
      int levelId;
      int spaceId;
      Date vehicleEntryDateTime;
      Date vehicleExitDateTime;
      VehicleType vehicleType;
      double totalCost;
      ParkingTicketStatus parkingTicketStatus;

      public int getTicketId() {
            return ticketId;
      }

      public void setTicketId(int ticketId) {
            this.ticketId = ticketId;
      }

      public int getLevelId() {
            return levelId;
      }

      public void setLevelId(int levelId) {
            this.levelId = levelId;
      }

      public int getSpaceId() {
            return spaceId;
      }

      public void setSpaceId(int spaceId) {
            this.spaceId = spaceId;
      }

      public Date getVehicleEntryDateTime() {
            return vehicleEntryDateTime;
      }

      public void setVehicleEntryDateTime(Date vehicleEntryDateTime) {
            this.vehicleEntryDateTime = vehicleEntryDateTime;
      }

      public Date getVehicleExitDateTime() {
            return vehicleExitDateTime;
      }

      public void setVehicleExitDateTime(Date vehicleExitDateTime) {
            this.vehicleExitDateTime = vehicleExitDateTime;
      }

      public VehicleType getParkingSpaceType() {
            return vehicleType;
      }

      public void setParkingSpaceType(VehicleType vehicleType) {
            this.vehicleType = vehicleType;
      }

      public double getTotalCost() {
            return totalCost;
      }

      public void setTotalCost(double totalCost) {
            this.totalCost = totalCost;
      }

      public ParkingTicketStatus getParkingTicketStatus() {
            return parkingTicketStatus;
      }

      public void setParkingTicketStatus(ParkingTicketStatus parkingTicketStatus) {
            this.parkingTicketStatus = parkingTicketStatus;
      }

      public void updateTicketCost(double charge) {
             setTotalCost(charge);
      }

      public void updateVehicleExitTime(Date vehicleExitDateTime) {

      }

}
