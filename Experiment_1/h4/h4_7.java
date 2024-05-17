import java.util.Scanner;

public class h4_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer :");
        int n = scanner.nextInt();
        int sum = 0;
        int temp = 0;
        System.out.print(n + " " + "=" + " ");
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
                temp++;
            }
        }
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                if (temp == 1) {
                    System.out.print(i);
                } else {
                    System.out.print(i + " " + "+" + " ");
                }
                temp--;
            }
        }
        System.out.println();
        if (sum == n) {
            System.out.println("This is a perfect number.");
        } else {
            System.out.println("This is not a perfect number.");
        }
        scanner.close();
    }
}