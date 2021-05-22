package com.company;

import java.util.Locale;
import java.util.Scanner;

import static com.company.Gadgets.Gadget.allGadgets;
import static com.company.Gadgets.Lair.allLairs;
import static com.company.Gadgets.Vehicle.allVehicles;
import static com.company.Gadgets.Weapon.allWeapons;
import static com.company.Humans.Fan.allFans;
import static com.company.Humans.Hero.allHeroes;
import static com.company.Humans.SuperHuman.allSuperHumans;
import static com.company.Humans.Villain.allVillains;
import static com.company.Teams.Team.allTeams;
import static com.company.Teams.TeamHero.allHeroTeam;
import static com.company.Teams.TeamVillain.allVillainTeam;


public class Menu {

    public void startMenu() {
        Scanner myScanner = new Scanner(System.in);
        int menuOption = 1;

        System.out.println("\nWelcome to the most awesome heroes & villains game " +
                "\nAre you ready to play? " +
                "\nYou go through the the menu using the numbers displayed down below\n");

        do {
            System.out.println("[1] Heroes & Villains");
            System.out.println("[2] Fans");
            System.out.println("[3] Teams");
            System.out.println("[4] Gadgets");
            System.out.println("[5] Fights");
            System.out.println("[0] Exit");

            System.out.print("Choose one of the numbers above: ");
            try {
                menuOption = myScanner.nextInt();
            } catch (Exception e) {
                System.out.println("That's not a number my friend!");
            }

            switch (menuOption) {
                case 1:
                    Menu.menuCase1();
                    break;
                case 2:
                    Menu.menuCase2();
                    break;
                case 3:
                    Menu.menuCase3();
                    break;
                case 4:
                    Menu.menuCase4();
                    break;
                case 5:
                    Menu.menuCase5();
                    break;
                case 0:
                    System.out.println("Thank you sooo much for playing the game, see you soon!");
                    break;
                default:
                    System.out.println("That number does not exits my in the menu my friend! Please try again");
            }
        } while (menuOption != 0);
    }

    public static void menuCase1() {
        Scanner myScanner = new Scanner(System.in);
        int menu1;
        do {
            System.out.println("\nWelcome to the heroes & villains menu! \nHere you can have a closer look at our super humans in the game");
            System.out.println("[1] Heroes");
            System.out.println("[2] Villains");
            System.out.println("[3] Detailed list of all the heroes");
            System.out.println("[4] Detailed list of all the villains");
            System.out.println("[5] Search a hero or villain");
            System.out.println("[0] Return to main menu");
            System.out.print("Choose one of the numbers above: ");
            menu1 = myScanner.nextInt();
            if (menu1 == 1) {
                System.out.println("Heroes: \n");
                for (int i = 0; i < allHeroes.size(); i++) {
                    System.out.println(allHeroes.get(i).getAllBasicInformation());
                }
            } else if (menu1 == 2) {
                System.out.println("Villains: \n");
                for (int i = 0; i < allVillains.size(); i++) {
                    System.out.println(allVillains.get(i).getAllBasicInformation());
                }
            } else if (menu1 == 3) {
                System.out.println("Detailed list Heroes: \n");
                for (int i = 0; i < allHeroes.size(); i++) {
                    System.out.println(allHeroes.get(i).getAllDetailedInformation());
                }
            } else if (menu1 == 4) {
                System.out.println("Detailed list Villains: \n");
                for (int i = 0; i < allVillains.size(); i++) {
                    System.out.println(allVillains.get(i).getAllDetailedInformation());
                }
            } else if (menu1 == 5) {
                Menu.searchMenu1();
            } else if (menu1 > 5 || menu1 < 0) {
                System.out.println("Go back to kindergarten, and learn your numbers and try again!!");
            } else {
                System.out.println("Sending you back to the main menu");
            }
        } while (menu1 != 0);

    }

    public static void menuCase2() {
        Scanner myScanner = new Scanner(System.in);
        int menu2 = 0;
        do {
            System.out.println("Below is a list of all the fans in the game \n");
            for (int i = 0; i < allFans.size(); i++) {
                System.out.println(allFans.get(i).getAllBasicInformation());
            }

            System.out.println("Welcome to the Fans menu!");
            System.out.println(" press [1] To have a closer look at the fans");
            System.out.println(" press [0] To return to the main menu ");
            System.out.print("Choose one of the numbers above: ");
            menu2 = myScanner.nextInt();



            if (menu2 == 1) {
                Menu.searchMenu2();
            } else if (menu2 > 1 || menu2 < 0) {
                System.out.println("Go back to kindergarten, and learn your numbers and try again!!");
            } else {
                System.out.println("Sending you back to the main menu");
            }
        } while (menu2 != 0);
    }

    public static void menuCase3() {
        Scanner myScanner = new Scanner(System.in);
        int menu3 = 0;
        do {
            System.out.println("[1] Hero Teams");
            System.out.println("[2] Villain Teams");
            System.out.println("[3] Search in Teams");
            System.out.println("[0] Return to main menu");
            System.out.print("Make your choice to inspect the teams: ");
            menu3 = myScanner.nextInt();
            if (menu3 == 1) {
                for (int i = 0; i < allHeroTeam.size(); i++) {
                    System.out.println("\nHero team: \n" + allHeroTeam.get(i).getAllDetailedInformation());
                }
            } else if (menu3 == 2) {
                for (int i = 0; i < allVillainTeam.size(); i++) {
                    System.out.println("\nVillain team: \n" + allVillainTeam.get(i).getAllDetailedInformation());
                }
            } else if (menu3 == 3) {
                searchMenu3();
            } else if (menu3 > 3 || menu3 < 0) {
                System.out.println("Go back to kindergarten, and learn your numbers and try again!!");
            } else {
                System.out.println("Sending you back to the main menu");
            }
        } while (menu3 != 0);
    }

