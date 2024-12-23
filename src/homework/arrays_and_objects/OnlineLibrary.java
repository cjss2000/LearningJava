package homework.arrays_and_objects;

import java.util.UUID;

public class OnlineLibrary {

    private Book[] books;
    private int initialCapacity;

    public OnlineLibrary(int initialCapacity) {
        this.books = new Book[initialCapacity];
    }

    public void addBooks(Book book, int index) {
        if (index < 0 || index >= books.length) {
            System.out.println("Index is out of bounds!");
        } else {
            books[index] = book;
        }
    }

    public void addBooks(String title, Author author, int year, int index) {
        Book book = new Book(title, author, year, true);
        addBooks(book, index);
    }

    public void growCapacity() {
        // Create a new array with double the size of the old one
        // use a for loop to copy everything from the old array to the new one
        // assign the new array to the old array

        // newArray = ...
        // books = newArray;
    }

    public void updateBook(Book newBook, int index) {
        // make sure that the index is valid
        // make sure that the index actually contains a book by checking that whatever on that index is not null
        // if the index is valid and the book is not null, update the book by assigning the new book to the index
        // books[index] = newBook
    }

    public void removeBookByID(UUID UUID_id) {
        // loop through the array
        // if the book's UUID_id is equal to the UUID_id that we are looking for, remove the book
        // books[i] = null
    }

    public void printBookList() {
        // loop through the array
        // make sure that the i index is not null
        // print the toString of the book object if not null
    }

    public void printBooksByAuthor(String name) {
        // loop through the array
        // if the book on index i is not null and the author of the book has a matching name to
        // the name variable/parameter - print it out (toString)
        // something like this: books[i].getAuthor().getFullName().equals(name)
    }

}