package parkingLot;

public class Gate {
    int id;
    ParkingAttendent parkingAttendent;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ParkingAttendent getParkingAttendent() {
        return parkingAttendent;
    }

    public void setParkingAttendent(ParkingAttendent parkingAttendent) {
        this.parkingAttendent = parkingAttendent;
    }
}
