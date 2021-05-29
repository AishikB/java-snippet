package com.company;

public class Movie {

    private static String name;
    private static int ticketLeft = 10;

    public static String sellTicket(User user) throws NotAnAdultException, NoTicketsLeftException {
        if(user.getAge() < 18)
            throw new NotAnAdultException();
        if(ticketLeft <= 0)
            throw new NoTicketsLeftException("No more tickets left for movie " + Movie.name);
        ticketLeft--;
        return "Ticket - " + (10 - ticketLeft);
    }
}
