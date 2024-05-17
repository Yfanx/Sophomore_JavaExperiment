/*
 * 1 3 6 10 15
 * 2 5 9 14
 * 4 8 13
 * 7 12
 * 11
 */

import java.util.Scanner;

public class h4_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer : ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int count = 1;
            for (int i = 1; i <= n; i++) {
                int temp = count;
                for (int j = 1; j <= n - i + 1; j++) {
                    System.out.print(temp + " ");
                    temp += count + j;
                }
                count += i;
                System.out.println();
            }
        }
        scanner.close();
    }
}