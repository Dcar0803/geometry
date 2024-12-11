package geometry;

import java.util.Scanner;

/**
 * Main class for interacting with geometry objects via a REPL.
 * Allows adding, removing, and finding 2D and 3D geometries.
 */

public class Main {
	
	/**
     * Entry point of the program.
     * @param args Command-line arguments .
     */
	
    public static void main(String[] args) {
        LinkedList<Object> geometries = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option: (1) Add, (2) Remove, (3) Find, (4) Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter type (Rectangle, Circle, Triangle, Sphere, TriangularPrism, RectangularPrism):");
                    String type = scanner.nextLine();

                    switch (type.toLowerCase()) {
                        case "rectangle" -> {
                            System.out.println("Enter length and width:");
                            double length = scanner.nextDouble();
                            double width = scanner.nextDouble();
                            geometries.add(new Rectangle(length, width));
                        }
                        case "circle" -> {
                            System.out.println("Enter radius:");
                            double radius = scanner.nextDouble();
                            geometries.add(new Circle(radius));
                        }
                        case "triangle" -> {
                            System.out.println("Enter base, height, sideA, sideB:");
                            double base = scanner.nextDouble();
                            double height = scanner.nextDouble();
                            double sideA = scanner.nextDouble();
                            double sideB = scanner.nextDouble();
                            geometries.add(new Triangle(base, height, sideA, sideB));
                        }
                        case "sphere" -> {
                            System.out.println("Enter radius:");
                            double radius = scanner.nextDouble();
                            geometries.add(new Sphere(radius));
                        }
                        case "triangularprism" -> {
                            System.out.println("Enter base, height, and length:");
                            double base = scanner.nextDouble();
                            double height = scanner.nextDouble();
                            double length = scanner.nextDouble();
                            geometries.add(new TriangularPrism(base, height, length));
                        }
                        case "rectangularprism" -> {
                            System.out.println("Enter length, width, and height:");
                            double length = scanner.nextDouble();
                            double width = scanner.nextDouble();
                            double height = scanner.nextDouble();
                            geometries.add(new RectangularPrism(length, width, height));
                        }
                        default -> System.out.println("Invalid type.");
                    }
                }
                case 2 -> {
                    System.out.println("Enter index to remove:");
                    int index = scanner.nextInt();
                    Object item = geometries.find(index);
                    if (item != null) {
                        geometries.remove(item);
                        System.out.println("Removed: " + item);
                    } else {
                        System.out.println("Item not found.");
                    }
                }
                case 3 -> {
                    System.out.println("Enter index to find:");
                    int index = scanner.nextInt();
                    Object item = geometries.find(index);
                    if (item != null) {
                        System.out.println("Found: " + item);
                    } else {
                        System.out.println("Item not found.");
                    }
                }
                case 4 -> {
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }
}