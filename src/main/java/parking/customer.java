package parking;

import java.util.EnumMap;
import java.util.List;

public class customer {
    //ParkingType parkingType;
    public void bookSlot(ParkingLot parkingLot) {
           List<ParkingFloor> parkingFloorList=parkingLot.getParkingFloor();
           for(ParkingFloor parkingFloor:parkingFloorList){
               if(parkingFloor.level==1 && parkingFloor.parkingType.containsKey(ParkingType.twoWheeler)){
                   EnumMap<ParkingType, DisplayBoard> enumMap = parkingFloor.getParkingType();
                   enumMap.put(ParkingType.twoWheeler, DisplayBoard.OCCUPIED);
               }
               //parkingLot.toString();
               System.out.println(parkingLot.getName()+" "+parkingFloor.getParkingType()+" "+
                       parkingFloor.getDisplayBoard()+" "+parkingLot.getAddress().getCity()+" "+parkingLot
               .getAddress().getPinCode());
           }
    }

    public void removeSlot() {

    }

}
