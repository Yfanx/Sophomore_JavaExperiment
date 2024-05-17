public class h4_3 {
    public static void main(String[] args) {
        System.out.println("The number can be divided by 3 and 7 :");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
