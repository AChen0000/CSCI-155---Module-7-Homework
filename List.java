import java.util.Scanner;

public class List {

    public static int partition(int[] list) {
        int pivot = list[0]; 
        int left = 1;
        int right = list.length - 1;

        while (left <= right) {
            // Find element 
            while (left <= right && list[left] <= pivot) {
                left++;
            }
            // Find element 
            while (left <= right && list[right] > pivot) {
                right--;
            }
           
            if (left < right) {
                int temp = list[left];
                list[left] = list[right];
                list[right] = temp;
                left++;
                right--;
            }
        }

        // Swap pivot with list[right] to put pivot in correct position
        int temp = list[0];
        list[0] = list[right];
        list[right] = temp;

        return right; // index of pivot
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter list (or type 'end' to exit): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }

            String[] parts = input.split(" ");
            int n = Integer.parseInt(parts[0]);
            int[] list = new int[n];
            for (int i = 0; i < n; i++) {
                list[i] = Integer.parseInt(parts[i + 1]);
            }

            partition(list);

            System.out.print("After the partition, the list is: ");
            for (int num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        //finish
        System.out.println("BYE!~");
        scanner.close();
    }
}
