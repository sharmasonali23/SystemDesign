package parkingLot;

public class ParkingSpace {
       int spaceId;
       boolean isFree;
       double costPerHour;
       //Vehicle vehicle;
       ParkingSpaceType parkingSpaceType;

       public int getSpaceId() {
              return spaceId;
       }

       public void setSpaceId(int spaceId) {
              this.spaceId = spaceId;
       }

       public boolean isFree() {
              return isFree;
       }

       public void setFree(boolean free) {
              isFree = free;
       }

       public double getCostPerHour() {
              return costPerHour;
       }

       public void setCostPerHour(double costPerHour) {
              this.costPerHour = costPerHour;
       }

       /*public Vehicle getVehicle() {
              return vehicle;
       }

       public void setVehicle(Vehicle vehicle) {
              this.vehicle = vehicle;
       }*/

       public ParkingSpaceType getParkingSpaceType() {
              return parkingSpaceType;
       }

       public void setParkingSpaceType(ParkingSpaceType parkingSpaceType) {
              this.parkingSpaceType = parkingSpaceType;
       }
}
