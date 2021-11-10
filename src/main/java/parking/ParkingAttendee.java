package parking;

public class ParkingAttendee {
      //ParkingCharge parkingCharge = new ParkingCharge();

      public void issueTicket(ParkingFloor parkingFloor) {

             if(parkingFloor.parkingType.containsKey(ParkingType.twoWheeler)){
                   System.out.println("charge is "+ ParkingCharge.getCharge(ParkingType.twoWheeler));
             }
      }

      /*public void scanTicket() {

      }*/

      public void collectTicket() {

      }

      /*public void chargeForTicket() {

      }*/
}
