import java.util.Scanner;

public class h9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a;
        char Tbdeleted;
        System.out.println("输入一个字符串：");
        a = input.nextLine();
        System.out.println("输入要删除的字符：");
        Tbdeleted = input.next().charAt(0);
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == Tbdeleted) {
                a = a.substring(0, i) + a.substring(i + 1);
                i--;
            }
        }
        System.out.println(a);
        input.close();
    }
}
