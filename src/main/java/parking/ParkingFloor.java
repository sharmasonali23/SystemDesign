package parking;

import java.util.EnumMap;

public class ParkingFloor {

       int level;
       EnumMap parkingType;
       DisplayBoard displayBoard;

       public int getLevel() {
              return level;
       }

       public void setLevel(int level) {
              this.level = level;
       }

       public EnumMap getParkingType() {
              return parkingType;
       }

       public void setParkingType(EnumMap parkingType) {
              this.parkingType = parkingType;
       }

       public DisplayBoard getDisplayBoard() {
              return displayBoard;
       }

       public void setDisplayBoard(DisplayBoard displayBoard) {
              this.displayBoard = displayBoard;
       }
}
