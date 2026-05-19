class Test{

    // Method with int parameter
    void show(int a){
        System.out.println("Method with int parameter: " + a);
    }

    // Method with String parameter
    void show(String s){
        System.out.println("Method with String parameter: " + s);
    }   

    public static void main(String args[]){
        Test t = new Test();
        t.show(10);
        t.show("Hello");
    }
}