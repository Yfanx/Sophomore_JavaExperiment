import java.util.Scanner;

public class h4 {
    public static void main(String[] args) {
        int[][] a = new int[4][5];
        int max, min;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个4*5的二维数组：");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = input.nextInt();
            }
        }
        int Maxcol = 0, Mincol = 0;
        int Maxrow = 0, Minrow = 0;

        max = a[0][0];
        min = a[0][0];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    Maxcol = j;
                    Maxrow = i;
                }
                if (a[i][j] < min) {
                    min = a[i][j];
                    Mincol = j;
                    Minrow = i;
                }
            }
        }
        System.out.println("最大值为：" + max + "，位于第" + Maxrow + "行，第" + Maxcol + "列");
        System.out.println("最小值为：" + min + "，位于第" + Minrow + "行，第" + Mincol + "列");
        input.close();
    }
}
