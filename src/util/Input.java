package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public static String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String input = scanner.nextLine().trim().toLowerCase();
        return input.equals("y") || input.equals("yes");
    }

    public int getInt(int min, int max) {
        int num;
        do {
            System.out.print("Enter an integer between " + min + " and " + max + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter an integer.");
                scanner.next();
            }
            num = scanner.nextInt();
        } while (num < min || num > max);
        scanner.nextLine(); // Clear the newline character from the buffer
        return num;
    }

    public int getInt() {
        System.out.print("Enter an integer: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter an integer.");
            scanner.next();
        }
        int num = scanner.nextInt();
        scanner.nextLine(); // Clear the newline character from the buffer
        return num;
    }

    public double getDouble(double min, double max) {
        double num;
        do {
            System.out.print("Enter a decimal number between " + min + " and " + max + ": ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input! Please enter a decimal number.");
                scanner.next();
            }
            num = scanner.nextDouble();
        } while (num < min || num > max);
        scanner.nextLine(); // Clear the newline character from the buffer
        return num;
    }

    public double getDouble() {
        System.out.print("Enter a decimal number: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input! Please enter a decimal number.");
            scanner.next();
        }
        double num = scanner.nextDouble();
        scanner.nextLine(); // Clear the newline character from the buffer
        return num;
    }
}
