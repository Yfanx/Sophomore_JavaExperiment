public class h1 {

    public static void main(String[] args) {
        Money myAccount = new Money(1000.0);

        try {
            myAccount.putMoney(500.0);
            System.out.println("存款成功，当前余额为： " + myAccount.getYu());

            myAccount.getMoney(200.0);
            System.out.println("取款成功，当前余额为：" + myAccount.getYu());

            myAccount.getMoney(1500.0);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

class Money {
    private double yu;

    public Money(double initialBalance) {
        this.yu = initialBalance;
    }

    public void putMoney(double money) {
        this.yu += money;
    }

    public void getMoney(double money) throws MyException {
        if (this.yu < money) {
            MyException e = new MyException("当前余额为 " + this.yu + "，取款失败，余额不足。");
            throw e;
        } else {
            this.yu -= money;
        }
    }

    public double getYu() {
        return this.yu;
    }
}
