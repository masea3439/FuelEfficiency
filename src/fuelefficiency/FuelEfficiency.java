/*
 * 
 */

package fuelefficiency;

/**
 *
 * @author masea3439
 */
public class FuelEfficiency {

/**
 * This method creates the vehicle objects and then gets the distance they can travel
 * PRE: args 
 * POST: Prints distance vehicles can travel
 */
    public static void main(String[] args) {
        double fuel = 100;
        System.out.println("On "+fuel+"L of gas the vehicles can drive:");
        Truck trunk = new Truck();
        Car bar = new Car();
        HybridCar bumblebee = new HybridCar();
        Motorcycle unicycle = new Motorcycle();
        System.out.println("Truck: "+trunk.getDistance(fuel)+"km");
        System.out.println("Car: "+bar.getDistance(fuel)+"km");
        System.out.println("HybridCar: "+bumblebee.getDistance(fuel)+"km");
        System.out.println("Motorcycle: "+unicycle.getDistance(fuel)+"km");
        
        
    }
    
}
