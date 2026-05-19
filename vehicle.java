class Vehicle{

    void start(){
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle{
    
    void drive(){
        System.out.println("Car is driving");
    }
}

class ElectricCar extends Car{
    
    void charge(){
        System.out.println("Electric Car is charging");
    }
}

class Main{
    public static void main(String args[]){
        ElectricCar ec = new ElectricCar();
        ec.start(); // Inherited from Vehicle
        ec.drive(); // Inherited from Car
        ec.charge(); // Defined in ElectricCar
    }
}