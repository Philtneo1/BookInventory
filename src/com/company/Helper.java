package com.company;

import java.util.Scanner;

public class Helper {

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
}
