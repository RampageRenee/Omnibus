package com.company;

import com.company.Humans.Hero;
import com.company.Humans.PoliceOfficer;
import com.company.Humans.SuperHuman;
import com.company.Humans.Villain;
import com.company.Teams.Team;
import com.company.Teams.TeamHero;
import com.company.Teams.TeamVillain;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import static com.company.Humans.Fan.allFans;
import static com.company.Humans.Hero.allHeroes;
import static com.company.Humans.PoliceOfficer.allPoliceOfficers;
import static com.company.Humans.Villain.allVillains;
import static com.company.Teams.TeamHero.allHeroTeam;
import static com.company.Teams.TeamVillain.allVillainTeam;


public class FightMenuMethod {
    public static ArrayList<String> fights = new ArrayList<>();

    //This is the starting point and menu of the fight method
    public static void fight() {
        Scanner myScanner = new Scanner(System.in);
        int fightNumber = 1;
        System.out.println("How big is the slaughter going to be?\n [1] One on One\n [2] Team against Team\n [0] I changed my mind let me out of here!");
        try {
            fightNumber = myScanner.nextInt();
        } catch (Exception e) {
            System.out.println("That's not a number asswhipe");
        }

        switch (fightNumber) {
            case 1:
                oneOnOne();
                break;
            case 2:
                teamEffort();
                break;
            default:
                System.out.println("Wrong input dipshit, go back to jail!");
                break;
        }
    }

    public static void teamEffort() {
        Scanner myScanner = new Scanner(System.in);
        TeamHero theGoodies = null;
        TeamVillain theBaddies = null;
        boolean notAHero = true;
        boolean notAVillain = true;
        boolean chooseWinner = true;
        String nameTheGood = "";
        String nameTheBad = "";
        String winnerTeam = "";
        String name = "";
        SuperHuman winnerName = null;

        for (int i = 0; i < allHeroTeam.size(); i++) {
            System.out.println(allHeroTeam.get(i).getAllBasicInformation());
        }

        while (notAHero) {
            System.out.println("\nType the ID number of the good guys you would like to see fight");
            nameTheGood = myScanner.nextLine();

            for (int i = 0; i < allHeroTeam.size(); i++) {
                name = String.valueOf(allHeroTeam.get(i).getTeamId());
                if (name.equals(nameTheGood)) {
                    theGoodies = allHeroTeam.get(i);
                    notAHero = false;
                }
            }
        }

        for (int i = 0; i < allVillainTeam.size(); i++) {
            System.out.println(allVillainTeam.get(i).getAllBasicInformation());
        }
        System.out.println("\nType the ID number of the baddies who you would like to see burn things down");

        while (notAVillain) {
            nameTheBad = myScanner.nextLine();

            for (int i = 0; i < allVillainTeam.size(); i++) {
                name = String.valueOf(allVillainTeam.get(i).getTeamId());
                if (name.equals(nameTheBad)) {
                    theBaddies = allVillainTeam.get(i);
                    notAVillain = false;
                }
            }
        }

        //Make option if the user choose the winner
        Team winTeam = null;
        while (chooseWinner) {
            System.out.println("You are a God now\nTell us who should win the fight" +
                    "\nType [H] for The team with all the Heroes" +
                    "\nType [V] for the Team with all the Baddies" +
                    "\nType [I] if you don't give a shit");
            try {
                winnerTeam = myScanner.next();
            } catch (Exception e) {
                System.out.println("no");
            }
            winnerTeam = winnerTeam.toUpperCase();


            if (winnerTeam.equals("H")) {
                winTeam = theGoodies;
                chooseWinner = false;
            } else if (winnerTeam.equals("V")) {
                winTeam = theBaddies;
                chooseWinner = false;
            } else if (winnerTeam.equals("I")) {
                winnerName = winnerByChance(theGoodies.getHeroTeam().get(0), theBaddies.getVillainTeam().get(0));
                chooseWinner = false;
            } else {
                System.out.println("Wrong input, please take your spasm pills and try again");
            }
        }
        //
        if (winnerName.equals(theGoodies.getHeroTeam().get(0))) {
            winTeam = theGoodies;
        } else {
            winTeam = theBaddies;
        }

        //add to list of fights to ArrayList
        fights.add(winTeam.getTeamName());

        //Get oneliners
        for (int i = 0; i < theGoodies.getHeroTeam().size(); i++) {
            System.out.println(theGoodies.getHeroTeam().get(i).getPersonalOneLiner());
        }
        for (int i = 0; i < theBaddies.getVillainTeam().size(); i++) {
            System.out.println(theBaddies.getVillainTeam().get(i).getPersonalOneLiner());
        }

        System.out.println("\nclANG¿¡¡ KRAK¿! smASH!!      BaP¡¡!\nCKroNK¿¡¡   thWOk¿! SPoNK!!   plinK¡¡!\n");
        System.out.println("This Match is won by.........¿! " + winTeam.getTeamName() + "\n\n");
    }

