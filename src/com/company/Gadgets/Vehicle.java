package com.company.Gadgets;

import com.company.Humans.SuperHuman;

import java.util.ArrayList;

public class Vehicle extends Gadget {
    private Integer vehicleSpeed;
    private final Integer vehicleCapacity;
    public static ArrayList<Vehicle> allVehicles = new ArrayList<>();

    public Vehicle(SuperHuman superHuman, Integer gadgetId, String gadgetName, String gadgetDescription, Integer vehicleSpeed, Integer vehicleCapacity) {
        super(superHuman, gadgetId, gadgetName, gadgetDescription);
        this.vehicleSpeed = vehicleSpeed;
        this.vehicleCapacity = vehicleCapacity;
    }

    public String toString() {
        return gadgetName + gadgetDescription + "\nMax Speed = " + vehicleSpeed + "\nCapacity" + vehicleCapacity;
    }

    @Override
    public String getAllDetailedInformation() {
        return "ID: " + gadgetId + " | Name: " + gadgetName + "\n Description: " + gadgetDescription + "\n Vehicle capacity: " + vehicleCapacity + "\n";
    }

    @Override
    public String getAllBasicInformation() {
        return "ID number: " + gadgetId + " | Name: " + gadgetName + "\n";
    }


}
