
interface myItfc {
    double area(double x);
}

class Cube implements myItfc {
    public double area(double x) {
        return x * x * x;
    }
}

public class h4 {
    public static void main(String[] args) {
        myItfc myObject = new Cube();
        double result = myObject.area(3.0);
        System.out.println("The cube of 3.0 is: " + result);
    }
}
