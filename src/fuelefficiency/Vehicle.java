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
public abstract class Vehicle {
    double distance;
    
    /**
     * This method calculates the distance a vehicle can drive based on the fuel
     * PRE: fuelI
     * POST: distance 
     */
    public abstract double getDistance(double fuelI);    
}
