import java.util.*;

public class h4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生成绩：");
        if (scanner.hasNextInt()) {
            int score = scanner.nextInt();
            if (score < 0 || score > 100) {
                System.out.println("输入错误！");
            } else {
                switch (score / 10) {
                    case 10:
                    case 9:
                        System.out.println("优");
                        break;
                    case 8:
                        System.out.println("良");
                        break;
                    case 7:
                        System.out.println("中");
                        break;
                    case 6:
                        System.out.println("及格");
                        break;
                    default:
                        System.out.println("不及格");
                        break;
                }
            }
        }
        scanner.close();
    }
}