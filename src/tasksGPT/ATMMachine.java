package tasksGPT;

class Account {
     int balance = 0;

    public synchronized void withdraw(int amount) {
        while (balance < amount) {
            try {
                System.out.println(Thread.currentThread().getName() + " waiting to withdraw: " + amount);
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        balance -= amount;
        System.out.println(Thread.currentThread().getName() + " withdrew: " + amount + ", Updated Balance: " + balance);
        notifyAll();
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited: " + amount + ", Updated Balance: " + balance);
        notifyAll();
    }
}

class Drawer extends Thread {
    private Account account;

    public Drawer(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        int[] withdrawals = {50, 100, 150, 200};
        for (int amount : withdrawals) {
            account.withdraw(amount);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Depositor extends Thread {
    private Account account;

    public Depositor(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        int[] deposits = {100, 200, 300, 400};
        for (int amount : deposits) {
            account.deposit(amount);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class ATMMachine {
    public static void main(String[] args) {
        Account account = new Account();

        Depositor depositor = new Depositor(account);
        depositor.setName("Depositor");

        Drawer drawer = new Drawer(account);
        drawer.setName("Drawer");

        depositor.start();
        drawer.start();

        try {
            depositor.join();
            drawer.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Final Balance: " + account.balance);
    }
}

