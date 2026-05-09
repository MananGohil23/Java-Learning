class parentClass{
    int a;
    parentClass(){
        a = 10;
        System.out.println("Constructor of parent class is called");
    }
    void display(){
        System.out.println("Initial value of a is : " + a);
    }
}

class subClass extends parentClass{
    subClass(){
        System.out.println("Constructor of subclass is called");
        super();
    }
    void show(){
        System.out.println("Accessing the value of a from Super Class : " + super.a);
        super.display();
    }
}

class lab8b{
    public static void main(String[] args) {
        subClass s1 = new subClass();
        s1.show();
    }
}