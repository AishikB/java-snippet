package com.company;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("Aishik", 21);
        User user2 = new User("Jack", 17);
        try {
            for (int i=0; i<12; i++) {
                System.out.println(i);
                User user = i % 2 == 0 ? user1 : user1;
                System.out.println(Movie.sellTicket(user));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
