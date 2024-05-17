import java.util.Scanner;

public class h4_4 {
    public static int factorialSum(int n) {
        int sum = 0;
        int temp = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                temp *= j;
            }
            sum += temp;
            temp = 1;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer : ");
        int n = scanner.nextInt();
        System.out.println("1!+2!+...+n! = " + factorialSum(n));
        scanner.close();
    }
}
