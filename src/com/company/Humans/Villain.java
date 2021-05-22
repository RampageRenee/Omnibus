package com.company.Humans;

import java.util.ArrayList;

public class Villain extends SuperHuman {
    private final String evilPlan;
    private Hero archEnemy;
    private ArrayList<Hero> notebookOfVillain = new ArrayList<>();
    public static ArrayList<Villain> allVillains = new ArrayList<>();

    public Villain(String name, Integer idNumber, String activeLocation, Integer powerLevel, String evilPlan) {
        super(name, idNumber, activeLocation, powerLevel);
        this.evilPlan = evilPlan;
    }

    public String getName() {
        return super.name;
    }

    public void setNotebookOfVillain(ArrayList<Hero> listOfHeroes) {
        this.notebookOfVillain = listOfHeroes;
    }

    public void setArchEnemy(Hero archEnemy) {
        this.archEnemy = archEnemy;
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
        for (int i = 0; i < notebookOfVillain.size(); i++) {
            notebook = notebook + " | " + notebookOfVillain.get(i).getName();
        }
        String gadgetsFromVillain = "";
        for (int i = 0; i < gadgets.size(); i++) {
            gadgetsFromVillain = gadgetsFromVillain + gadgets.get(i) + "\n";
        }
        return "ID: " + idNumber + "\nName: " +
                name + "\nMy secret evil plan: " +
                evilPlan + "\nLocation: " +
                activeLocation + "\nOne-Liner: " +
                personalOneLiner + "\nEnemies in notebook: " +
                notebook + "\nArch enemy: " +
                archEnemy + "\n\nGadgets: " +
                gadgetsFromVillain + "\n\n";
    }

}
