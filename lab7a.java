class ObjectCounter {
    static int count = 0;
    ObjectCounter() {
        count++;
    }
}
class lab7a{
    public static void main(String[] args) {
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();
        System.out.println("Number of objects created: " + ObjectCounter.count);
    }
}