    public static void menuCase4() {
        Scanner myScanner = new Scanner(System.in);
        int menu4 = 0;
        do {
            System.out.println("This is the gadget menu");
            System.out.println("Here you can find all different sort of gadgets");
            System.out.println("[1] Weapons");
            System.out.println("[2] Vehicles");
            System.out.println("[3] Lairs");
            System.out.println("[4] Search for a gadget");
            System.out.println("[0] Return to main menu");
            System.out.print("Choose one of the options above: ");
            menu4 = myScanner.nextInt();
            if (menu4 == 1) {
                for (int i = 0; i < allWeapons.size(); i++) {
                    System.out.println(allWeapons.get(i).getAllDetailedInformation());
                }
            } else if (menu4 == 2) {
                for (int i = 0; i < allVehicles.size(); i++) {
                    System.out.println(allVehicles.get(i).getAllDetailedInformation());
                }
            } else if (menu4 == 3) {
                for (int i = 0; i < allLairs.size(); i++) {
                    System.out.println(allLairs.get(i).getAllDetailedInformation());
                }
            } else if (menu4 == 4) {
                Menu.searchMenu4();
            } else if (menu4 > 4 || menu4 < 0) {
                System.out.println("Go back to kindergarten, and learn your numbers and try again!!");
            } else {
                System.out.println("Sending you back to the main menu");
            }
        } while (menu4 != 0);


    }

    public static void menuCase5() {
        int menu5 = 0;
        Scanner myScanner = new Scanner(System.in);
        do {
            System.out.println("\nWelcome in the FIGHT menu, MWOAAaahAHaAhAHAHaaA!");
            System.out.println("[1] List of Fights\n[2] Start a Fight!\n[3] Search for winners in previous Fights\n[0] bring me to the Exit");

            menu5 = myScanner.nextInt();

            if (menu5 == 1){
                // show list of fights
                System.out.println("Winner(s)");
                for (int i = 0; i < FightMenuMethod.fights.size(); i++) {
                    System.out.println((i + 1) + ". " + FightMenuMethod.fights.get(i));
                }
            } else if (menu5 == 2){
                FightMenuMethod.fight();
            } else if (menu5 == 3){
                FightMenuMethod.searchFights();
            } else if (menu5 >  3 || menu5 < 0) {
                System.out.println("Go back to kindergarten, and learn your numbers and try again!!");
            } else {
                System.out.println("Sending you back to the main menu");
            }
        } while (menu5 != 0);
    }

    public static void searchMenu1() {
        Scanner myScanner = new Scanner(System.in);
        String search = "";
        int counter = 0;

        System.out.println("Type the name of the One you are looking for: ");
        search = myScanner.nextLine();
        search = search.toLowerCase();

        for (int i = 0; i < allSuperHumans.size(); i++) {
            String name = allSuperHumans.get(i).getName();
            name = name.toLowerCase(Locale.ROOT);
            if (name.contains(search)) {
                System.out.println("We found a match! | Name: " + allSuperHumans.get(i).getName() + " \n" + allSuperHumans.get(i).getPersonalOneLiner() + "\n");
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("We did not find a match, please try again or go home. " + "\nIf you are home? Go sit on the toilet a bit and think over your spelling.");
        }
    }

    public static void searchMenu2() {
        Scanner myScanner = new Scanner(System.in);
        String search = "";
        System.out.print("Type here one of the fans names: ");
        search = myScanner.nextLine();
        search = search.toLowerCase(Locale.ROOT);
        int counter = 0;

        for (int i = 0; i < allFans.size(); i++) {
            String name = allFans.get(i).getName();
            name = name.toLowerCase(Locale.ROOT);
            if (name.equals(search)) {
                System.out.println("Info: " + allFans.get(i).getAllDetailedInformation() + "\n");
                counter++;
            }
        }
        if (counter != 1) {
            System.out.println("We did not find a match, please try again or go home. " +
                    "\nIf you are home? Go sit on the toilet a bit and think over your spelling.");
        }
    }

    public static void searchMenu3() {
        Scanner myScanner = new Scanner(System.in);
        int counter = 0;

        System.out.println("Type here the team ID you are looking for: ");
        int search = myScanner.nextInt();

        for (int i = 0; i < allTeams.size(); i++) {
            int teamId = allTeams.get(i).getTeamId();
            if (teamId == search) {
                System.out.println("Search hit! | Info: " + allTeams.get(i).getAllDetailedInformation());
                counter++;
            }
        }
        if (counter != 1) {
            System.out.println("We did not find a match, please try again or go home. " +
                    "\nIf you are home? Go sit on the toilet a bit and think over your numbers of the teams.");
        }
    }

    public static void searchMenu4() {
        Scanner myScanner = new Scanner(System.in);
        String search = "";
        int counter = 0;

        System.out.println("Type the name of the gadget you are looking for: ");
        search = myScanner.nextLine();
        search = search.toLowerCase(Locale.ROOT);
        search = search.replace(" ", "");

        for (int i = 0; i < allGadgets.size(); i++) {
            String name = allGadgets.get(i).getGadgetName();
            name = name.toLowerCase(Locale.ROOT);
            name = name.replace(" ", "");
            if (name.contains(search)) {
                System.out.println("Found match! |Info: " + allGadgets.get(i).getAllDetailedInformation());
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("We did not find a match, please try again or go home. " +
                    "\nIf you are home? Go sit on the toilet a bit and think over your numbers of the teams.");
        }
    }

}
