class demo extends Thread {
    public void run(){
        System.out.println(this.getName());
        System.out.println(this.getPriority());
    }
}

class multithreading2{
    public static void main(String[] args) {
        demo t1 = new demo();
        demo t2 = new demo();
        t1.setName("first thread");
        t2.setName("second thread");
        t1.setPriority(1);
        t2.setPriority(10);
        t1.start();
        t2.start();
        System.out.println("hiiii");
    }
}