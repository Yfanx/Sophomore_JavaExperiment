import java.util.Scanner;

public class h10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a;
        System.out.println("输入一个字符串：");
        a = input.nextLine();
        int letter, number, others;
        letter = number = others = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z' || a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
                letter++;
            else if (a.charAt(i) >= '0' && a.charAt(i) <= '9')
                number++;
            else
                others++;
        }
        System.out.println("字母个数：" + letter);
        System.out.println("数字个数：" + number);
        System.out.println("其他字符个数：" + others);
        input.close();
    }
}
