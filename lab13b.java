// 13b: Two child threads from the same class, each prints the pattern /*/*/

class PatternThread extends Thread {
    public PatternThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getName() + " started");
        String pattern = "/*/*/*";
        // Print each character of the pattern one at a time with a delay
        for (int i = 0; i < pattern.length(); i++) {
            System.out.println(getName() + " -> " + pattern.charAt(i));
            try { Thread.sleep(200); } catch (InterruptedException e) { e.printStackTrace(); }
        }
        System.out.println(getName() + " pattern: " + pattern);
        System.out.println(getName() + " finished");
    }
}

class PatternThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== 13b: Same-Class Pattern Threads Demo ===\n");

        PatternThread child1 = new PatternThread("Child-Thread-1");
        PatternThread child2 = new PatternThread("Child-Thread-2");

        child1.start();
        child2.start();

        child1.join();
        child2.join();

        System.out.println("\nBoth child threads finished printing the pattern.");
    }
}
