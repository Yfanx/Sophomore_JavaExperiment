public class h6 {
    public static void main(String[] args) {
        int n = 30;
        int m = 15;
        int[] a = new int[n];
        boolean[] b = new boolean[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
            b[i] = true;
        }
        int i = 0, j = 0, k = 0;
        while (k < m) {
            if (b[i])
                j++;
            if (j == 13) {
                j = 0;
                b[i] = false;
                k++;
            }
            i++;
            if (i == n) {
                i = 0;
            }
        }
        System.out.println("The position of the red ball is:");
        for (int x = 0; x < n; x++) {
            if (b[x]) {
                System.out.print(a[x] + " ");
            }
        }
        System.out.println();
        System.out.println("The position of the green ball is:");
        for (int x = 0; x < n; x++) {
            if (!b[x]) {
                System.out.print(a[x] + " ");
            }
        }
    }
}