    public static void oneOnOne() {
        Scanner myScanner = new Scanner(System.in);
        Hero hero1 = null;
        Villain villain1 = null;
        PoliceOfficer police1 = null;
        String heroName = "";
        String villainName = "";
        String name = "";
        boolean incorrectHero = true;
        boolean incorrectVillain = true;
        boolean chooseWinner = true;
        boolean choosePolice = true;
        boolean policeOnTheScene = true;
        String winner = "";

        System.out.println("Heroes: \n");
        for (int i = 0; i < allHeroes.size(); i++) {
            System.out.println(allHeroes.get(i).getAllBasicInformation());
        }


        while (incorrectHero) {
            System.out.println("\nType the name of your hero");
            heroName = myScanner.next();
            heroName = heroName.toLowerCase();
            heroName = heroName.replace(" ", "");

            for (int i = 0; i < allHeroes.size(); i++) {
                name = allHeroes.get(i).getName();
                name = name.toLowerCase(Locale.ROOT);
                name = name.replace(" ", "");
                if (name.contains(heroName)) {
                    hero1 = allHeroes.get(i);
                    incorrectHero = false;
                }
            }
        }

        System.out.println("Villains: \n");
        for (int i = 0; i < allVillains.size(); i++) {
            System.out.println(allVillains.get(i).getAllBasicInformation());
        }

        while (incorrectVillain) {

            System.out.println("choose the badguy by typing in their name!");
            villainName = myScanner.next();
            villainName = villainName.toLowerCase();
            villainName = villainName.replace(" ", "");

            for (int i = 0; i < allVillains.size(); i++) {
                name = allVillains.get(i).getName();
                name = name.toLowerCase(Locale.ROOT);
                name = name.replace(" ", "");
                if (name.contains(villainName)) {
                    villain1 = allVillains.get(i);
                    incorrectVillain = false;
                }
            }

        }

        while (choosePolice) {
            System.out.println("Do you want to call the pigs?\nType [911] if you do or scream NO! to proceed without.");
            String pigs = myScanner.next();
            if (pigs.equals("911")) {
                while (policeOnTheScene) {
                    System.out.println("Welcome to 911 emergency, the following officers are on duty today: ");
                    for (int i = 0; i < allPoliceOfficers.size(); i++) {
                        System.out.println(allPoliceOfficers.get(i).getAllBasicInformation());
                    }

                    System.out.print("Please type the name of your officer of choice: ");
                    String officer = myScanner.next();
                    officer = officer.toLowerCase(Locale.ROOT);

                    for (int i = 0; i < allPoliceOfficers.size(); i++) {
                        name = allPoliceOfficers.get(i).getName();
                        name = name.toLowerCase(Locale.ROOT);
                        if (name.contains(officer)) {
                            System.out.println("Thank you for calling,\n the " + allPoliceOfficers.get(i).getDepartment() + " will be arriving at your coordinates as soon as possible.");
                            police1 = allPoliceOfficers.get(i);
                            policeOnTheScene = false;
                            choosePolice = false;
                        }
                    }
                }
            } else {
                choosePolice = false;
            }

        }
        SuperHuman winnerName = null;
        while (chooseWinner) {
            System.out.println("Who will win the fight?\n type [H] for hero\n type [V] for Villain\n type [I] if you are Indecisive");
            winner = myScanner.next();
            winner = winner.toUpperCase();

            if (winner.equals("H")) {
                winnerName = hero1;
                chooseWinner = false;
            } else if (winner.equals("V")) {
                winnerName = villain1;
                chooseWinner = false;
            } else if (winner.equals("I")) {
                winnerName = winnerByChance(hero1, villain1);
                chooseWinner = false;
            } else {
                System.out.println("Wrong input baby");
            }
        }


        SuperHuman loserName;
       
        if (winnerName.equals(hero1)) {
            loserName = villain1;
        } else {
            loserName = hero1;
        }

        //add to arrayList from Fight
        fights.add(winnerName.getName());


        //get loser from fan list and replace with winner
        switchFans(winnerName, loserName);


        System.out.println(hero1.getName() + ": " + hero1.getPersonalOneLiner());
        System.out.println(villain1.getName() + ": " + villain1.getPersonalOneLiner());
        System.out.println("\nclANG¿¡¡ thWOk¿! SMASH!!      plinK¡¡!\n");
        System.out.println("This Match is won by.........¿! " + winnerName.getName() + "\n\n");
        // output if villain is loser, loser goes to jail, or loser got away
        if (police1 != null && winnerName == hero1) {
            if (police1.getCorrupt()) {
                System.out.println(police1.getName() + " was too busy eating a donut. " + villain1.getName() + " fled the scene with sugary fingers.");
            } else {
                System.out.println(villain1.getName() + " is now sitting in the backseat of officer " + police1.getName());
            }
        }
    }

