import java.util.Scanner;

public class h11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean a = true;
        String b;
        while (a) {
            System.out.println("输入字符串：");
            b = input.nextLine();
            if (b.equals("exit")) {
                System.out.println("你输入“exit”,退出程序。");
                a = false;
            } else {
                System.out.println("你输入的字符串是：" + b);
                System.out.println();
            }
        }
        input.close();
    }
}
