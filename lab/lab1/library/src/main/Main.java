package main;

import model.Book;
import io.InputUserInterface;
import io.PrettyPrinter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the library SW!");

        Scanner input = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<Book>();

        while (true) {
            System.out.println("What do you want to do? (INSERT CORRECT VALUES)");

            System.out.println("0. Exit");
            System.out.println("1. Add a book");
            System.out.println("2. Print the catalog");

            int choice = input.nextInt();

            if (choice == 0) {
                break;
            } else if (choice == 1) {
                Book book = InputUserInterface.acquireBook();
                //if(se il libro è identico dentro a un altro nella ArrayList)
                if(book == null) {
                    continue;
                } else if(books.contains(book)) {
                    System.out.println("Book already exists!");
                } else if (!books.add(book)) {
                    System.out.println("Error! Book wasn't added!");
                } else {
                    System.out.println("Book added");
                }
            } else if (choice == 2) {
                PrettyPrinter.print(books);
            } else {
                System.out.println("Invalid Input");
                break;
            }
        }
        return;
    }
}