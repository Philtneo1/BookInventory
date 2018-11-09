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
        System.out.println("Enter 6 to load a sample book inventory");
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

    public static void displayAuthor(Book[] myList, int counter) {
        Scanner input = new Scanner(System.in);
        Book creatingBook = new Book();

        System.out.println("Enter the author whose books you want to display: ");
        String authorName = input.nextLine();
        Book[] temp = new Book[counter];
        int anotherCount = 0;

        for (int i = 0; i < counter; i++) {
            if (authorName.equals(myList[i].author)) {
                temp[anotherCount] = myList[i];
                anotherCount++;
            }
        }


        if (anotherCount > 0) {
            System.out.println("Author: " + authorName);
            for (int j = 0; j < anotherCount; j++) {
                System.out.println("Book Name: " + temp[j].name);
            }


        }
    }


    public static Book[] loadSample(){
        Book sampleBook1 = new Book();
        Book sampleBook2 = new Book();
        Book sampleBook3 = new Book();
        Book sampleBook4 = new Book();
        Book sampleBook5 = new Book();


        sampleBook1.name = "Harry Potter and the Half-Blood Prince";
        sampleBook1.author = "JK Rowling";
        sampleBook1.page = 607;
        sampleBook2.name = "Harry Potter and the Chamber of Secrets";
        sampleBook2.author = "JK Rowling";
        sampleBook2.page = 341;
        sampleBook3.name = "The Hunger Games";
        sampleBook3.author = "Suzanne Collins";
        sampleBook3.page = 374;
        sampleBook4.name = "Mockingjay";
        sampleBook4.author = "Suzanne Collins";
        sampleBook4.page = 390;
        sampleBook5.name = "Catching Fire";
        sampleBook5.author = "Suzanne Collins";
        sampleBook5.page = 400;

        Book[] temp = {sampleBook1, sampleBook2, sampleBook3, sampleBook4, sampleBook5};
        return temp;



    }
}
