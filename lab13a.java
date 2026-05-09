// 13a: Thread-1 prints 1 to 5, Thread-2 prints A to E concurrently

class NumberThread extends Thread {
    public void run() {
        System.out.println("Thread-1 started");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread-1: " + i);
            try { Thread.sleep(300); } catch (InterruptedException e) { e.printStackTrace(); }
        }
        System.out.println("Thread-1 finished");
    }
}

class CharThread extends Thread {
    public void run() {
        System.out.println("Thread-2 started");
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("Thread-2: " + c);
            try { Thread.sleep(300); } catch (InterruptedException e) { e.printStackTrace(); }
        }
        System.out.println("Thread-2 finished");
    }
}

class ThreadAB {
    public static void main(String[] args) {
        System.out.println("=== 13a: Concurrent Threads Demo ===\n");

        NumberThread t1 = new NumberThread();
        CharThread   t2 = new CharThread();

        t1.start();  // Thread-1 starts
        t2.start();  // Thread-2 starts concurrently

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) { e.printStackTrace(); }

        System.out.println("\nBoth threads completed.");
    }
}
