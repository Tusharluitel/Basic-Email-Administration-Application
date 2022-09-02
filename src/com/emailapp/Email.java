package com.emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity=500;
    private String email;
    private int defaultPasswordLength=10;
    private String alternateEmail;
    private String companySuffix = "anycompany.com";

    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created: "+this.firstName+" "+this.lastName);

        // Call a method asking for the department
        this.department = setDeparment();
        System.out.println("Department: "+this.department);

        //Combine elements to generate email
        email= firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department.toLowerCase()+"."+companySuffix;
        System.out.println("Your email is: "+email);

        // Call a method that returns random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: "+ this.password);

    }
    // Ask for department
    private String setDeparment(){
        System.out.print("DEPARTMENT CODE\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int departmentChoice= in.nextInt();
        if (departmentChoice ==1 ){return "Sales";}
        else if(departmentChoice ==2){return "Development";}
        else if(departmentChoice ==3){return "Accounting";}
        else {return "";}
    }

    // Generate random password
    private String randomPassword(int length){
        String passwordSet="ABCDEFGHIJLMNOPQRSTUVWZYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i<length; i++){
            int rand =(int) (Math.random()*passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }
    // Set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail=altEmail;
    }
    // Change the password
    public void changePassword(String password){
        this.password = password;
    }
    public int getMailboxCapacity(){
        return mailboxCapacity;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }
    public String showInfo(){
        return "Display Name: "+firstName+" "+lastName+
                "\nCompany email: "+email+
                "\nMailbox Capacity: "+mailboxCapacity+"mb";
    }
}
