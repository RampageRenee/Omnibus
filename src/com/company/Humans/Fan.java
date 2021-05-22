package com.company.Humans;

import java.util.ArrayList;

public class Fan extends NormalHuman {
    private ArrayList<SuperHuman> idols;
    public static ArrayList<Fan> allFans = new ArrayList<>();

    public Fan(String name, Integer idNumber) {
        super(name, idNumber);
    }

    public ArrayList<SuperHuman> getIdols() {
        return idols;
    }

    public void setIdols(ArrayList<SuperHuman> idols) {
        this.idols = idols;
    }

    public String toString() {
        return "Name: " + this.name + "\n" + "Idols are: " + this.idols;
    }

    @Override
    public String getAllBasicInformation() {
        return "ID number: " + idNumber + " | Name: " + name + "\n";
    }

    @Override
    public String getAllDetailedInformation() {
        String printIdols = "";
        for (int i = 0; i < idols.size(); i++) {
            printIdols += " | " + idols.get(i).getName();
        }
        return "ID number: " + idNumber + " | Name: " + name + "\n" + "My besties (heroes & villains) " + printIdols;
    }
}
