//Helper.java
//IS 147 Final Project - Book Inventory
//Oct 29, 2018

package com.company;

import java.util.Scanner;

public class Helper {


    public static Book addBook() {
        Scanner input = new Scanner(System.in);


        System.out.println("What is the name of the book?: ");
        String bookName = input.nextLine();


        System.out.println("Who is the author of this book?: ");
        String bookAuthor = input.nextLine();


        System.out.println("How many pages does this book have?: ");
        int bookPages = input.nextInt();

        Book creatingBook = new Book(bookName, bookAuthor, bookPages);

        return creatingBook;


    }


    public static Book[] removeBook(Book[] myList, String removeBookName, int counter)
    {

        for(int i = 0; i < counter; i++)
        {
            if(removeBookName.equals(myList[i].name))
            {
                for(int j = i; j < (counter - i); j++){
                    myList[i] = myList[i + 1];
                }
                break;
            }

        }

        return myList;

    }


    public static Book[] loadSample(){
        Book sampleBook1 = new Book("Harry Potter and the Half-Blood Prince","JK Rowling", 607);
        Book sampleBook2 = new Book("Harry Potter and the Chamber of Secrets", "JK Rowling", 341);
        Book sampleBook3 = new Book("The Hunger Games", "Suzanne Collins", 374);
        Book sampleBook4 = new Book("MockingJay", "Suzanne Collins", 390);
        Book sampleBook5 = new Book("Catching Fire", "Suzanne Collins", 400);
        Book sampleBook6 = new Book("Eragon", "Christopher Paolini", 544);
        Book sampleBook7 = new Book("Eldest", "Christopher Paolini", 694);
        Book sampleBook8 = new Book("Brisingr", "Christopher Paolini", 831);
        Book sampleBook9 = new Book("Inheritance", "Christopher Paolini", 860);
        Book sampleBook10 = new Book("A Game of Thrones", "George RR Martin", 694);
        Book sampleBook11 = new Book("A Clash of Kings", "George RR Martin", 761);
        Book sampleBook12 = new Book("A Storm of Sword", "George RR Martin", 973);
        Book sampleBook13 = new Book("A Feast for Crows", "George RR Martin", 753);
        Book sampleBook14 = new Book("A Dance with Dragons", "George RR Martin", 1016);


        Book[] temp = {sampleBook1, sampleBook2, sampleBook3, sampleBook4, sampleBook5,
                sampleBook6, sampleBook7, sampleBook8, sampleBook9, sampleBook10, sampleBook11,
                sampleBook12, sampleBook13, sampleBook14};

        return temp;



    }
}
