package org.example;

import java.text.ParseException;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import java.util.Scanner;

//Create an application that takes a birthdate and calculates the age in days
public class Main {

    static LocalDate now = LocalDate.now();

    public static void main(String[] args) {

        //ask user for their birthday and get their input
        System.out.println("Enter your birthdate (dd-mm-yyyy): ");
        Scanner scanner = new Scanner(System.in);
        String birthdate = scanner.next();
        scanner.close();

        LocalDate date = convertBirthDate(birthdate);
        getNumberOfDaysOnEarth(date, now);
    }

    public static long getNumberOfDaysOnEarth(LocalDate date, LocalDate now) {
        //calculate days between user birthdate and current date
        long diffInDays = ChronoUnit.DAYS.between(date, now);
        System.out.println("Your age in days is: " + diffInDays);
        return diffInDays;
    }

    public static LocalDate convertBirthDate(String birthdate) {
        //convert the user inputted birthdate to LocalDate
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(birthdate, dtf);
        return date;
    }




}