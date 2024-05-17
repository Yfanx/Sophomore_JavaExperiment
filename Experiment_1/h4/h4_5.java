
//在键盘上输入数n，编程计算$ sum=1-\frac{1}{2!}+\frac{1}{3!}-\cdots(-1)^{n-1}\frac{1}{n!} $​。
import java.util.*;

public class h4_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer : ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            double sum = 0.0;
            double temp = 1.0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    temp *= j;
                }
                sum += Math.pow(-1, i - 1) * 1.0 / temp;
                temp = 1.0;
            }
            System.out.println(sum);
        }
        scanner.close();
    }
}