import java.util.*;

public class h2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        arr[0] = scanner.nextInt();
        int max = arr[0], min = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The maxinum number is: " + max);
        System.out.println("The minimum number is: " + min);
        scanner.close();
    }
}