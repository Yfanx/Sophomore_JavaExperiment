class Vehicle {
    public void run() {
        System.out.println("这是交通工具run方法");
    }
}

class Motor extends Vehicle {
    public void run() {
        System.out.println("这是汽车run方法");
    }
}

class Ship extends Vehicle {
    public void run() {
        System.out.println("这是船run方法");
    }
}

class Aeroplane extends Vehicle {
    public void run() {
        System.out.println("这是飞机run方法");
    }
}

class Bus extends Motor {
    public void run() {
        System.out.println("这是公共汽车run方法");
    }
}

class Car extends Motor {
    public void run() {
        System.out.println("这是轿车run方法");
    }
}

public class h1 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.run();
        Motor m = new Motor();
        m.run();
        Ship s = new Ship();
        s.run();
        Aeroplane a = new Aeroplane();
        a.run();
        Bus b = new Bus();
        b.run();
        Car c = new Car();
        c.run();
    }
}