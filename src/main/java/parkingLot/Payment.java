package parkingLot;

public class Payment {
   // Exit exit;
    public PaymentInfo makePayment(ParkingTicket parkingTicket, PaymentType paymentType) {
           if(paymentType.equals(PaymentType.UPI)){
              // scanQRCode(code);
           }else if(paymentType.equals(PaymentType.CREDIT_CARD)){

           }else if(paymentType.equals(PaymentType.DEBIT_CARD)){

           }
        return null;
    }
}
