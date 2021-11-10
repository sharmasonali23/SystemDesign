package parking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;

public class driverClass {

    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();
        Address address = new Address();
        ParkingFloor pf = new ParkingFloor();
        EnumMap<ParkingType, DisplayBoard> displayBoardStringEnumMap = new EnumMap<>(ParkingType.class);
        address.setCity("jbp");
        address.setState("MP");
        address.setPinCode(122456);
        pf.setLevel(1);
        displayBoardStringEnumMap.put(ParkingType.twoWheeler, DisplayBoard.VACANT);
        displayBoardStringEnumMap.put(ParkingType.FourWheeler, DisplayBoard.VACANT);

        pf.setParkingType(displayBoardStringEnumMap);
        pf.setDisplayBoard(DisplayBoard.VACANT);
        parkingLot.setAddress(address);
        parkingLot.setName("P1");
        parkingLot.setParkingFloor(new ArrayList<ParkingFloor> (Arrays.asList(pf)));
        customer customer = new customer();
        customer.bookSlot(parkingLot);
        ParkingAttendee parkingAttendee = new ParkingAttendee();
        parkingAttendee.issueTicket(pf);
        Admin admin = new Admin();
        for(int i=0;i<=5;i++) {
            pf = new ParkingFloor();
            pf.setParkingType(displayBoardStringEnumMap);
            pf.setLevel(i);
            admin.addParkingFloor(pf);
        }

    }
}
