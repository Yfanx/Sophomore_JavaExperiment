public class h2 {
    public static void main(String[] args) {
        Runner2 r1 = new Runner2(1);
        Runner2 r3 = new Runner2(3);

        Thread t1 = new Thread(r1);
        Thread t3 = new Thread(r3);

        t1.start();
        t3.start();
    }
}

class Runner2 implements Runnable {
    private int interval;

    public Runner2(int time) {
        this.interval = time;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Runner" + this.interval + ": " + "第 " + i + " 次");
            try {
                Thread.sleep(this.interval * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
