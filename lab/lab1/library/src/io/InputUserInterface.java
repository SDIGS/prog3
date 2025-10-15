package io;

import model.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class InputUserInterface {

    public static Book acquireBook() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Book Title: ");
        String title = input.nextLine();
        if(title.isEmpty()) {
            System.out.println("Book Title is empty");
            return null;
        }

        String author;
        ArrayList<String> authors = new ArrayList<String>();

        System.out.println("Enter Book Authors: (press only enter to terminate insertion)");
        while(true) {
            author = input.nextLine();
            if (author.isEmpty()) {
                if (authors.isEmpty()) {
                    authors.add("Anonymous");
                }
                break;
            }
            authors.add(author);
        }
        return new Book(title, authors);
    }
}
