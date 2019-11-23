package com.TicketBook;

public class Tickets {
    static int available_seats=10;
    public  synchronized void tickettobook(int tickets,String name){
        if (tickets<=available_seats && available_seats>0){
            available_seats=available_seats-tickets;
            System.out.println("HI "+name+" your "+tickets+" Booked Successfully");
            System.out.println("Now Remaining Tickets:"+available_seats);
        }
        else{
            System.out.println("HI "+name+ available_seats+" Seats available");
        }
    }
}
