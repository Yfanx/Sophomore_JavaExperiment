public class h3 {

    int volume(int a) {
        return a * a * a;
    }

    int volume(int a, int b, int c) {
        return a * b * c;
    }

    double volume(double r, double h) {
        return 3.14 * r * r * h;
    }

    public static void main(String[] args) {
        h3 obj = new h3();

        int volume1 = obj.volume(5);
        System.out.println("Volume of cube: " + volume1);

        int volume2 = obj.volume(2, 3, 4);
        System.out.println("Volume of rectangular prism: " + volume2);

        double volume3 = obj.volume(2.5, 4.5);
        System.out.println("Volume of cylinder: " + volume3);

    }
}
