package com.avinash.parkinglot.models;

public class Ticket extends BaseModel{
    private String entryTime;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private Operator operator;
    private EntryGate gate;
}
