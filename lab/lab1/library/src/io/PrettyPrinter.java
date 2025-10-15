package io;

import java.util.ArrayList;
import model.Book;

public class PrettyPrinter {

    public static void print(ArrayList<Book> books) {
        if (books.isEmpty()) {
            System.out.println("There are no books in the SW :(");
            return;
        }

        System.out.println("Books:");
        for (int i = 0; i < 80; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (Book book : books) {
            System.out.println(book);

            for (int i = 0; i < 80; i++) {
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println();

        return;
    }
}
