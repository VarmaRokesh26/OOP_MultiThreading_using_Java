package oops.libraryManagentSystem;

import java.util.*;
public class LibraryApp {
    private static List<Books> books = new ArrayList<>();
    public static void main(String arg[]) {
        books.add(new Books("JAVA", "John Doe"));
        books.add(new Books("OOP", "Chris"));
        books.add(new Books("Power BI", "Dutton"));

        LibraryApp la = new LibraryApp();

        la.addBook("DAX", "Dutton");
        la.display(books);
    }

    public void addBook(String title, String author) {
        Books newBook = new Books(title, author);
        if(newBook.equals(null))
            System.out.println("Book is not Added");
        else    
            System.out.println("Book is added");
    }
    
    public void display(List<Books> books) {
        System.out.println("Display Book Details");
        for(int i=0;i<books.size();i++) {
            System.out.print("Book " + (i+1) +" " + books.get(i).getTitle() + "-" + books.get(i).getAuthorName() + "\n");
        }
    }
}
