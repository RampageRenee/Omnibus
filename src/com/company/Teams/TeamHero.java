package com.company.Teams;

import com.company.Humans.Hero;

import java.util.ArrayList;

public class TeamHero extends Team {
    public static ArrayList<TeamHero> allHeroTeam = new ArrayList<>();
    private ArrayList<Hero> heroTeam;

    public TeamHero(Integer teamId, String teamName) {
        super(teamId, teamName);
    }

    public ArrayList<Hero> getHeroTeam() {
        return heroTeam;
    }

    public void setHeroTeam(ArrayList<Hero> heroTeam) {
        this.heroTeam = heroTeam;
    }

    @Override
    public String getAllDetailedInformation() {

        String heroes = "";
        for (int i = 0; i < getHeroTeam().size(); i++) {
            heroes = heroes + getHeroTeam().get(i).getName() + "\n";
        }

        return "Team ID: " + teamId + " | Team name: " + teamName + "\nHeroes from this team: \n" + heroes;

    }

    @Override
    public String getAllBasicInformation() {
        return "ID number: " + teamId + " | Name: " + teamName;
    }


}
