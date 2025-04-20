

class Vehicle {
    public String brand;

    public void startEngine(){
        System.out.println("Engine started for Vehicle");
    }
}

class Car extends Vehicle {
    public int numberOfDoors;

     public void displayInfo(){
        System.out.println("Brand: " + this.brand);
        System.out.println("Number of doors: " + this.numberOfDoors);
     }
}

public class Main {
    public static void main(String[] args) {
        Car auto = new Car();

        auto.brand = "KIA";
        auto.numberOfDoors = 4;


        auto.startEngine();
        auto.displayInfo();
        
    }
}