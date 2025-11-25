import java.util.Scanner;
import java.util.Arrays;

public class Identical {
public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }

        // Make copies so we can sort without changing original arrays
        int[] copy1 = Arrays.copyOf(list1, list1.length);
        int[] copy2 = Arrays.copyOf(list2, list2.length);

        Arrays.sort(copy1);
        Arrays.sort(copy2);

        for (int i = 0; i < copy1.length; i++) {
            if (copy1[i] != copy2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter list1 (or type 'end' to exit): ");
            String input1 = scanner.nextLine();
            if (input1.equalsIgnoreCase("end")) {
                break;
            }

            System.out.print("Enter list2: ");
            String input2 = scanner.nextLine();
            if (input2.equalsIgnoreCase("end")) {
                break;
            }

            // Split the input by spaces
            String[] parts1 = input1.split(" ");
            String[] parts2 = input2.split(" ");

            // Convert strings to integers
            int[] list1 = new int[parts1.length];
            int[] list2 = new int[parts2.length];
            for (int i = 0; i < parts1.length; i++) {
                list1[i] = Integer.parseInt(parts1[i]);
            }
            for (int i = 0; i < parts2.length; i++) {
                list2[i] = Integer.parseInt(parts2[i]);
            }

            // Check if lists are identical
            if (equals(list1, list2)) {
                System.out.println("Two lists are identical");
            } else {
                System.out.println("Two lists are not identical");
            }
        }

        System.out.println("Bye!~.");
        scanner.close();
    }
}
