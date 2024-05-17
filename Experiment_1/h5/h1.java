import java.util.*;

public class h1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        double average = 0.0;
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            average += arr[i];
        }
        average /= n;
        System.out.println("The numbers greater than the average are: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] > average) {
                System.out.print(arr[i] + "\t");
            }
        }
        scanner.close();
    }
}