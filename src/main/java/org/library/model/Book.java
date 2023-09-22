package org.library.model;

public class Book {
     private int id;
     private String ISBN;
     private String name;

     public Book() {

     }

     public Book(String ISBN, String name) {
         this.ISBN = ISBN;
         this.name = name;
     }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
