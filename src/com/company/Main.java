//BookInventory.java
//IS 147 Final Project
//Oct 29, 2018


package com.company;

import java.util.Scanner;
//import java.util.*;

    class Book {
    public String name = "hello";
    public String author = "";
    public int page = 0;
    System.out.println("Hello World");
    }



public class Main {

    //Book[] myList = new Book[9];


    public static int printMenu() {

        Scanner input = new Scanner(System.in);
        int choice = 0;

        System.out.println("------------------------------");
        System.out.println("Enter 1 to display the inventory");
        System.out.println("Enter 2 to display the books by one author");
        System.out.println("Enter 3 to add a book");
        System.out.println("Enter 4 to remove a book");
        System.out.println("Enter 5 to view the total number of books in the inventory");
        System.out.println("Enter 6 to see the total amount of the entire inventory");
        System.out.println("Enter 7 to exit");
        try {
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            return choice;

        }
        catch(Exception e){
            System.out.println("Invalid choice!");
        }

        return choice;

}


    public static Book addBook() {



        Book creatingBook = new Book();
        Scanner input = new Scanner(System.in);


        System.out.println("What is the name of the book?: ");
        String bookName = input.nextLine();



        System.out.println("Who is the author of this book?: ");
        String bookAuthor = input.nextLine();



        System.out.println("How many pages does this book have?: ");
        int bookPages = input.nextInt();


        creatingBook.name = bookName;
        creatingBook.author = bookAuthor;
        creatingBook.page = bookPages;

        return creatingBook;


    }

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


            int choice = printMenu();
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
                        Book newBook = addBook();
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
