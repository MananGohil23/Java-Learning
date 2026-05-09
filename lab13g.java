// 13g: Two threads — setName(), getName() 5 times, setPriority()

class PriorityThread extends Thread {
    public PriorityThread(String name, int priority) {
        setName(name);           // setName() assigns the thread's name
        setPriority(priority);   // setPriority() assigns scheduling priority (1-10)
    }

    @Override
    public void run() {
        System.out.println(getName() + " started | Priority: " + getPriority());
        for (int i = 1; i <= 5; i++) {
            // getName() retrieves the thread's name each iteration
            System.out.println(getName() + " -> print #" + i);
            try { Thread.sleep(300); } catch (InterruptedException e) { e.printStackTrace(); }
        }
        System.out.println(getName() + " finished.");
    }
}

class PriorityThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== 13g: setName(), getName(), setPriority() Demo ===\n");

        // Thread priority constants: MIN=1, NORM=5, MAX=10
        PriorityThread t1 = new PriorityThread("High-Priority-Thread", Thread.MAX_PRIORITY);  // 10
        PriorityThread t2 = new PriorityThread("Low-Priority-Thread",  Thread.MIN_PRIORITY);  // 1

        System.out.println("Thread 1 name     : " + t1.getName());
        System.out.println("Thread 1 priority : " + t1.getPriority());
        System.out.println("Thread 2 name     : " + t2.getName());
        System.out.println("Thread 2 priority : " + t2.getPriority());
        System.out.println();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("\nBoth threads completed.");
        System.out.println("Note: Higher priority thread gets more CPU preference (JVM-dependent).");
    }
}
