package com.TicketBook;

public class TicketThread extends Thread {
    Tickets tickets;
    String name;
    int no_of_tickets_book;

    public TicketThread(Tickets tickets, String name, int no_of_tickets_book) {
        this.tickets = tickets;
        System.out.println(tickets);
        this.name = name;
        this.no_of_tickets_book = no_of_tickets_book;
    }

    @Override
    public void run() {
        tickets.tickettobook(no_of_tickets_book,name);
    }
}
