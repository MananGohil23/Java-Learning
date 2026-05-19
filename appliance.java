abstract class Appliance{
    String name;
    Appliance(String name){
        this.name = name;
    }

    void turnOn(){
        System.out.println(name + " is turned on.");
    }

    abstract void operation();
}

class WashingMachine extends Appliance{
    WashingMachine(String name){
        super(name);
    }

    void operation(){
        System.out.println(name + " is washing clothes.");
    }
}

class Main{
    public static void main(String args[]){
        WashingMachine wm = new WashingMachine("Whirlpool");
        wm.turnOn();
        wm.operation();
    }
}