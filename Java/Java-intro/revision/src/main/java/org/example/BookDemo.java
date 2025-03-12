package src.main.java.org.example;

public class BookDemo {

    public static void main(String[] args) {
        Book gameOfThrones = new Book("holly", "Game of thrones", "Fantasy", 500);
        Book acotar = new Book("Sarah j Mass", "ACOTAR", "FANTASY", 700);
        Book mathBook = new Book("james", "Calculus", "Math", 1392);

    printBookDetails(gameOfThrones);
    printBookDetails(acotar);
    printBookDetails(mathBook);
    }//end main

    public static void printBookDetails(Book book){
        System.out.println(book.getTitle());
        System.out.println("by " + book.getAuthor());
        System.out.println("has " + book.getNumPages() + "Pages, and its genre is " + book.getGenre() );
        System.out.println();
    }
}
