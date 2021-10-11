package com.ab.design.onlineapps.bookmyshow;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class BookMyShow {
    List<Theatre> theaters;
    static Map<String,List<Show>> movieMap;

    private void generateMovieMap(){
        for (Theatre theater :theaters) {
            List<Show> showArray = theater.getShows();
            for(Show show : showArray) {
                if (show != null) {
                    if (movieMap.containsKey(show.getMovie().getName())) {
                        movieMap.get(show.getMovie().getName()).add(show);
                    } else {
                        ArrayList<Show> movieShowList = new ArrayList<>();
                        movieShowList.add(show);
                        movieMap.put(show.getMovie().getName(), movieShowList);
                    }
                }
            }
        }
    }
    public BookMyShow(List<Theatre> theaters) {
        this.theaters = theaters;
        this.movieMap = new HashMap<>();
        generateMovieMap();
        System.out.println(movieMap);
    }
    public static List<Show> searchShows(String movieName){
        if (movieMap.containsKey(movieName)){
            return movieMap.get(movieName);
        }
        return null;
    }

    public static void main(String[] args) {
        // Creating Guest User
        GuestUser piyush = new GuestUser("Piyush");

        // Creating Registered User
        RegisteredUser ayush = new RegisteredUser("Ayush");
        RegisteredUser saurabh = new RegisteredUser("Saurabh");

        // Creating Movies
        Movie ironMan = new Movie("Iron Man", Language.ENGLISH,Genre.ACTION);
        Movie avengers = new Movie("Avengers: End Game", Language.ENGLISH,Genre.ACTION);
        Movie walkToRemember = new Movie("The Walk To Remember", Language.ENGLISH,Genre.ROMANCE);
        Movie housefull = new Movie("HouseFull 2", Language.HINDI,Genre.COMEDY);

        // Creating Theaters (Single Screen)
        Theatre pvr_gip = new Theatre("PVR","GIP Noida",30);
        Theatre big_cinema = new Theatre("Big Cinema","Sector 137 Noida",40);

        // Creating four shows for movies
        Show show1=null, show2=null, show3=null, show4=null;
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, MMM dd, yyyy HH:mm:ss a");

        try {
            String dateInString = "Friday, Jun 7, 2020 09:00:00 AM";
            Date date = formatter.parse(dateInString);
            show1 = new Show(date,ironMan,pvr_gip);

            dateInString = "Friday, Jun 7, 2020 12:00:00 PM";
            date = formatter.parse(dateInString);
            show2 = new Show(date,housefull,pvr_gip);

            dateInString = "Friday, Jun 7, 2020 09:00:00 AM";
            date = formatter.parse(dateInString);
            show3 = new Show(date,walkToRemember,big_cinema);

            dateInString = "Friday, Jun 7, 2020 12:00:00 PM";
            date = formatter.parse(dateInString);
            show4 = new Show(date,walkToRemember,big_cinema);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        /* --------Data generation code end -----------*/

        // Now We have two theaters with their shows, lets add these theaters to our Book My Show app
        List<Theatre> theaterList= new ArrayList<>();
        theaterList.add(pvr_gip);
        theaterList.add(big_cinema);
        BookMyShow bookMyShow = new BookMyShow(theaterList);

        // Searching Book My Show for all the shows of movie WALK TO REMEMBER
        List<Show> searchedShow = BookMyShow.searchShows("The Walk To Remember");
        // Above code returns two shows of WALK TO REMEMBER
        /*
        searchedShow --> [Show{id=3, showTime=Sun Jun 07 09:00:00 IST 2020,
        movie=The Walk To Remember, theater=Big Cinema, availableSeats=40},
        Show{id=4, showTime=Sun Jun 07 12:00:00 IST 2020, movie=The Walk To Remember,
        theater=Big Cinema, availableSeats=40}]
        */
        // Now suppose AYUSH and SAURABH both wants to book 10 tickets each for first show
        // Then Book My show will create two Ticket Booking threads for their requests

        Show bookingShow = searchedShow.get(0);

        TicketBookingThread t1 = new TicketBookingThread(bookingShow,ayush,10);
        TicketBookingThread t2 = new TicketBookingThread(bookingShow,saurabh,10);

        // Start both the Ticket Booking Threads for execution
        t1.start();
        t2.start();

        // Waiting till both the thread completes the execution
        try {
            t1.join();
            t2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // After execution t1 will carry AYUSH ticket and t2 will carry SAURABH ticket
        Ticket ayush_ticket = t1.getTicket();
        Ticket saurabh_ticket = t2.getTicket();

        // Printing their tickets
        System.out.println(t1.getTicket());
        System.out.println(t2.getTicket());

        // Now, 20 seats are booked for this show and 20 seats are available,
        // Suppose AYUSH wants another 15 seats and SAURABH wants another 10 seats to be booked

        // Ticket Booking Thread for the request made by AYUSH for another 15 Seats
        TicketBookingThread t3 = new TicketBookingThread(bookingShow,ayush,15);

        // Ticket Booking Thread for the request made by SAURABH for another 10 Seats
        TicketBookingThread t4 = new TicketBookingThread(bookingShow,saurabh,10);

        // Start both the Ticket Booking Threads for execution
        t3.start();
        t4.start();

        // Waiting till both the thread completes the execution
        try {
            t4.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // After execution t3 will carry AYUSH ticket and t4 will carry SAURABH ticket
        Ticket ayushNewTicket = t3.getTicket();
        Ticket saurabhNewTicket = t4.getTicket();

        System.out.println(ayushNewTicket);
        System.out.println(saurabhNewTicket);
    }
}
