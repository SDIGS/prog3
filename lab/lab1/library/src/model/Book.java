package model;
import java.util.ArrayList;

public class Book {
    private String title;
    private ArrayList<String> authors;

    public Book(String title, ArrayList<String> authors) {
        this.title = title;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public String toString(){
        return "Title: " + title + "\nAuthors: " + authors;
    }

    public boolean equals(Object o) {
        if (this == o) return true;              // stesso oggetto
        if (!(o instanceof Book)) return false;  // tipo diverso
        Book other = (Book) o;                   // cast
        return title.equals(other.title)
                && authors.equals(other.authors);
    }
}
