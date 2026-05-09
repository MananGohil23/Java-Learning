import java.util.Scanner;

// 13c: Child thread calculates sum of first n natural numbers; parent waits using join()

class SumThread extends Thread {
    private int n;
    private long result;

    public SumThread(int n) {
        this.n = n;
    }

    public long getResult() {
        return result;
    }

    @Override
    public void run() {
        System.out.println("Child thread started: calculating sum of first " + n + " natural numbers...");
        result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
            try { Thread.sleep(100); } catch (InterruptedException e) { e.printStackTrace(); }
        }
        System.out.println("Child thread finished calculation.");
    }
}

class SumThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== 13c: Parent-Child Thread with join() Demo ===\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n to calculate sum of first n natural numbers: ");
        int n = sc.nextInt();

        SumThread child = new SumThread(n);
        System.out.println("\nParent thread: starting child thread...");
        child.start();

        System.out.println("Parent thread: waiting for child thread to finish...");
        child.join();   // Parent WAITS here until child completes

        System.out.println("\nParent thread: child has finished.");
        System.out.println("Sum of first " + n + " natural numbers = " + child.getResult());
        sc.close();
    }
}
