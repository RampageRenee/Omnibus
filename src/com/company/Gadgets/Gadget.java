package com.company.Gadgets;

import com.company.Humans.List;
import com.company.Humans.SuperHuman;

import java.util.ArrayList;

public abstract class Gadget implements List {
    protected Integer gadgetId;
    protected String gadgetName;
    protected String gadgetDescription;
    protected SuperHuman superHuman;
    public static ArrayList<Gadget> allGadgets = new ArrayList<>();

    public Gadget(SuperHuman superHuman, Integer gadgetId, String gadgetName, String gadgetDescription) {
        this.gadgetId = gadgetId;
        this.gadgetName = gadgetName;
        this.gadgetDescription = gadgetDescription;
        this.superHuman = superHuman;
    }

    public SuperHuman getOwner() {
        return superHuman;
    }

    public String getGadgetName() {
        return this.gadgetName;
    }

}
