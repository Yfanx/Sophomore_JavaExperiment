import java.util.*;

public class h5 {
    public static void main(String[] args) {
        int[] arr = new int[8];
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println("The array is: ");
        for (int i = 0; i < 8; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 8; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("The sorted array is: ");
        for (int i = 0; i < 8; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}