package parkingLot;

public class ParkingAttendent extends  Account {
       Payment paymentService;

       public boolean  processVehicleEntry(Vehicle vehicle) {

              return false;
       }

       public PaymentInfo processPayment(ParkingTicket parkingTicket, PaymentType paymentType) {
             paymentService.makePayment(parkingTicket,paymentType);
              return null;
       }
}
