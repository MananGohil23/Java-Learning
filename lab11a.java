abstract class shape{
    abstract void area();
}
class circle extends shape{
    void area(){
        System.out.println(3.14*2*2);
    }
}
class rect extends shape{
    void area(){
        System.out.println(2*4);
    }
}
class tri extends shape{
    void area(){
        System.out.println(0.5*2*4);
    }
}
class lab11a{
    public static void main(String args[]){
        shape s;
        s = new circle();
        s.area();
        s = new rect();
        s.area();
        s = new tri();
        s.area();
    }
}