    public static SuperHuman winnerByChance(Hero hero, Villain villain) {
        SuperHuman result = null;
        Random random = new Random();
        int hPow = random.nextInt(2000 - 1 + 1) + 1;
        int vPow = random.nextInt(2000 - 1 + 1) + 1;
        boolean hLethal = hero.getPersonalWeapon().isWeaponIsLethal();
        boolean vLethal = villain.getPersonalWeapon().isWeaponIsLethal();

        hPow = hPow + hero.getPersonalWeapon().getWeaponPowerLevel() + hero.getPowerLevel();
        vPow = vPow + villain.getPersonalWeapon().getWeaponPowerLevel() + hero.getPowerLevel();
        //if lethal een extra kans of h/v Pow * 2

        if (!hLethal && !vLethal || hLethal && vLethal) {
            if (hPow > vPow) {
                result = hero;
            } else if (hPow < vPow) {
                result = villain;
            } else {
                result = villain;
            }
        } else if (hLethal) { // we hebben hier boven al vast gesteld dat er maar een van beide Lethal is
            if (hPow < vPow) {
                hPow = random.nextInt(2000 - 1 + 1) + 1;
                hPow = hPow + hero.getPersonalWeapon().getWeaponPowerLevel() + hero.getPowerLevel();
                if (hPow > vPow) {
                    result = hero;
                } else {
                    result = villain;
                }
            } else {
                result = villain;
            }
        } else {
            if (vPow < hPow) {
                vPow = random.nextInt(2000 - 1 + 1) + 1;
                vPow = vPow + villain.getPersonalWeapon().getWeaponPowerLevel() + hero.getPowerLevel();
                if (vPow > hPow) {
                    result = villain;
                } else {
                    result = hero;
                }
            } else {
                result = hero;
            }

        }

        return result;

    }

    public static void switchFans(SuperHuman winnerName, SuperHuman loserName) {
        for (int i = 0; i < allFans.size(); i++) {
            for (int j = 0; j < allFans.get(i).getIdols().size(); j++) {
                if (allFans.get(i).getIdols().get(j).equals(loserName)) {
                    allFans.get(i).getIdols().set(j, winnerName);
                }
            }
        }
    }

    public static void searchFights() {
        Scanner myScanner = new Scanner(System.in);
        String search = "";
        int counter = 0;

        System.out.println("Please type the name of the winner you are looking for: ");
        try {
            search = myScanner.next();
        } catch (Exception e) {
            System.out.println("no search");
        }
        search = search.toLowerCase(Locale.ROOT);

        for (int i = 0; i < fights.size(); i++) {
            String name = fights.get(i);
            name = name.toLowerCase(Locale.ROOT);
            if (name.contains(search)) {
                counter++;
                System.out.println(counter + " | " + fights.get(i));
            }
        }
        if (counter == 0){
            System.out.println("No winner is found! Win some fights first");
        }
    }


}
