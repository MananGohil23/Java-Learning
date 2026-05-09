class test1 extends Thread {
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                
            }
        }
    }
}

class test2 extends Thread{
    public void run(){
        for(char i = 'A';i<'E';i++){
            System.out.println(i);
        }
    }
}

class multithreading {
    public static void main(String[] args) {
        test1 t1 = new test1();
        test2 t2 = new test2();
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch(Exception e){

        }
        System.out.println("hii");
    }
}