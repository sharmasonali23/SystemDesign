package parking;

import java.util.List;

public class ParkingLot {

    String name ;
    Address address;
    List<ParkingFloor> parkingFloor;
    /*ParkingAttendee parkingAttendee;
    Admin admin;*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<ParkingFloor> getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(List<ParkingFloor> parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    @Override
    public String toString() {
        return "ParkingLot{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", parkingFloor=" + parkingFloor +
                '}';
    }
/*public ParkingAttendee getParkingAttendee() {
        return parkingAttendee;
    }

    public void setParkingAttendee(ParkingAttendee parkingAttendee) {
        this.parkingAttendee = parkingAttendee;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }*/
}
