/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuelefficiency;

/**
 *
 * @author masea3439
 */
public class Motorcycle extends Vehicle{

    /**
    * This method calculates the distance a vehicle can drive based on the fuel
    * PRE: fuelI
    * POST: distance 
    */
    public double getDistance(double fuelI) {
        double fuel=fuelI;
        distance = 100 / 6.3 * fuel;
        return distance;
    }
}
