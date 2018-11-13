//Display.java
//IS 147 Final Project - Book Inventory
//Oct 29, 2018

package com.company;

import java.util.Scanner;

public class Display {

    public static void displayInventory(Book[] myList, int counter){
        System.out.println("***************************");
        for(int i = 0; i < counter; i++) {
            System.out.println("\nBook Name: " + myList[i].name);
            System.out.println("Author: " + myList[i].author);
            System.out.println("Pages: " + myList[i].page + "\n");

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



}


