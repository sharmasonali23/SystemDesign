package parkingLot;

import java.util.HashMap;
import java.util.Map;

public class DisplayBoard {
    Map<VehicleType , Integer> freeSpotAvailable = new HashMap<>(){{
       put(VehicleType.BIKE,4);
       put(VehicleType.CAR,4);
       put(VehicleType.TRUCK,4);
    }};

    public void updateFreeSpotAvailable(VehicleType vehicleType, int space) {


    }
}
