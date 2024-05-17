import java.util.Scanner;

public class h4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your grades : ");
        if (scanner.hasNextInt()) {
            int grade = scanner.nextInt();
            int range = grade / 10;
            switch (range) {
                case 10:
                case 9:
                    System.out.println("A");
                    break;
                case 8:
                    if (grade >= 85)
                        System.out.println("A");
                    else
                        System.out.println("B");
                    break;
                case 7:
                    System.out.println("B");
                    break;
                case 6:
                    System.out.println("C");
                    break;
                default:
                    System.out.println("D");
                    break;
            }

        }
        scanner.close();
    }
}
