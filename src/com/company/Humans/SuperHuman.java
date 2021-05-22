package com.company.Humans;

import com.company.Gadgets.Gadget;
import com.company.Gadgets.Weapon;

import java.util.ArrayList;

public abstract class SuperHuman extends Human {
    public static ArrayList<SuperHuman> allSuperHumans = new ArrayList<>();
    protected String activeLocation;
    protected Integer powerLevel;
    protected ArrayList<Gadget> gadgets;
    protected String personalOneLiner = "I'm to lazy to think of my own one-liner";
    protected Weapon personalWeapon;

    public SuperHuman(String name, Integer idNumber, String activeLocation, Integer powerLevel) {
        super(name, idNumber);
        this.activeLocation = activeLocation;
        this.powerLevel = powerLevel;
    }

    public Weapon getPersonalWeapon() {
        return personalWeapon;
    }

    public void setPersonalWeapon(Weapon weapon) {
        this.personalWeapon = weapon;
    }

    public void setGadgets(ArrayList<Gadget> gadgets) {
        this.gadgets = gadgets;
    }

    public String getName() {
        return super.name;
    }

    public String getPersonalOneLiner() {
        return personalOneLiner;
    }

    public void setPersonalOneLiner(String personalOneLiner) {
        this.personalOneLiner = personalOneLiner;
    }

    public String toString() {
        return name;
    }

}
