// 13e: Demonstrate setName() and getName() on threads

class NamedThread extends Thread {
    @Override
    public void run() {
        System.out.println("Running thread: " + getName());
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " -> step " + i);
            try { Thread.sleep(200); } catch (InterruptedException e) { e.printStackTrace(); }
        }
        System.out.println(getName() + " done.");
    }
}

class ThreadNameDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== 13e: setName() and getName() Demo ===\n");

        NamedThread t1 = new NamedThread();
        NamedThread t2 = new NamedThread();

        // setName() assigns a custom name to each thread
        t1.setName("Worker-Alpha");
        t2.setName("Worker-Beta");

        // getName() retrieves the name
        System.out.println("Thread 1 name (via getName): " + t1.getName());
        System.out.println("Thread 2 name (via getName): " + t2.getName());
        System.out.println();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("\nBoth threads completed.");
    }
}
