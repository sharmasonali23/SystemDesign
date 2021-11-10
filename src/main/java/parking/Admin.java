package parking;

import java.util.ArrayList;
import java.util.List;

public class Admin {
     List<ParkingFloor> pf =  new ArrayList<>();
    public void addParkingFloor(ParkingFloor parkingFloor) {
           if(parkingFloor.level<5){
               pf.add(parkingFloor);
           }
    }

    public void removeParkingFloor(List<ParkingFloor> parkingFloor) {
           if(parkingFloor.size()>=5){
               ParkingFloor pf = new ParkingFloor();
               parkingFloor.remove(pf);
           }
    }
}
