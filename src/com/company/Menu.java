//Menu.java
//IS 147 Final Project - Book Inventory
//Oct 29, 2018
package com.company;

import java.util.Scanner;

public class Menu {


    public static int printMenu() {

        Scanner input = new Scanner(System.in);
        int choice = 0;

        System.out.println("------------------------------");
        System.out.println("Enter 1 to display the inventory");
        System.out.println("Enter 2 to display the books by one author");
        System.out.println("Enter 3 to add a book");
        System.out.println("Enter 4 to remove a book");
        System.out.println("Enter 5 to view the total number of books in the inventory");
        System.out.println("Enter 6 to load a sample book inventory");
        System.out.println("Enter 7 to exit");
        try {
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            return choice;

        } catch (Exception e) {
            System.out.println("Type a number!");
        }

        return choice;

    }
}