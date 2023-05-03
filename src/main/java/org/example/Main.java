package org.example;



import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

import java.util.Scanner;

//Create an application that takes a birthdate and calculates the age in days
public class Main {

    public static void main(String[] args) {

        //ask user for their birthday and get their input
        System.out.println("Enter your birthdate (dd-mm-yyyy): ");
        Scanner scanner = new Scanner(System.in);
        String birthdate = scanner.next();
        scanner.close();

        try {
            LocalDate date = convertBirthDate(birthdate);
            LocalDate now = LocalDate.now();
            long numberOfDays = getNumberOfDaysOnEarth(date, now);
            System.out.println("Your age in days is: " + numberOfDays);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please enter the birthdate in dd-mm-yyyy format.");
        }
    }

    public static long getNumberOfDaysOnEarth(LocalDate date, LocalDate now) {
        //calculate days between user birthdate and current date
        return ChronoUnit.DAYS.between(date, now);
    }

    public static LocalDate convertBirthDate(String birthdate) {
        //convert the user inputted birthdate to LocalDate
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(birthdate, dtf);
    }




}