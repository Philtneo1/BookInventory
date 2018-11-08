//BookInventory.java
//IS 147 Final Project
//Oct 29, 2018


package com.company;

import java.util.Scanner;
//import java.util.*;


public class Main {

    //Book[] myList = new Book[9];

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Boolean flag = true;
        int counter = 0;

        Book[] myList = new Book[99];
        while (flag) {


            int choice = Helper.printMenu();
            switch (choice) {
                case 1:
                    if (counter == 0) {
                        System.out.println("There are no books in the inventory");
                }
                else{
                    Helper.displayInventory(myList, counter);
                }
                    break;
                case 2:
                    System.out.println("Class for displaying books by an author");
                    break;
                case 3:
                        Book newBook = Helper.addBook();
                        myList[counter] = newBook;
                        counter++;
                        break;
                case 4:
                    System.out.println("Class removing a book");
                    break;
                case 5:
                    System.out.println("There are currently " + counter + " books in the inventory");
                    break;
                case 6:
                    System.out.println("Class total amount of entire research");
                    break;
                case 7:
                    System.out.println("Have a nice day!");
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid Number");
                    break;
            }
        }
    }
}
