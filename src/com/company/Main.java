//BookInventory.java
//IS 147 Final Project
//Oct 29, 2018


package com.company;

import java.util.Scanner;
//import java.util.*;


public class Main {

    //Book[] myList = new Book[9];




    public static void displayInventory(Book[] myList, int counter){
        System.out.println("***************************");
        for(int i = 0; i < counter; i++) {
            System.out.println("");
            System.out.println("Book Name: " + myList[i].name);
            System.out.println("Author: " + myList[i].author);
            System.out.println("Pages: " + myList[i].page);
            System.out.println("");

        }
        System.out.println("***************************");
        return;

    }


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
                    displayInventory(myList, counter);
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
