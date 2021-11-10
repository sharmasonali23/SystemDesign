package parkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    String parkingLotName;
    Address address;
    List<ParkingFloors> parkingFloorsList = new ArrayList<>(2);
    List<Entrance> entranceList = new ArrayList<>(2) ;
    List<Exit> exitList = new ArrayList<>(2);

    public String getParkingLotName() {
        return parkingLotName;
    }

    public void setParkingLotName(String parkingLotName) {
        this.parkingLotName = parkingLotName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<ParkingFloors> getParkingFloorsList() {
        return parkingFloorsList;
    }

    public void setParkingFloorsList(List<ParkingFloors> parkingFloorsList) {
        this.parkingFloorsList = parkingFloorsList;
    }

    public List<Entrance> getEntranceList() {
        return entranceList;
    }

    public void setEntranceList(List<Entrance> entranceList) {
        this.entranceList = entranceList;
    }

    public List<Exit> getExitList() {
        return exitList;
    }

    public void setExitList(List<Exit> exitList) {
        this.exitList = exitList;
    }

    public boolean isParkingSpaceAvailable(Vehicle vehicle) {
           boolean isParkingSpaceAvailable = false;
           VehicleType vehicleType = vehicle.getVehicleType();
           for(ParkingFloors parkingFloors :parkingFloorsList){
               DisplayBoard displayBoard = parkingFloors.getDisplayBorad();
               if(displayBoard.freeSpotAvailable.containsKey(vehicleType)){
                   int freeSpot = displayBoard.freeSpotAvailable.get(vehicleType);
                   if(freeSpot>0) {
                       isParkingSpaceAvailable=true;
                       displayBoard.updateFreeSpotAvailable(vehicleType, freeSpot - 1);
                   }
               }
           }
           return  isParkingSpaceAvailable;
    }

    public void updateAttendentToGate(ParkingAttendent parkingAttendent, int gateId) {

    }
}
