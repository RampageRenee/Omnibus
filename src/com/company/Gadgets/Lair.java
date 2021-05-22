package com.company.Gadgets;

import com.company.Humans.SuperHuman;

import java.util.ArrayList;

public class Lair extends Gadget {
    private String location;
    public static ArrayList<Lair> allLairs = new ArrayList<>();

    public Lair(SuperHuman superHuman, Integer gadgetId, String gadgetName, String gadgetDescription, String location) {
        super(superHuman, gadgetId, gadgetName, gadgetDescription);
        this.location = location;
    }

    public String toString() {
        return gadgetName + "Description: " + gadgetDescription;
    }

    @Override
    public String getAllBasicInformation() {
        return "ID number: " + gadgetId + " | Name: " + gadgetName + "\n";
    }

    @Override
    public String getAllDetailedInformation() {
        return "ID: " + gadgetId + " | Name: " + gadgetName + "\n" +
                " Description: " + gadgetDescription + "\nLocation: "+ location + "\n";
    }
}
