package homework.arrays_and_objects;

import java.util.UUID;

public class Book {

    private UUID id;
    private  String title;
    private  Author author;
    private  int year;
    private  boolean isAvailable;

    Book(String title, Author author, int year, boolean isAvailable){
        this.id = UUID.randomUUID();
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = true;
    }

    Book(String title, String name, String biography, int year, boolean isAvailable){
        this.id = UUID.randomUUID();
        this.title = title;
        this.author = new Author(name, biography);
        this.year = year;
        this.isAvailable = true;
    }

    public UUID getUUID_id() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString(){
        return "Your book information: " + this.getTitle() + " by: " +  this.getAuthor() + " ID number: " + this.id + " published: " + this.getYear();
    }

}