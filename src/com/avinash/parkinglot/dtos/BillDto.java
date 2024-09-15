package com.avinash.parkinglot.dtos;

import com.avinash.parkinglot.models.BillStatus;
import com.avinash.parkinglot.models.Ticket;

public class BillDto {
    private int amount;
    private Ticket ticket;
    private BillStatus billStatus;
    private String exitTime;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }

    public String getExitTime() {
        return exitTime;
    }

    public void setExitTime(String exitTime) {
        this.exitTime = exitTime;
    }
}
