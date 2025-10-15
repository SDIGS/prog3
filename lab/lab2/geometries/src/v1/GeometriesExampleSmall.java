package v1;

import v1.model.Parallelogram;
import v1.model.Polygon;
import v1.model.Rectangle;
import v1.model.Triangle;

import java.util.Scanner;

/**
 * Main program class. The program presents to the user an interactive menu allowing
 * him/her to input some polygons and to query the list of inserted polygons.
 */
public class GeometriesExampleSmall {
    /**
     * @param args Not used.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Geometries geometries = new Geometries();


        interactiveMenu(input);
    }

    /**
     * Presents to the user an interactive menu
     * @param input An input scanner pre initialized by the caller
     */
    private static void interactiveMenu(Scanner input) {
        boolean mainLoop = true;
        int choice = -1;


        while(choice!=0) {

            System.out.println("Menu\n");
            System.out.print("1.) Add a Rectangle.\n");
            System.out.print("2.) Add a Triangle.\n");
            System.out.print("3.) Add a Square.\n");
            System.out.print("4.) Add a Parallelogram.\n");
            System.out.print("5.) List geometries.\n");
            System.out.print("6.) Number of geometries.\n");
            System.out.print("0.) Exit");
            System.out.print("\nEnter Your Menu Choice: ");

            choice = input.nextInt();
            Polygon p;

            switch (choice) {
                case 1 -> {
                    p = new Rectangle();
                    addPolygon(input, p);
                }
                case 2 -> {
                    p = new Triangle();
                    addPolygon(input, p);
                }
                case 4 -> {
                    p = new Parallelogram();
                    addPolygon(input, p);
                }
                default -> {
                }
            }
        }
    }

    /**
     * Asks to the user the relevant values to fill out the properties of the given polygon and
     * updates the polygon with the given data.
     * @param input the input scanner to be used for the input of the values
     * @param geometries the container where the polygon has to be inserted
     * @param p the polygon to be updated. It will be a concrete subclass of Polygon.
     */
    private static void addPolygon(Scanner input, Polygon p) {
        String[] attributesNames = p.describeAttributes();
        double[] attributesValues = new double[attributesNames.length];
        int i = 0;
        for (String attr: attributesNames) {
            System.out.println("Enter "+attr+" (double):");
            double current = input.nextDouble();
            attributesValues[i] = current;
            i++;
        }
        p.setAttributes(attributesValues);
    }


}
