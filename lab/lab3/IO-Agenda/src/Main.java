import model.Address;

import java.io.*;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner lineScanner = null; // legge le righe del file
        Address[] agenda = new Address[50];
        int i = 0;
        try {
            lineScanner = new Scanner(new File("./IO-Agenda/addresses.txt"));
            //lineScanner.useDelimiter("\\s*;\\s*");
            lineScanner.useDelimiter(";\\s*|\r\n");
            // per compatibilità con CSV che non ha il ";" a fondo riga
            while (lineScanner.hasNext() && i<agenda.length) {
                String name = lineScanner.next();
                String surname = lineScanner.next();
                String street = lineScanner.next();
                int civic = lineScanner.nextInt();
                String town = lineScanner.next();
                agenda[i] = new Address (name, surname, street, civic, town);;
                i++;
                System.out.println("end of line");
                }
            }
        catch (InputMismatchException e)
            {System.out.println("Errore nell'input! " + e.getMessage());}
        catch (IOException | NoSuchElementException e) {System.out.println(e.getMessage());} finally {if (lineScanner!=null)
            lineScanner.close();}
        System.out.println("I have added "+i+ " addresses in the agenda");
        for (int k=0; k<i; k++)
            System.out.println(agenda[k]);
    }
}