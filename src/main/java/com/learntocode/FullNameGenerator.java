package com.learntocode;

import java.util.Scanner;

public class FullNameGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        System.out.print("First Name: ");
        String firstName = input.nextLine();
        System.out.print("Middle Name: ");
        String middleName = input.nextLine();
        System.out.print("Last Name: ");
        String lastName = input.nextLine();
        System.out.print("Suffix: ");
        String suffix = input.nextLine();

        int takeMiddleInitial = middleName.indexOf(0);

        String vendor = middleName.substring(0);

        if (suffix.isEmpty()) {
            System.out.println(firstName + " " + vendor + "." + " " + lastName);
        } else
            System.out.println(firstName + " " + vendor + "." + " " + lastName + ", " + suffix);

        if (middleName.isEmpty()){
            System.out.println(firstName + " " + lastName + ", " + suffix);
        } else
            System.out.println(firstName + " " + lastName);
        }
    }

