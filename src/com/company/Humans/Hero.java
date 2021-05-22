package com.company.Humans;

import java.util.ArrayList;

public class Hero extends SuperHuman {
    private final String realName;
    private Villain archEnemy;
    private ArrayList<Villain> notebookOfHero = new ArrayList<>();
    public static ArrayList<Hero> allHeroes = new ArrayList<>();

    public Hero(String name, Integer idNumber, String activeLocation, Integer powerLevel, String realName) {
        super(name, idNumber, activeLocation, powerLevel);
        this.realName = realName;
    }

    public String getName() {
        return super.name;
    }

    public Integer getPowerLevel() {
        return super.powerLevel;
    }

    public void setArchEnemy(Villain archEnemy) {
        this.archEnemy = archEnemy;
    }

    public void setNotebookOfHero(ArrayList<Villain> listOfVillains) {
        this.notebookOfHero = listOfVillains;
    }

    public String toString() {
        return this.name;
    }


    @Override
    public String getAllBasicInformation() {
        return "ID number: " + idNumber + " | Name: " + name;
    }

    @Override
    public String getAllDetailedInformation() {
        String notebook = "";
        for (int i = 0; i < notebookOfHero.size(); i++) {
            notebook += " | " + notebookOfHero.get(i).getName();
        }
        String gadgetsOffHero = "";
        for (int i = 0; i < gadgets.size(); i++) {
            gadgetsOffHero += gadgets.get(i) + " \n";
        }
        return "ID: " + idNumber +
                "\nName: " + name +
                "\nReal name: " + realName +
                "\nLocation: " + activeLocation +
                "\nOne-Liner: " + personalOneLiner +
                "\nEnemies in notebook: " + notebook +
                "\nArch enemy: " + archEnemy +
                "\n\nGadgets: " + gadgetsOffHero + "\n\n";
    }

}
