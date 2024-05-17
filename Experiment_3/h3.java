class MulThread implements Runnable {
    String name;

    public MulThread(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("线程 " + this.name + " 开始");
        try {
            long time = (long) (Math.random() * 1000);
            System.out.println("线程 " + this.name + " 休眠 " + time + "ms");
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("finished+线程 " + this.name);
    }
}

public class h3 {
    public static void main(String[] args) {
        MulThread t1 = new MulThread("t1");
        MulThread t2 = new MulThread("t2");
        MulThread t3 = new MulThread("t3");

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        Thread thread3 = new Thread(t3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}