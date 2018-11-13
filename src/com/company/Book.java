//Book.java
//IS 147 Final Project - Book Inventory
//Oct 29, 2018

package com.company;


public class Book {
        public String name = "";
        public String author = "";
        public int page = 0;

        Book(){
        }
        Book(String name, String author, int page){
                this.name = name;
                this.author = author;
                this.page = page;
        }

}
