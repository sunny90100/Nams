package objectoriented;





abstract class AbstractVehicle implements Vehicle1 {
    
    public void start() {
        System.out.println("Vehicle is starting.");
    }

   
    public abstract void accelerate();
}


class Car extends AbstractVehicle {
    
    public void accelerate() {
        System.out.println("Car is accelerating.");
    }

   
    public void stop() {
        System.out.println("Car is stopping.");
    }
}


class Bicycle implements Vehicle1 {
   
    public void start() {
        System.out.println("Bicycle is starting.");
    }

   
    public void stop() {
        System.out.println("Bicycle is stopping.");
    }
}

public class Main {
    public static void main(String[] args) {
        
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

       
        car.start();
        car.accelerate();
        car.stop();

        
        bicycle.start();
        bicycle.stop();
    }
}
