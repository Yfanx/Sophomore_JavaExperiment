
public class h4_10 {
    public static void main(String[] args) {
        double length = 3000;
        int days = 0;

        while (length >= 5) {
            length /= 2;
            days++;
        }

        System.out.println("绳子的长度会在第 " + days + " 天短于5m。");
    }
}
