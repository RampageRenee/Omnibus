package com.company;

import com.company.Gadgets.Gadget;
import com.company.Gadgets.Lair;
import com.company.Gadgets.Vehicle;
import com.company.Gadgets.Weapon;
import com.company.Humans.*;
import com.company.Teams.TeamHero;
import com.company.Teams.TeamVillain;

import java.util.ArrayList;

import static com.company.Gadgets.Lair.allLairs;
import static com.company.Gadgets.Vehicle.allVehicles;
import static com.company.Gadgets.Weapon.allWeapons;
import static com.company.Humans.Fan.allFans;
import static com.company.Humans.Hero.allHeroes;
import static com.company.Humans.PoliceOfficer.allPoliceOfficers;
import static com.company.Humans.SuperHuman.allSuperHumans;
import static com.company.Humans.Villain.allVillains;
import static com.company.Teams.Team.allTeams;
import static com.company.Teams.TeamHero.allHeroTeam;
import static com.company.Teams.TeamVillain.allVillainTeam;
import static com.company.Gadgets.Gadget.allGadgets;
public class Hardcode {

    public void makeMeTheObjects() {
        //Villains
        Villain joker = new Villain("Joker", 1, "Under Ground", 75, "Destroy Gotham City and the Batman");
        Villain harleyQuinn = new Villain("Harley Quinn", 2, "Under Ground", 88, "Destroy Batman");
        Villain gertrude = new Villain("Gertrude", 3, "Fairyland", 80, "Destroy Fairyland");
        Villain tankGirl = new Villain("Tank Girl", 4, "Australia", 90, "spread venereal diseases");
        Villain subGirl = new Villain("Sub Girl", 5, "Pacific Ocean", 80, "make a movie");
        Villain drDoom = new Villain("Doctor von Doom", 3, "Amsterdam", 84, "Destroy Amsterdam");
        Villain loki = new Villain("Loki", 7, "Somewhere In the Universe", 88, "Becoming King of the Universe");
        Villain rasAlGhul = new Villain("Ras Al Ghul", 9, "China", 94, "Make a super villian");

        //Heroes
        Hero missesUniverse = new Hero("Misses Universe", 168, "The Universe", 757, "Heras de Peras");
        Hero cheeseCake = new Hero("CheeseCake", 133, "Dordtse Plassen", 88, "Cheezy poof keek");
        Hero batman = new Hero("Batman", 123, "Gotham City", 77, "Bruce Wayne");
        Hero goon = new Hero("The Goon", 165, "the town on the edge of Horse Eater's Wood", 75, "The Goon");
        Hero franky = new Hero("Franky", 197, "Horse Eater's Wood", 12, "Franky");
        Hero wonderWoman = new Hero("Wonder Woman", 122, "Bayeux, Normandy", 87, "Diana Prince");
        Hero batGirl = new Hero("BatGirl", 120, "Burnside", 77, "Barbara Gordon");
        Hero thor = new Hero("Thor", 189, "Universe", 98, "Thor");

        //Teams
        TeamVillain team2 = new TeamVillain(2, "Tha Bad Apples of your nightmares!");
        TeamVillain team4 = new TeamVillain(9, "THE HAPPY HELPERS!");
        TeamHero team1 = new TeamHero(1, "WE ARE Team rocket Power");
        TeamHero team3 = new TeamHero(3, "THE OVULATORS!");

        //Fans
        Fan renee = new Fan("Renee", 1);
        Fan ab = new Fan("Ab", 2);
        Fan tarik = new Fan("Tarik", 3);

        //Police Officers
        PoliceOfficer Mike = new PoliceOfficer("Mike", 991, "LAPD", true);
        PoliceOfficer Bosch = new PoliceOfficer("Harry Bosch", 992, "Hollywood Homicide", false);
        PoliceOfficer Jerry = new PoliceOfficer("Jerry Edgar", 993, "FBI", false);
        PoliceOfficer Trench = new PoliceOfficer("Trench", 70, "Los Angeles Police Department", true);
        PoliceOfficer Velvet = new PoliceOfficer("Velvet Templeton", 1, "MI6", true);
        PoliceOfficer Tony = new PoliceOfficer("Tony Chu", 6328, "FDA", false);

        //one liners
        joker.setPersonalOneLiner("Why so serious?");
        harleyQuinn.setPersonalOneLiner("C'mon, y' big basterd!");
        gertrude.setPersonalOneLiner("What's up, MUFFIN FLUFFERS!!?!");
        tankGirl.setPersonalOneLiner("Let's play some Crennis!");
        subGirl.setPersonalOneLiner("BUNDLE!");
        drDoom.setPersonalOneLiner("Nobody can stop me");
        loki.setPersonalOneLiner("Are you who I think you are?");
        rasAlGhul.setPersonalOneLiner("My army of villains is on the way");

        missesUniverse.setPersonalOneLiner("Bow down for your God, ...and gimme cookies");
        cheeseCake.setPersonalOneLiner("Do you like my farts?");
        batman.setPersonalOneLiner("I'm the batman!");
        franky.setPersonalOneLiner("Want a hot dog?");
        wonderWoman.setPersonalOneLiner("There is no time to talk, by Hera, lets get this over with!");
        batGirl.setPersonalOneLiner("I'm bat girl!");
        thor.setPersonalOneLiner("Did someone see my hammer?");

        //ARCH ENEMIES
        missesUniverse.setArchEnemy(tankGirl);
        cheeseCake.setArchEnemy(subGirl);
        batman.setArchEnemy(joker);
        goon.setArchEnemy(gertrude);
        franky.setArchEnemy(rasAlGhul);
        wonderWoman.setArchEnemy(drDoom);
        batGirl.setArchEnemy(harleyQuinn);
        thor.setArchEnemy(loki);

        joker.setArchEnemy(batman);
        harleyQuinn.setArchEnemy(batGirl);
        gertrude.setArchEnemy(goon);
        tankGirl.setArchEnemy(missesUniverse);
        subGirl.setArchEnemy(cheeseCake);
        drDoom.setArchEnemy(wonderWoman);
        loki.setArchEnemy(thor);
        rasAlGhul.setArchEnemy(franky);

        //GADGETS (DONE)
        //Gadgets Joker
        Vehicle jokerMobile = new Vehicle(joker, 233, "Joker Mobile", "Custom made car from the Joker", 220, 2);
        Weapon jokerGun = new Weapon(joker, 223, "JokerBazooka", "Joker Gun Shoots small rockets", "Purple and Green", true, "Steel", 59);
        Lair jokerLair = new Lair(joker, 221, "Jokers Funhouse", "Lair", "Otisburg District, Gotham City");

        ArrayList<Gadget> gadgetsFromJoker = new ArrayList<>();
        gadgetsFromJoker.add(jokerMobile);
        gadgetsFromJoker.add(jokerGun);
        gadgetsFromJoker.add(jokerLair);
        joker.setGadgets(gadgetsFromJoker);
        joker.setPersonalWeapon(jokerGun);

        //Gadgets Harley Quin
        Vehicle quinnSkates = new Vehicle(harleyQuinn, 253, "Quad skates", "Deathly wheels of mayhem", 120, 1);
        Weapon quinnGunn = new Weapon(harleyQuinn, 255, "Harleys Pop Gun", "A gun that pops!", "black", false, "Rubber", 64);
        Weapon quinnMallet = new Weapon(harleyQuinn, 251, "Pretty Lady", "Giant mallet of Destruction", "red and blue", true, "Wood", 103);
        Lair quinnshouse = new Lair(harleyQuinn, 219, "Harley Quins Funhouse", "leathal funhouse", "Otisburg district, Gotham City");

        ArrayList<Gadget> gadgetsFromHarley = new ArrayList<>();
        gadgetsFromHarley.add(quinnSkates);
        gadgetsFromHarley.add(quinnGunn);
        gadgetsFromHarley.add(quinnshouse);
        gadgetsFromHarley.add(quinnMallet);
        harleyQuinn.setGadgets(gadgetsFromHarley);
        harleyQuinn.setPersonalWeapon(quinnMallet);

        //Gadgets Gertrude
        Vehicle gertrudeBike = new Vehicle(gertrude, 235, "Tricycle of Death", "Colourfull trike with an deadly personality on top", 47, 3);
        Weapon gertrudeWeapon = new Weapon(gertrude, 298, "Axe of gertrude", "Axe soaked with the blood of fairy creatures", "dried up blood colour", true, "Metal and wood", 250);
        Lair gertrudesHeart = new Lair(gertrude, 266, "Heart", "Home is where the heart is", "Somewhere over the Rainbow");

        ArrayList<Gadget> gadgetsFromGertrude = new ArrayList<>();
        gadgetsFromGertrude.add(gertrudeBike);
        gadgetsFromGertrude.add(gertrudeWeapon);
        gadgetsFromGertrude.add(gertrudesHeart);
        gertrude.setGadgets(gadgetsFromGertrude);
        gertrude.setPersonalWeapon(gertrudeWeapon);

        //Gadgets Batman
        Vehicle batMobile = new Vehicle(batman, 235, "Bat Mobile", "Super Kick Ass Car with guns", 375, 2);
        Weapon batKnifes = new Weapon(batman, 224, "Batman Throwing Knifes", "Throwing Knifes", "Black", false, "Steel", 87);
        Lair batCave = new Lair(batman, 236, "Cave", "Secret Batman Cave", "In A Cave");

        ArrayList<Gadget> gadgetsFromBatman = new ArrayList<>();
        gadgetsFromBatman.add(batMobile);
        gadgetsFromBatman.add(batKnifes);
        gadgetsFromBatman.add(batCave);
        batman.setGadgets(gadgetsFromBatman);
        batman.setPersonalWeapon(batKnifes);

        //Gadgets tankGirl
        Vehicle tank = new Vehicle(tankGirl, 456, "Hairy Bastard", "the means to get from A to B", 55, 3);
        Weapon rocketFiringCigarettes = new Weapon(tankGirl, 147, "Rocket Firing Cigarettes", "Normal looking cigarettes exploding into 15 rockets when ligting them.", "dirty yello and red", true, "all the explosives", 195);
        Lair sandyHideout = new Lair(tankGirl, 187, "Castle of non-Integrity", "Somewhere sandy, warm and secret", "Australia");

        ArrayList<Gadget> gadgetsFromTankGirl = new ArrayList<>();
        gadgetsFromTankGirl.add(tank);
        gadgetsFromTankGirl.add(rocketFiringCigarettes);
        gadgetsFromTankGirl.add(sandyHideout);
        tankGirl.setGadgets(gadgetsFromTankGirl);
        tankGirl.setPersonalWeapon(rocketFiringCigarettes);

        //Gadgets subGirl
        Vehicle subGirlsSub = new Vehicle(subGirl, 666, "Submarine", "A tank for in the Sea", 188, 20);
        Weapon psycedelicToothBrush = new Weapon(subGirl, 99951, "Psychedelic Toothbrush", "A toothbrush who will make you tripp", "Orange", false, "bamboo", 15);
        Lair portPeachy = new Lair(subGirl, 468, "Port Peachy", "A haven for scum and human poos", "Atlantic Ocean");

        ArrayList<Gadget> subGirlsGadgets = new ArrayList<>();
        subGirlsGadgets.add(subGirlsSub);
        subGirlsGadgets.add(psycedelicToothBrush);
        subGirlsGadgets.add(portPeachy);
        subGirl.setGadgets(subGirlsGadgets);
        subGirl.setPersonalWeapon(psycedelicToothBrush);

        //Gadgets drDoom
        Vehicle silverSurfboard = new Vehicle(drDoom, 789, "Silver Surfboard", "Silver Surfers surfboard", 30, 1);
        Weapon fingertipDarts = new Weapon(drDoom, 164, "Darts", "Darts firing from fingertips", "pink", false, "Metal", 67);
        Lair doomsLair = new Lair(drDoom, 65, "Doom's Lair", "Darth Vaders Helmet turned into an houseboat", "Marnixkade");

        ArrayList<Gadget> drDoomsGadgets = new ArrayList<>();
        drDoomsGadgets.add(silverSurfboard);
        drDoomsGadgets.add(fingertipDarts);
        drDoomsGadgets.add(doomsLair);
        drDoom.setGadgets(drDoomsGadgets);
        drDoom.setPersonalWeapon(fingertipDarts);

        //Gadgets loki
        Vehicle chaRiot = new Vehicle(loki, 1, "Chitauri Chariot", "flying chariot to cause riots", 190, 3);
        Weapon gungnir = new Weapon(loki, 2, "Gungnir", "Odin's spear", "Green", true, "Energy", 687);
        Lair asgard = new Lair(loki, 3, "Asgard", "The city of Gods", "At the end of the Rainbow");

        ArrayList<Gadget> lokiesGadgets = new ArrayList<>();
        lokiesGadgets.add(chaRiot);
        lokiesGadgets.add(gungnir);
        lokiesGadgets.add(asgard);
        loki.setGadgets(lokiesGadgets);
        loki.setPersonalWeapon(gungnir);

        //Gadgets missesUniverse
        Vehicle myLittleGuinneapig = new Vehicle(missesUniverse, 8, "My little Guinneapig", "A orange guinnae pig called Silent Bob to fly around the Universe", 694, 1);
        Weapon puppyface = new Weapon(missesUniverse, 20, "puppyFace", "all whom look at the puppyFace will melt instantly.", "Brown", true, "the force", 687);
        Lair heavenlyCouch = new Lair(missesUniverse, 697, "Heavenly Couch", "A upsidedown couch somewhere in the Universe", "Asgard");

        ArrayList<Gadget> missUniversesGadgets = new ArrayList<>();
        missUniversesGadgets.add(myLittleGuinneapig);
        missUniversesGadgets.add(puppyface);
        missUniversesGadgets.add(heavenlyCouch);
        missesUniverse.setGadgets(missUniversesGadgets);
        missesUniverse.setPersonalWeapon(puppyface);

        //Gadgets Cheesecake
        Vehicle flyingBlanket = new Vehicle(cheeseCake, 5, "Flying Blankie", "A Compfy blanket to bring order to disruptions", 65, 1);
        Weapon ultraSonicCatRepeller = new Weapon(cheeseCake, 379, "Ultra Sonic Cat Repeller", "A sonic device so running isnt nessecery anymore", "Black", false, "Copper", 89);
        Lair fortressOfFluffyButts = new Lair(cheeseCake, 28, "Fortress of Fluffy Butt", "A Fort filled with stuffed companions", "Under the glassTable");

        ArrayList<Gadget> cheesesGadgets = new ArrayList<>();
        cheesesGadgets.add(flyingBlanket);
        cheesesGadgets.add(ultraSonicCatRepeller);
        cheesesGadgets.add(fortressOfFluffyButts);
        cheeseCake.setGadgets(cheesesGadgets);
        cheeseCake.setPersonalWeapon(ultraSonicCatRepeller);

        //Gadgets van RaS aLGhul
        Vehicle legWeagon = new Vehicle(rasAlGhul, 97, "Leg Weagon", "A way to move the head of EVIL", 12, 1);
        Weapon muraMana = new Weapon(rasAlGhul, 31, "MuraMana", "Katana with magic powers", "Gold", true, "Steel", 87);
        Lair painField = new Lair(rasAlGhul, 87, "PainField, South Holland", "Hidden amongst the common folk, he lies underneath.", "Pijnacker");

        ArrayList<Gadget> rasGadgets = new ArrayList<>();
        rasGadgets.add(legWeagon);
        rasGadgets.add(muraMana);
        rasGadgets.add(painField);
        rasAlGhul.setGadgets(rasGadgets);
        rasAlGhul.setPersonalWeapon(muraMana);

        //Gadgets goon
        Vehicle circusWeagon = new Vehicle(goon, 68, "Strurdy Wheels of Fire", "A circus weagon", 45, 8);
        Weapon wrench = new Weapon(goon, 7, "wrenchie", "a wrench I found in the bush", "rusty", true, "Steel", 78);
        Lair nortonsPub = new Lair(goon, 64, "Norton's Pub", "A pub near Horse eaters Wood", "Horse Eaters Wood");

        ArrayList<Gadget> goonsGadgets = new ArrayList<>();
        goonsGadgets.add(circusWeagon);
        goonsGadgets.add(wrench);
        goonsGadgets.add(nortonsPub);
        goon.setGadgets(goonsGadgets);
        goon.setPersonalWeapon(wrench);

        //Gadgets franky
        Vehicle walkingStick = new Vehicle(franky, 977, "Sticky", "a stick to defy the law of gravity", 2, 7);
        Weapon pointyKnife = new Weapon(franky, 741, "pointy", "A pointy dagger to poke the evil away", "Purple", false, "Wood and Stone", 54);

        ArrayList<Gadget> frankiesGadgets = new ArrayList<>();
        frankiesGadgets.add(walkingStick);
        frankiesGadgets.add(pointyKnife);
        frankiesGadgets.add(nortonsPub);
        franky.setGadgets(frankiesGadgets);
        franky.setPersonalWeapon(pointyKnife);
        //Gadgets wonderwoman
        Vehicle invisablePlane = new Vehicle(wonderWoman, 951, "Invisable PLane", "A Jet for Space travel", 9536777, 2);
        Weapon princesTiara = new Weapon(wonderWoman, 975, "Wonder womans Tiara", "a tiara boomerang adorned with a red star", "Gold and Red", false, "Gold from Pradise Island", 542);
        Lair ettaCandysPlace = new Lair(wonderWoman, 743, "Candy's place", "Etta Candy's appartment", "Boston");

        ArrayList<Gadget> wonderWomansGadgets = new ArrayList<>();
        wonderWomansGadgets.add(invisablePlane);
        wonderWomansGadgets.add(princesTiara);
        wonderWomansGadgets.add(ettaCandysPlace);
        wonderWoman.setGadgets(wonderWomansGadgets);
        wonderWoman.setPersonalWeapon(princesTiara);

        //Gadgets batgirl
        Weapon fruitBat = new Weapon(batGirl, 140, "fruitBat", "A Japanese Batgirl", "Black", true, "Flesh and Blood", 97);
        Lair burnside = new Lair(batGirl, 320, "Burnside", "a savehaven near the river", "Gotham");

        ArrayList<Gadget> batGirlsGadgets = new ArrayList<>();
        batGirlsGadgets.add(batMobile);
        batGirlsGadgets.add(fruitBat);
        batGirlsGadgets.add(burnside);
        batGirl.setGadgets(batGirlsGadgets);
        batGirl.setPersonalWeapon(fruitBat);

        //thors Gadgets
        Vehicle flyingChariot = new Vehicle(thor, 963, "Flying Chariot", "A flying chariot pulled by Tanngrisnir and Tanngnjostr", 6544400, 3);
        Weapon mjolnir = new Weapon(thor, 777, "Mjolnir", "Hammer of Thor", "Silver", true, "Uru metal", 451);
        Lair tonsbergCastle = new Lair(thor, 1403, "Tonsberg Castle", "a Castle in Tonsberg", "Norway");

        ArrayList<Gadget> thorsGagets = new ArrayList<>();
        thorsGagets.add(flyingChariot);
        thorsGagets.add(mjolnir);
        thorsGagets.add(tonsbergCastle);
        thor.setGadgets(thorsGagets);
        thor.setPersonalWeapon(mjolnir);

        //TEAMS
        //Hero Team 1
        ArrayList<Hero> heroTeam1 = new ArrayList<>();
        heroTeam1.add(batman);
        heroTeam1.add(goon);
        heroTeam1.add(missesUniverse);
        heroTeam1.add(cheeseCake);
        team1.setHeroTeam(heroTeam1);

        //Hero Team 3

        ArrayList<Hero> heroTeam3 = new ArrayList<>();
        heroTeam3.add(wonderWoman);
        heroTeam3.add(batGirl);
        heroTeam3.add(franky);
        heroTeam3.add(thor);
        team3.setHeroTeam(heroTeam3);

        //Villain Team 2

        ArrayList<Villain> villianTeam2 = new ArrayList<>();
        villianTeam2.add(tankGirl);
        villianTeam2.add(joker);
        villianTeam2.add(subGirl);
        villianTeam2.add(harleyQuinn);
        team2.setVillainTeam(villianTeam2);

        //Villain Team 4

        ArrayList<Villain> villianTeam4 = new ArrayList<>();
        villianTeam4.add(gertrude);
        villianTeam4.add(drDoom);
        villianTeam4.add(loki);
        villianTeam4.add(rasAlGhul);
        team4.setVillainTeam(villianTeam4);

        //NOTEBOOKS
        //NoteBook of Joker
        ArrayList<Hero> notebookOfJoker = new ArrayList<>();  // ??
        notebookOfJoker.add(batman);
        notebookOfJoker.add(wonderWoman);
        notebookOfJoker.add(goon);
        joker.setNotebookOfVillain(notebookOfJoker);

        //NoteBook of harleyQuin
        ArrayList<Hero> notebookOfHarley = new ArrayList<>();
        notebookOfHarley.add(franky);
        notebookOfHarley.add(batGirl);
        notebookOfHarley.add(wonderWoman);
        harleyQuinn.setNotebookOfVillain(notebookOfHarley);

        //NoteBook of Batman
        ArrayList<Villain> notebookOfBatman = new ArrayList<>();
        notebookOfBatman.add(joker);
        notebookOfBatman.add(harleyQuinn);
        batman.setNotebookOfHero(notebookOfBatman);

        //Notebook missesUniverse
        ArrayList<Villain> notebookOfMissUniverse = new ArrayList<>();
        notebookOfMissUniverse.add(joker);
        notebookOfMissUniverse.add(rasAlGhul);
        missesUniverse.setNotebookOfHero(notebookOfMissUniverse);

        //Notebook Cheesecake
        ArrayList<Villain> notebookOfCheese = new ArrayList<>();
        notebookOfCheese.add(rasAlGhul);
        notebookOfCheese.add(joker);
        cheeseCake.setNotebookOfHero(notebookOfCheese);

        //Notebook Gertrude
        ArrayList<Hero> notebookOfGertrude = new ArrayList<>();
        notebookOfGertrude.add(wonderWoman);
        notebookOfGertrude.add(goon);
        notebookOfGertrude.add(thor);
        gertrude.setNotebookOfVillain(notebookOfGertrude);

        //Notebook tankGirl
        ArrayList<Hero> notebookOfTankGirl = new ArrayList<>();
        notebookOfTankGirl.add(franky);
        notebookOfTankGirl.add(wonderWoman);
        notebookOfTankGirl.add(batGirl);
        notebookOfTankGirl.add(missesUniverse);
        tankGirl.setNotebookOfVillain(notebookOfTankGirl);

        //Notebook subGirl
        ArrayList<Hero> notebookOfSubGirl = new ArrayList<>();
        notebookOfSubGirl.add(batman);
        notebookOfSubGirl.add(thor);
        notebookOfSubGirl.add(goon);
        subGirl.setNotebookOfVillain(notebookOfSubGirl);

        //Notebook drDoom
        ArrayList<Hero> notebookOfDrDoom = new ArrayList<>();
        notebookOfDrDoom.add(missesUniverse);
        notebookOfDrDoom.add(cheeseCake);
        notebookOfDrDoom.add(wonderWoman);
        drDoom.setNotebookOfVillain(notebookOfDrDoom);

        //Notebook loki
        ArrayList<Hero> notebookOfLoki = new ArrayList<>();
        notebookOfLoki.add(thor);
        notebookOfLoki.add(wonderWoman);
        notebookOfLoki.add(batman);
        notebookOfLoki.add(batGirl);
        loki.setNotebookOfVillain(notebookOfLoki);

        //Notebook RasAlGhul
        ArrayList<Hero> notebookOfRasAlGhul = new ArrayList<>();
        notebookOfRasAlGhul.add(batGirl);
        notebookOfRasAlGhul.add(thor);
        rasAlGhul.setNotebookOfVillain(notebookOfRasAlGhul);

        //Notebook Goon
        ArrayList<Villain> notebookOfGoon = new ArrayList<>();
        notebookOfGoon.add(joker);
        notebookOfGoon.add(loki);
        notebookOfGoon.add(harleyQuinn);
        goon.setNotebookOfHero(notebookOfGoon);

        //Notebook Franky
        ArrayList<Villain> notebookOfFranky = new ArrayList<>();
        notebookOfFranky.add(tankGirl);
        notebookOfFranky.add(subGirl);
        notebookOfFranky.add(rasAlGhul);
        franky.setNotebookOfHero(notebookOfFranky);

        //Notebook Wonderwoman
        ArrayList<Villain> notebookOfWonderwoman = new ArrayList<>();
        notebookOfWonderwoman.add(joker);
        notebookOfWonderwoman.add(harleyQuinn);
        notebookOfWonderwoman.add(drDoom);
        wonderWoman.setNotebookOfHero(notebookOfWonderwoman);

        //Notebook batgirl
        ArrayList<Villain> notebookOfBatGirl = new ArrayList<>();
        notebookOfBatGirl.add(harleyQuinn);
        notebookOfBatGirl.add(gertrude);
        notebookOfBatGirl.add(subGirl);
        batGirl.setNotebookOfHero(notebookOfBatGirl);

        //Notebook Thor
        ArrayList<Villain> notebookOfThor = new ArrayList<>();
        notebookOfThor.add(loki);
        notebookOfThor.add(joker);
        notebookOfThor.add(drDoom);
        notebookOfThor.add(rasAlGhul);
        thor.setNotebookOfHero(notebookOfThor);

        // FAN'S
        ArrayList<SuperHuman> reneeIdols = new ArrayList<>();
        reneeIdols.add(goon);
        reneeIdols.add(subGirl);
        reneeIdols.add(gertrude);
        renee.setIdols(reneeIdols);


        ArrayList<SuperHuman> abIdols = new ArrayList<>();
        abIdols.add(batman);
        abIdols.add(joker);
        abIdols.add(drDoom);
        abIdols.add(thor);
        abIdols.add(loki);
        ab.setIdols(abIdols);

        ArrayList<SuperHuman> tarikIdols = new ArrayList<>();
        tarikIdols.add(gertrude);
        tarikIdols.add(tankGirl);
        tarikIdols.add(subGirl);
        tarikIdols.add(joker);
        tarik.setIdols(tarikIdols);

        //HERO TEAMS
        allHeroTeam.add(team1);
        allHeroTeam.add(team3);

        //VILLAIN TEAMS
        allVillainTeam.add(team2);
        allVillainTeam.add(team4);

        //ALL TEAMS
        allTeams.add(team1);
        allTeams.add(team2);
        allTeams.add(team3);
        allTeams.add(team4);

        //HEROES&VILLAINS LIST
        allVillains.add(joker);
        allVillains.add(harleyQuinn);
        allVillains.add(gertrude);
        allVillains.add(tankGirl);
        allVillains.add(subGirl);
        allVillains.add(drDoom);
        allVillains.add(loki);
        allVillains.add(rasAlGhul);

        allHeroes.add(missesUniverse);
        allHeroes.add(cheeseCake);
        allHeroes.add(batman);
        allHeroes.add(goon);
        allHeroes.add(franky);
        allHeroes.add(wonderWoman);
        allHeroes.add(batGirl);
        allHeroes.add(thor);

        allSuperHumans.addAll(allHeroes);
        allSuperHumans.addAll(allVillains);

        //Police Officers
        allPoliceOfficers.add(Mike);
        allPoliceOfficers.add(Bosch);
        allPoliceOfficers.add(Jerry);
        allPoliceOfficers.add(Trench);
        allPoliceOfficers.add(Velvet);
        allPoliceOfficers.add(Tony);

        //FANS  DETAILS LIST()
        allFans.add(renee);
        allFans.add(ab);
        allFans.add(tarik);

        //WEAPONS  DETAILS LIST()
        allWeapons.add(jokerGun);
        allWeapons.add(quinnMallet);
        allWeapons.add(quinnGunn);
        allWeapons.add(gertrudeWeapon);
        allWeapons.add(batKnifes);
        allWeapons.add(rocketFiringCigarettes);
        allWeapons.add(psycedelicToothBrush);
        allWeapons.add(fingertipDarts);
        allWeapons.add(gungnir);
        allWeapons.add(puppyface);
        allWeapons.add(ultraSonicCatRepeller);
        allWeapons.add(muraMana);
        allWeapons.add(wrench);
        allWeapons.add(pointyKnife);
        allWeapons.add(princesTiara);
        allWeapons.add(fruitBat);
        allWeapons.add(mjolnir);

        //VEHICLES  DETAILS LIST()
        allVehicles.add(jokerMobile);
        allVehicles.add(quinnSkates);
        allVehicles.add(gertrudeBike);
        allVehicles.add(batMobile);
        allVehicles.add(tank);
        allVehicles.add(subGirlsSub);
        allVehicles.add(silverSurfboard);
        allVehicles.add(chaRiot);
        allVehicles.add(myLittleGuinneapig);
        allVehicles.add(flyingBlanket);
        allVehicles.add(legWeagon);
        allVehicles.add(circusWeagon);
        allVehicles.add(walkingStick);
        allVehicles.add(invisablePlane);
        allVehicles.add(flyingChariot);

        //LAIRS  DETAILS LIST()
        allLairs.add(jokerLair);
        allLairs.add(quinnshouse);
        allLairs.add(gertrudesHeart);
        allLairs.add(batCave);
        allLairs.add(sandyHideout);
        allLairs.add(portPeachy);
        allLairs.add(doomsLair);
        allLairs.add(asgard);
        allLairs.add(heavenlyCouch);
        allLairs.add(fortressOfFluffyButts);
        allLairs.add(painField);
        allLairs.add(nortonsPub);
        allLairs.add(ettaCandysPlace);
        allLairs.add(burnside);
        allLairs.add(tonsbergCastle);

        allGadgets.addAll(allWeapons);
        allGadgets.addAll(allVehicles);
        allGadgets.addAll(allLairs);

    }
}

