// 13f: Inter-thread communication using wait() and notify()
// One thread waits; another prints 1-5 then notifies the waiting thread.

class SharedResource {
    private boolean ready = false;

    // Waiter thread calls this — blocks until notified
    public synchronized void waitForSignal(String name) {
        System.out.println(name + ": waiting for signal using wait()...");
        while (!ready) {
            try {
                wait();   // releases lock and waits
            } catch (InterruptedException e) { e.printStackTrace(); }
        }
        System.out.println(name + ": received notification! Resuming execution.");
    }

    // Printer thread calls this — prints 1-5 then notifies
    public synchronized void printAndNotify(String name) {
        System.out.println(name + ": printing numbers 1 to 5...");
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + ": " + i);
            try { Thread.sleep(400); } catch (InterruptedException e) { e.printStackTrace(); }
        }
        ready = true;
        System.out.println(name + ": done printing. Sending notify()...");
        notify();   // wakes up the waiting thread
    }
}

class WaiterThread extends Thread {
    private SharedResource resource;
    public WaiterThread(SharedResource r) { super("Waiter-Thread"); this.resource = r; }
    public void run() { resource.waitForSignal(getName()); }
}

class PrinterThread extends Thread {
    private SharedResource resource;
    public PrinterThread(SharedResource r) { super("Printer-Thread"); this.resource = r; }
    public void run() { resource.printAndNotify(getName()); }
}

class WaitNotifyDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== 13f: wait() and notify() Demo ===\n");

        SharedResource resource = new SharedResource();

        WaiterThread  waiter  = new WaiterThread(resource);
        PrinterThread printer = new PrinterThread(resource);

        waiter.start();              // starts waiting immediately
        Thread.sleep(200);           // small delay so waiter enters wait() first
        printer.start();             // starts printing, then notifies

        waiter.join();
        printer.join();

        System.out.println("\nInter-thread communication complete.");
    }
}
