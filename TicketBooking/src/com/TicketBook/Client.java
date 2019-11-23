package com.TicketBook;

public class Client {
    public static void main(String[] args) {
        Tickets tickets=new Tickets();
        System.out.println(tickets);
        TicketThread th1=new TicketThread(tickets,"vijay",6);
        TicketThread th2=new TicketThread(tickets,"rahul",6);
        th1.start();
        th2.start();
    }



}
