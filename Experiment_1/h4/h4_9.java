
//从键盘上输入一个浮点型数，然后将该浮点数的整数部分和小数部分分别输出。例如，输入3.14，输出3和0.14。
import java.util.*;

public class h4_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个浮点数：");
        if (scanner.hasNextDouble()) {
            double num = scanner.nextDouble();
            int integerPart = (int) num;
            double decimalPart = num - integerPart;
            System.out.println("整数部分：" + integerPart);
            System.out.println("小数部分：" + decimalPart);
        }
        scanner.close();
    }
}