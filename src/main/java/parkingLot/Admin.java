package parkingLot;

import java.util.Collections;
import java.util.List;

public class Admin extends  Account{
      public void addParkingFloor(ParkingLot parkingLot, ParkingFloors parkingFloors) {
              parkingLot.setParkingFloorsList(Collections.singletonList(parkingFloors));
      }

      public void addParkingSpace(ParkingFloors parkingFloors, ParkingSpace parkingSpace) {
             parkingFloors.setParkingSpace(Collections.singletonList(parkingSpace));
      }

      public void addParkingDispalyBoard(ParkingFloors parkingFloors, DisplayBoard displayBoard) {
             parkingFloors.setDisplayBorad(displayBoard);
      }
}
