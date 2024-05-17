import java.util.Scanner;

public class h8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a;
        int begin, length;
        System.out.println("输入一个字符串：");
        a = input.nextLine();
        System.out.println("输入开始位置(默认从0开始)和长度：");
        begin = input.nextInt();
        length = input.nextInt();
        System.out.println(a.substring(begin, begin + length));
        input.close();
    }
}
