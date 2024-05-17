import java.util.Scanner;

public class h4_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int sum = 0;
            while (n / 10 != 0) {
                sum += n % 10;
                n /= 10;
            }
            sum += n;
            System.out.println(sum);
        }
        scanner.close();
    }
}