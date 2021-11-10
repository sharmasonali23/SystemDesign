package parkingLot;

import java.util.List;

public class ParkingFloors {
       int level;
       boolean isFull;
       List<ParkingSpace> parkingSpace;
       DisplayBoard displayBorad;

       public int getLevel() {
              return level;
       }

       public void setLevel(int level) {
              this.level = level;
       }

       public boolean isFull() {
              return isFull;
       }

       public void setFull(boolean full) {
              isFull = full;
       }

       public List<ParkingSpace> getParkingSpace() {
              return parkingSpace;
       }

       public void setParkingSpace(List<ParkingSpace> ParkingSpace) {
              this.parkingSpace = ParkingSpace;
       }

       public DisplayBoard getDisplayBorad() {
              return displayBorad;
       }

       public void setDisplayBorad(DisplayBoard displayBorad) {
              this.displayBorad = displayBorad;
       }
}
