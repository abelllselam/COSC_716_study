package Introductory_concept_encapsulation;

class Book {
    private String title;
    private String author;
    private double price;
    private int publicationYear;

    public String getAuthor() {
        return author;
    }

    public String getTitle(){
        return title;
    }

    public double getPrice(){
        return price;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setPrice(double price){
        if (price < 0){
            System.out.println ("Price can not be negative.");
            return;
        }

        this.price = price;
        
    }

    public void setPublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }

}

class Library {
    Book b = new Book();

    public void addBook() {
        b.setAuthor("Abel"); 
        b.setTitle("My book");
        b.setPrice(10);
        b.setPublicationYear(2025);
        
    }

    public void display(){
        System.out.println("Author: " + b.getAuthor());
        System.out.println("The name of the book: " + b.getTitle());
        System.out.println("Price $" + b.getPrice());
        System.out.println("Publication Year " + b.getPublicationYear());
    }
}


public class Main {
    public static void main(String [] args){
        Library lib  = new Library();
            lib.addBook();
            lib.display();
    }

}


