//Main.java
//IS 147 Final Project - Book Inventory
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
        Book[] tempList = new Book[99];
        while (flag) {


            int choice = Menu.printMenu();
            switch (choice) {
                case 1:
                    if (counter == 0) {
                        System.out.println("There are no books in the inventory");
                }
                    else{
                    Display.displayInventory(myList, counter);
                }
                    break;
                case 2:
                    Display.displayAuthor(myList, counter);
                    break;
                case 3:
                        Book newBook = Helper.addBook();
                        myList[counter] = newBook;
                        counter++;
                        break;
                case 4:
                    int count = 0;
                    System.out.println("Enter the book you want to remove");
                    String removeBookName = input.nextLine();

                    for(int i = 0; i < counter; i++)
                    {
                        if(removeBookName.equals(myList[i].name))
                        {
                            myList = Helper.removeBook(myList, removeBookName, counter);
                            counter--;
                            count++;
                            break;
                        }

                    }

                    if (count == 0){
                        System.out.println("Book is not in inventory!");
                    }

                    break;

                case 5:
                    System.out.println("There are currently " + counter + " books in the inventory");
                    break;
                case 6:
                    System.out.println("Loading samp9le inventory");
                    tempList = Helper.loadSample();

                    for(int i = 0; i < tempList.length; i++){
                        myList[counter] = tempList[i];
                        counter++;
                    }
                    break;
                case 7:
                    System.out.println("Have a nice day!");
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }
}
