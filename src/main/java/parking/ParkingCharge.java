package parking;

public enum ParkingCharge {

    two_wheleer_parking_charge(100), four_wheleer_parking_charge(200);

    private int charge;
    private ParkingCharge(int charge) {
           this.charge = charge;
    }

    public   static int getCharge(ParkingType parking){
        if(parking.equals(two_wheleer_parking_charge))
            return  100;
        else
            return 200;
    }
}
