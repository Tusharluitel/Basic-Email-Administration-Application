package com.emailapp;

public class EmailApp {
    public static void main(String[] args) {
        Email em1 = new Email("Your","Name");
        em1.setAlternateEmail("name@gmail.com");
        System.out.println("Alternate Email: "+em1.getAlternateEmail());
        System.out.println(em1.showInfo());

    }
}
