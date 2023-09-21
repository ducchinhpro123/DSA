package buoi_4;

import java.util.Scanner;

public class Input {
    private static Scanner sc = new Scanner(System.in);

    public static int inputInt() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.print("Invalid input, please enter an integer: ");
            }
        }
    }

    public static double inputDouble() {
        while (true) {
            try {
                return Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.print("Invalid input, please enter a double: ");
            }
        }
    }

    public static String inputString() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.out.print("Invalid input, please enter a non-empty string: ");
            } else {
                return result;
            }
        }
    }
}
