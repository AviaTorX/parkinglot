package com.avinash.parkinglot.models;

import java.util.List;

public class ParkingLot extends BaseModel{
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ParkingFloor> getParkingFloorList() {
        return parkingFloorList;
    }

    public void setParkingFloorList(List<ParkingFloor> parkingFloorList) {
        this.parkingFloorList = parkingFloorList;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    private String address;
    private List<ParkingFloor> parkingFloorList;
    private List<Gate> gates;
}
