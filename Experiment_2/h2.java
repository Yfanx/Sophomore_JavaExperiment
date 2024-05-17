import java.util.Scanner;

class A {
    private int data;

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }
}

public class h2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        A a = new A();
        System.out.println("Initial data:");
        a.setData(10);
        System.out.println(a.getData());

        System.out.println("Enter a new data:");
        int newData = input.nextInt();
        a.setData(newData);
        System.out.println("New data:");
        System.out.println(a.getData());
        input.close();
    }
}
