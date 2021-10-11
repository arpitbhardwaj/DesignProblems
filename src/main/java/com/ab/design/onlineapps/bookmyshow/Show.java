package com.ab.design.onlineapps.bookmyshow;

import java.util.Date;

public class Show {
    private static int idCounter=0;
    private int id;
    private Date showTime;
    private Movie movie;            //which movie
    private Theatre theater;        //in which theatre
    private int availableSeats;

    public Show(Date showTime, Movie movie, Theatre theater) {
        idCounter += 1;
        this.id = idCounter;
        this.showTime = showTime;
        this.movie = movie;
        this.theater = theater;
        this.availableSeats = theater.getCapacity();
        theater.getShows().add(this);
    }

    public Movie getMovie() {
        return movie;
    }
    public void setTheater(Theatre theater) {
        this.theater = theater;
    }
    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
    public int getAvailableSeats() {
        return availableSeats;
    }
    public void updateShow(){}

    public synchronized Ticket bookTicket(RegisteredUser user, int seats){
        if(availableSeats >= seats && seats >0){
            Ticket ticket = new Ticket();
            availableSeats -= seats;
            ticket.setOwner(user.getName());
            ticket.setBookedShow(this);
            ticket.setBookingTime(new Date());
            ticket.setNumberOfSeats(seats);
            System.out.println("Successfully booked");
            user.bookingHistory.add(ticket);
            return ticket;
        }
        else{
            System.out.println("Seats not Available");
            return null;
        }
    }
    @Override
    public String toString() {
        return "Show{" +
                "id=" + id +
                ", showTime=" + showTime +
                ", movie=" + movie.getName() +
                ", theater=" + theater.getName() +
                ", availableSeats=" + availableSeats +
                '}';
    }
}

class TicketBookingThread extends Thread {
    private Show show;
    private RegisteredUser user;
    private int numberOfSeats;
    private Ticket ticket;

    public TicketBookingThread(Show show, RegisteredUser user, int numberOfSeats) {
        this.show = show;
        this.user = user;
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void run() {
        this.ticket = show.bookTicket(user,numberOfSeats);
    }

    public Ticket getTicket() {
        return ticket;
    }
}