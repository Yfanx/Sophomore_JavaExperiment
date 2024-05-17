import java.util.*;

public class h3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int sum = 0;
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = scanner.nextInt();
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        sum = sum + arr[0][2] + arr[2][0];
        System.out.println("The sum of the diagonal elements is: " + sum);
        scanner.close();
    }
}