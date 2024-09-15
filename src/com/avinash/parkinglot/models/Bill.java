package com.avinash.parkinglot.models;

import com.avinash.parkinglot.dtos.BillDto;

public class Bill extends  BaseModel{
    private int amount;
    private Ticket ticket;
    private BillStatus billStatus;
    private String exitTime;
    private Payment payment;

    public Bill(int amount, Ticket ticket, BillStatus billStatus, String exitTime, Payment payment) {
        this.amount = amount;
        this.ticket = ticket;
        this.billStatus = billStatus;
        this.exitTime = exitTime;
        this.payment = payment;
    }

//    @Override
//    BillDto toDto() {
//        BillDto dto = new BillDto();
//        dto.setAmount(amount);
//        dto.setTicket(ticket);
//        dto.setBillStatus(billStatus);
//        dto.setExitTime(exitTime);
//        return dto;
//    }
}
