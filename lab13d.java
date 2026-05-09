// 13d: Two threads share a BankAccount; synchronized withdrawal prevents inconsistency

class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double initialBalance) {
        this.owner  = owner;
        this.balance = initialBalance;
        System.out.println("Account created for " + owner + " | Initial Balance: Rs." + balance);
    }

    // synchronized ensures only one thread can execute this at a time
    public synchronized void withdraw(String threadName, double amount) {
        System.out.println("\n" + threadName + " attempting to withdraw Rs." + amount);
        System.out.println(threadName + " sees current balance: Rs." + balance);

        if (balance >= amount) {
            System.out.println(threadName + " is processing withdrawal...");
            try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
            balance -= amount;
            System.out.println(threadName + " withdrawal SUCCESSFUL. New balance: Rs." + balance);
        } else {
            System.out.println(threadName + " withdrawal FAILED. Insufficient funds! Balance: Rs." + balance);
        }
    }

    public double getBalance() { return balance; }
}

class WithdrawThread extends Thread {
    private BankAccount account;
    private double amount;

    public WithdrawThread(String name, BankAccount account, double amount) {
        super(name);
        this.account = account;
        this.amount  = amount;
    }

    @Override
    public void run() {
        account.withdraw(getName(), amount);
    }
}

class BankSyncDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== 13d: Synchronized Bank Account Demo ===\n");

        BankAccount account = new BankAccount("Rahul", 1000.0);

        WithdrawThread t1 = new WithdrawThread("Thread-A", account, 700.0);
        WithdrawThread t2 = new WithdrawThread("Thread-B", account, 600.0);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("\nFinal Account Balance: Rs." + account.getBalance());
    }
}
