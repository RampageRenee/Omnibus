package com.company.Gadgets;

import com.company.Humans.SuperHuman;

import java.util.ArrayList;

public class Weapon extends Gadget {
    private final String weaponColor;
    private final Boolean weaponIsLethal;
    private final String weaponMaterial;
    private final Integer weaponPowerLevel;
    public static ArrayList<Weapon> allWeapons = new ArrayList<>();

    public Weapon(SuperHuman superHuman, Integer gadgetId, String gadgetName, String gadgetDescription, String weaponColor, Boolean weaponIsLethal, String weaponMaterial, Integer weaponPowerLevel) {
        super(superHuman, gadgetId, gadgetName, gadgetDescription);
        this.weaponColor = weaponColor;
        this.weaponIsLethal = weaponIsLethal;
        this.weaponMaterial = weaponMaterial;
        this.weaponPowerLevel = weaponPowerLevel;
    }

    public Integer getWeaponPowerLevel() {
        return weaponPowerLevel;
    }

    public Boolean isWeaponIsLethal() {
        return weaponIsLethal;
    }

    @Override
    public String getAllBasicInformation() {
        return "ID number: " + gadgetId + " | Name: " + gadgetName + "\n";
    }

    @Override
    public String getAllDetailedInformation() {
        return "\nWeapon ID: " + gadgetId + " | Weapon name: " + gadgetName + "\n Weapon owner: " + getOwner().getName() + "\n Weapon power level: "
                + weaponPowerLevel + "\n Weapon colour: " + weaponColor + "\n Weapon material: " + weaponMaterial + "\n";
    }

    public String toString() {
        return gadgetName + " Description: " + gadgetDescription + "\nWeapon color: " + weaponColor;
    }

}
